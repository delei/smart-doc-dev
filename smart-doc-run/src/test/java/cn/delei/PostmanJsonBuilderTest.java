package cn.delei;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.power.common.util.FileUtil;
import com.power.doc.builder.ApiDocBuilder;
import com.power.doc.builder.HtmlApiDocBuilder;
import com.power.doc.builder.PostmanJsonBuilder;
import com.power.doc.builder.openapi.OpenApiBuilder;
import com.power.doc.model.ApiConfig;
import com.power.doc.model.SourceCodePath;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;

public class PostmanJsonBuilderTest {

    public final static Gson GSON = new GsonBuilder().addDeserializationExclusionStrategy(new ExclusionStrategy() {
        @Override
        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
            return false;
        }

        @Override
        public boolean shouldSkipClass(Class<?> aClass) {
            return false;
        }
    }).create();


    @Test
    public void testBuildPostmanCollection(){
//        ApiConfig config = ApiConfig();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        String data = FileUtil.getFileContent(loader.getResourceAsStream("smart-doc.json"));
        ApiConfig apiConfig = GSON.fromJson(data, ApiConfig.class);
        apiConfig.setJarSourcePaths(SourceCodePath.builder()
                .setPath("/Users/delei/Workspaces/GitHub/smart-doc-dev/smart-doc-example-spring-boot/target/smart-doc-example-spring-boot-2.7.7-sources.jar"));
        HtmlApiDocBuilder.buildApiDoc(apiConfig);
//        PostmanJsonBuilder.buildPostmanCollection(apiConfig);
    }
}
