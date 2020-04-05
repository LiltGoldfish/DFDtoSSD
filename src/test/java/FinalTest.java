import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lt.entity.ChildTree;
import com.lt.entity.DFD;
import com.lt.entity.OLGraph;
import com.lt.utils.BeanToOLGraph;
import com.lt.utils.JsonToBean;
import com.lt.utils.OLGraphToTree;
import com.lt.utils.TreeToJson;
import org.junit.Test;

import java.io.*;

public class FinalTest {
    @Test
    public void Test() throws IOException {
        File file = new File("D:\\My Download\\测试用例5.json");
        DFD dfd = JsonToBean.jsonToBean(file);

        OLGraph graph = BeanToOLGraph.getOLGraph(dfd);
        ChildTree tree = OLGraphToTree.getTree(graph);
        DFD jsonEntity = TreeToJson.getJson(tree);

        ObjectMapper mapper = new ObjectMapper();
        OutputStream outputStream= new FileOutputStream(new File("D:\\My Download\\result5.json"));
        mapper.writeValue(outputStream, jsonEntity);
    }
}
