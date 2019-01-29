package pokenshin.handler;

import com.pokenshin.handler.AwsHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

class AwsHandlerTest {
    AwsHandler handler;
    @BeforeEach
    void setUp() {
         handler = new AwsHandler();
    }

    @Test
    void handleRequest() throws IOException {
        String json = "{\"timestamp\":1548091740207,\"webhookEvent\":\"jira:issue_updated\",\"issue_event_type_name\":\"issue_generic\",\"user\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/user?accountId=5af2fe4bbabc232defd9b3f2\",\"name\":\"marielle.batista\",\"key\":\"marielle.batista\",\"accountId\":\"5af2fe4bbabc232defd9b3f2\",\"emailAddress\":\"marielle.batista@kestraa.com\",\"avatarUrls\":{\"48x48\":\"https://avatar-cdn.atlassian.com/e8af6d51677db7af7f06ca12c7f700fc?s=48&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe8af6d51677db7af7f06ca12c7f700fc%3Fd%3Dmm%26s%3D48%26noRedirect%3Dtrue\",\"24x24\":\"https://avatar-cdn.atlassian.com/e8af6d51677db7af7f06ca12c7f700fc?s=24&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe8af6d51677db7af7f06ca12c7f700fc%3Fd%3Dmm%26s%3D24%26noRedirect%3Dtrue\",\"16x16\":\"https://avatar-cdn.atlassian.com/e8af6d51677db7af7f06ca12c7f700fc?s=16&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe8af6d51677db7af7f06ca12c7f700fc%3Fd%3Dmm%26s%3D16%26noRedirect%3Dtrue\",\"32x32\":\"https://avatar-cdn.atlassian.com/e8af6d51677db7af7f06ca12c7f700fc?s=32&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe8af6d51677db7af7f06ca12c7f700fc%3Fd%3Dmm%26s%3D32%26noRedirect%3Dtrue\"},\"displayName\":\"Marielle Batista\",\"active\":true,\"timeZone\":\"America/Sao_Paulo\"},\"issue\":{\"id\":\"13472\",\"self\":\"https://kestraa.atlassian.net/rest/api/2/issue/13472\",\"key\":\"KES-2357\",\"fields\":{\"issuetype\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/issuetype/10001\",\"id\":\"10001\",\"description\":\"Stories track functionality or features expressed as user goals.\",\"iconUrl\":\"https://kestraa.atlassian.net/secure/viewavatar?size=xsmall&avatarId=10315&avatarType=issuetype\",\"name\":\"Story\",\"subtask\":false,\"avatarId\":10315},\"timespent\":null,\"customfield_10030\":null,\"customfield_10031\":\"- Adicionar a coluna com o nome e as informações corretas;\\r\\n- Colocar a máscara da descrição no número da LI;\\r\\n- Colocar a nova tabela componentizada com as features de search e paginação;\\r\\n- Ao digitar um termo, a tabela deve ser filtrada de acordo com o mesmo, sendo o termo digitado uma PO ou uma LI;\\r\\n- Caso não seja encontrado nenhum resultado, devemos exibir a mensagem \\\"No results found\\\"\",\"project\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/project/10051\",\"id\":\"10051\",\"key\":\"KES\",\"name\":\"Kestraa\",\"projectTypeKey\":\"software\",\"avatarUrls\":{\"48x48\":\"https://kestraa.atlassian.net/secure/projectavatar?pid=10051&avatarId=10518\",\"24x24\":\"https://kestraa.atlassian.net/secure/projectavatar?size=small&pid=10051&avatarId=10518\",\"16x16\":\"https://kestraa.atlassian.net/secure/projectavatar?size=xsmall&pid=10051&avatarId=10518\",\"32x32\":\"https://kestraa.atlassian.net/secure/projectavatar?size=medium&pid=10051&avatarId=10518\"},\"projectCategory\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/projectCategory/10001\",\"id\":\"10001\",\"description\":\"Feature Development Projects\",\"name\":\"Features\"}},\"customfield_10032\":null,\"fixVersions\":[{\"self\":\"https://kestraa.atlassian.net/rest/api/2/version/10056\",\"id\":\"10056\",\"description\":\"\",\"name\":\"2019.1\",\"archived\":false,\"released\":false,\"releaseDate\":\"2019-01-24\"}],\"customfield_10033\":null,\"aggregatetimespent\":null,\"resolution\":null,\"customfield_10035\":null,\"customfield_10036\":null,\"customfield_10037\":null,\"customfield_10028\":null,\"customfield_10029\":[],\"resolutiondate\":null,\"workratio\":-1,\"watches\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/issue/KES-2357/watchers\",\"watchCount\":5,\"isWatching\":true},\"lastViewed\":\"2019-01-21T15:27:51.376-0200\",\"created\":\"2019-01-08T12:15:53.409-0200\",\"priority\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/priority/3\",\"iconUrl\":\"https://kestraa.atlassian.net/images/icons/priorities/medium.svg\",\"name\":\"Medium\",\"id\":\"3\"},\"customfield_10025\":null,\"labels\":[\"Documents\"],\"customfield_10026\":null,\"customfield_10018\":null,\"aggregatetimeoriginalestimate\":null,\"timeestimate\":null,\"versions\":[],\"issuelinks\":[],\"assignee\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/user?accountId=5bf57fbae93aba152173e6bc\",\"name\":\"belchior.oliveira\",\"key\":\"belchior.oliveira\",\"accountId\":\"5bf57fbae93aba152173e6bc\",\"emailAddress\":\"belchior.oliveira@kestraa.com\",\"avatarUrls\":{\"48x48\":\"https://avatar-cdn.atlassian.com/e1e8fd28918147e35b7de952ebddf164?s=48&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe1e8fd28918147e35b7de952ebddf164%3Fd%3Dmm%26s%3D48%26noRedirect%3Dtrue\",\"24x24\":\"https://avatar-cdn.atlassian.com/e1e8fd28918147e35b7de952ebddf164?s=24&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe1e8fd28918147e35b7de952ebddf164%3Fd%3Dmm%26s%3D24%26noRedirect%3Dtrue\",\"16x16\":\"https://avatar-cdn.atlassian.com/e1e8fd28918147e35b7de952ebddf164?s=16&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe1e8fd28918147e35b7de952ebddf164%3Fd%3Dmm%26s%3D16%26noRedirect%3Dtrue\",\"32x32\":\"https://avatar-cdn.atlassian.com/e1e8fd28918147e35b7de952ebddf164?s=32&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe1e8fd28918147e35b7de952ebddf164%3Fd%3Dmm%26s%3D32%26noRedirect%3Dtrue\"},\"displayName\":\"Belchior Oliveira\",\"active\":true,\"timeZone\":\"America/Sao_Paulo\"},\"updated\":\"2019-01-21T15:29:00.169-0200\",\"status\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/status/10028\",\"description\":\"This status is managed internally by Jira Software\",\"iconUrl\":\"https://kestraa.atlassian.net/\",\"name\":\"Ready to QA\",\"id\":\"10028\",\"statusCategory\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/statuscategory/3\",\"id\":3,\"key\":\"done\",\"colorName\":\"green\",\"name\":\"Complete\"}},\"components\":[],\"timeoriginalestimate\":null,\"description\":\"O objetivo desta história é adicionar a coluna PO Number entre as colunas import license e registration date já no modelo novo com a tabela componentizada).\\r\\n\\r\\nAlém disso, é preciso colocar a máscara no número da LI (coluna Import License) AA/NNNNNNN-D.\\r\\n\\r\\nO objetivo desta história é fazer um search pelo número da PO na tabela de Import License.\\r\\nA busca deve ser global.\\r\\nO search deve ser feito na mesma barra de busca que já existe hoje.\\r\\nCaso não seja encontrado nenhum resultado, devemos exibir a mensagem \\\"No results found\\\".\",\"customfield_10010\":[\"com.atlassian.greenhopper.service.sprint.Sprint@346431ec[id=102,rapidViewId=79,state=ACTIVE,name=Document Sprint 2,goal=,startDate=2019-01-08T18:00:00.000Z,endDate=2019-01-22T18:00:00.000Z,completeDate=<null>,sequence=102]\"],\"customfield_10011\":\"0|i00et0:yxvb\",\"customfield_10012\":\"2019-01-08T15:08:40.221-0200\",\"customfield_10013\":null,\"customfield_10014\":5.0,\"timetracking\":{},\"security\":null,\"customfield_10008\":\"KES-2369\",\"aggregatetimeestimate\":null,\"attachment\":[{\"self\":\"https://kestraa.atlassian.net/rest/api/2/attachment/11294\",\"id\":\"11294\",\"filename\":\"image-20190121-172705.png\",\"author\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/user?accountId=5af2fe4bbabc232defd9b3f2\",\"name\":\"marielle.batista\",\"key\":\"marielle.batista\",\"accountId\":\"5af2fe4bbabc232defd9b3f2\",\"emailAddress\":\"marielle.batista@kestraa.com\",\"avatarUrls\":{\"48x48\":\"https://avatar-cdn.atlassian.com/e8af6d51677db7af7f06ca12c7f700fc?s=48&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe8af6d51677db7af7f06ca12c7f700fc%3Fd%3Dmm%26s%3D48%26noRedirect%3Dtrue\",\"24x24\":\"https://avatar-cdn.atlassian.com/e8af6d51677db7af7f06ca12c7f700fc?s=24&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe8af6d51677db7af7f06ca12c7f700fc%3Fd%3Dmm%26s%3D24%26noRedirect%3Dtrue\",\"16x16\":\"https://avatar-cdn.atlassian.com/e8af6d51677db7af7f06ca12c7f700fc?s=16&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe8af6d51677db7af7f06ca12c7f700fc%3Fd%3Dmm%26s%3D16%26noRedirect%3Dtrue\",\"32x32\":\"https://avatar-cdn.atlassian.com/e8af6d51677db7af7f06ca12c7f700fc?s=32&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe8af6d51677db7af7f06ca12c7f700fc%3Fd%3Dmm%26s%3D32%26noRedirect%3Dtrue\"},\"displayName\":\"Marielle Batista\",\"active\":true,\"timeZone\":\"America/Sao_Paulo\"},\"created\":\"2019-01-21T15:28:51.180-0200\",\"size\":120521,\"mimeType\":\"image/png\",\"content\":\"https://kestraa.atlassian.net/secure/attachment/11294/image-20190121-172705.png\",\"thumbnail\":\"https://kestraa.atlassian.net/secure/thumbnail/11294/image-20190121-172705.png\"},{\"self\":\"https://kestraa.atlassian.net/rest/api/2/attachment/11206\",\"id\":\"11206\",\"filename\":\"screenshot-1.png\",\"author\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/user?accountId=5ae1cbc37b44642d39d33b8d\",\"name\":\"stefany.simoes\",\"key\":\"stefany.simoes\",\"accountId\":\"5ae1cbc37b44642d39d33b8d\",\"emailAddress\":\"stefany.simoes@kestraa.com\",\"avatarUrls\":{\"48x48\":\"https://avatar-cdn.atlassian.com/3e29736d37968f40e06dec34e188c57f?s=48&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2F3e29736d37968f40e06dec34e188c57f%3Fd%3Dmm%26s%3D48%26noRedirect%3Dtrue\",\"24x24\":\"https://avatar-cdn.atlassian.com/3e29736d37968f40e06dec34e188c57f?s=24&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2F3e29736d37968f40e06dec34e188c57f%3Fd%3Dmm%26s%3D24%26noRedirect%3Dtrue\",\"16x16\":\"https://avatar-cdn.atlassian.com/3e29736d37968f40e06dec34e188c57f?s=16&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2F3e29736d37968f40e06dec34e188c57f%3Fd%3Dmm%26s%3D16%26noRedirect%3Dtrue\",\"32x32\":\"https://avatar-cdn.atlassian.com/3e29736d37968f40e06dec34e188c57f?s=32&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2F3e29736d37968f40e06dec34e188c57f%3Fd%3Dmm%26s%3D32%26noRedirect%3Dtrue\"},\"displayName\":\"Stefany Lucchesi Simões\",\"active\":true,\"timeZone\":\"America/Sao_Paulo\"},\"created\":\"2019-01-08T12:16:41.427-0200\",\"size\":76709,\"mimeType\":\"image/png\",\"content\":\"https://kestraa.atlassian.net/secure/attachment/11206/screenshot-1.png\",\"thumbnail\":\"https://kestraa.atlassian.net/secure/thumbnail/11206/screenshot-1.png\"},{\"self\":\"https://kestraa.atlassian.net/rest/api/2/attachment/11283\",\"id\":\"11283\",\"filename\":\"screenshot-2.png\",\"author\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/user?accountId=5af2fe4bbabc232defd9b3f2\",\"name\":\"marielle.batista\",\"key\":\"marielle.batista\",\"accountId\":\"5af2fe4bbabc232defd9b3f2\",\"emailAddress\":\"marielle.batista@kestraa.com\",\"avatarUrls\":{\"48x48\":\"https://avatar-cdn.atlassian.com/e8af6d51677db7af7f06ca12c7f700fc?s=48&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe8af6d51677db7af7f06ca12c7f700fc%3Fd%3Dmm%26s%3D48%26noRedirect%3Dtrue\",\"24x24\":\"https://avatar-cdn.atlassian.com/e8af6d51677db7af7f06ca12c7f700fc?s=24&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe8af6d51677db7af7f06ca12c7f700fc%3Fd%3Dmm%26s%3D24%26noRedirect%3Dtrue\",\"16x16\":\"https://avatar-cdn.atlassian.com/e8af6d51677db7af7f06ca12c7f700fc?s=16&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe8af6d51677db7af7f06ca12c7f700fc%3Fd%3Dmm%26s%3D16%26noRedirect%3Dtrue\",\"32x32\":\"https://avatar-cdn.atlassian.com/e8af6d51677db7af7f06ca12c7f700fc?s=32&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Fe8af6d51677db7af7f06ca12c7f700fc%3Fd%3Dmm%26s%3D32%26noRedirect%3Dtrue\"},\"displayName\":\"Marielle Batista\",\"active\":true,\"timeZone\":\"America/Sao_Paulo\"},\"created\":\"2019-01-18T15:24:16.827-0200\",\"size\":245090,\"mimeType\":\"image/png\",\"content\":\"https://kestraa.atlassian.net/secure/attachment/11283/screenshot-2.png\",\"thumbnail\":\"https://kestraa.atlassian.net/secure/thumbnail/11283/screenshot-2.png\"},{\"self\":\"https://kestraa.atlassian.net/rest/api/2/attachment/11287\",\"id\":\"11287\",\"filename\":\"screenshot-6.png\",\"author\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/user?accountId=5b636a14b464c72d8d33984e\",\"name\":\"murilo.gasparetto\",\"key\":\"5b636a14b464c72d8d33984e\",\"accountId\":\"5b636a14b464c72d8d33984e\",\"emailAddress\":\"murilo.gasparetto@kestraa.com\",\"avatarUrls\":{\"48x48\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=48&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D48%26noRedirect%3Dtrue\",\"24x24\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=24&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D24%26noRedirect%3Dtrue\",\"16x16\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=16&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D16%26noRedirect%3Dtrue\",\"32x32\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=32&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D32%26noRedirect%3Dtrue\"},\"displayName\":\"Murilo Gasparetto\",\"active\":true,\"timeZone\":\"America/Sao_Paulo\"},\"created\":\"2019-01-18T15:53:31.680-0200\",\"size\":459459,\"mimeType\":\"image/png\",\"content\":\"https://kestraa.atlassian.net/secure/attachment/11287/screenshot-6.png\",\"thumbnail\":\"https://kestraa.atlassian.net/secure/thumbnail/11287/screenshot-6.png\"},{\"self\":\"https://kestraa.atlassian.net/rest/api/2/attachment/11288\",\"id\":\"11288\",\"filename\":\"screenshot-7.png\",\"author\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/user?accountId=5b636a14b464c72d8d33984e\",\"name\":\"murilo.gasparetto\",\"key\":\"5b636a14b464c72d8d33984e\",\"accountId\":\"5b636a14b464c72d8d33984e\",\"emailAddress\":\"murilo.gasparetto@kestraa.com\",\"avatarUrls\":{\"48x48\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=48&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D48%26noRedirect%3Dtrue\",\"24x24\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=24&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D24%26noRedirect%3Dtrue\",\"16x16\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=16&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D16%26noRedirect%3Dtrue\",\"32x32\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=32&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D32%26noRedirect%3Dtrue\"},\"displayName\":\"Murilo Gasparetto\",\"active\":true,\"timeZone\":\"America/Sao_Paulo\"},\"created\":\"2019-01-18T16:08:27.182-0200\",\"size\":7449,\"mimeType\":\"image/png\",\"content\":\"https://kestraa.atlassian.net/secure/attachment/11288/screenshot-7.png\",\"thumbnail\":\"https://kestraa.atlassian.net/secure/thumbnail/11288/screenshot-7.png\"},{\"self\":\"https://kestraa.atlassian.net/rest/api/2/attachment/11289\",\"id\":\"11289\",\"filename\":\"screenshot-8.png\",\"author\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/user?accountId=5b636a14b464c72d8d33984e\",\"name\":\"murilo.gasparetto\",\"key\":\"5b636a14b464c72d8d33984e\",\"accountId\":\"5b636a14b464c72d8d33984e\",\"emailAddress\":\"murilo.gasparetto@kestraa.com\",\"avatarUrls\":{\"48x48\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=48&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D48%26noRedirect%3Dtrue\",\"24x24\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=24&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D24%26noRedirect%3Dtrue\",\"16x16\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=16&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D16%26noRedirect%3Dtrue\",\"32x32\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=32&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D32%26noRedirect%3Dtrue\"},\"displayName\":\"Murilo Gasparetto\",\"active\":true,\"timeZone\":\"America/Sao_Paulo\"},\"created\":\"2019-01-18T16:09:27.567-0200\",\"size\":7496,\"mimeType\":\"image/png\",\"content\":\"https://kestraa.atlassian.net/secure/attachment/11289/screenshot-8.png\",\"thumbnail\":\"https://kestraa.atlassian.net/secure/thumbnail/11289/screenshot-8.png\"},{\"self\":\"https://kestraa.atlassian.net/rest/api/2/attachment/11290\",\"id\":\"11290\",\"filename\":\"screenshot-9.png\",\"author\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/user?accountId=5b636a14b464c72d8d33984e\",\"name\":\"murilo.gasparetto\",\"key\":\"5b636a14b464c72d8d33984e\",\"accountId\":\"5b636a14b464c72d8d33984e\",\"emailAddress\":\"murilo.gasparetto@kestraa.com\",\"avatarUrls\":{\"48x48\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=48&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D48%26noRedirect%3Dtrue\",\"24x24\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=24&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D24%26noRedirect%3Dtrue\",\"16x16\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=16&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D16%26noRedirect%3Dtrue\",\"32x32\":\"https://avatar-cdn.atlassian.com/fc6921d86cfb7ab9fa36d8df17ab9604?s=32&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2Ffc6921d86cfb7ab9fa36d8df17ab9604%3Fd%3Dmm%26s%3D32%26noRedirect%3Dtrue\"},\"displayName\":\"Murilo Gasparetto\",\"active\":true,\"timeZone\":\"America/Sao_Paulo\"},\"created\":\"2019-01-18T16:09:51.061-0200\",\"size\":7579,\"mimeType\":\"image/png\",\"content\":\"https://kestraa.atlassian.net/secure/attachment/11290/screenshot-9.png\",\"thumbnail\":\"https://kestraa.atlassian.net/secure/thumbnail/11290/screenshot-9.png\"}],\"customfield_10009\":{\"hasEpicLinkFieldDependency\":false,\"showField\":false,\"nonEditableReason\":{\"reason\":\"EPIC_LINK_SHOULD_BE_USED\",\"message\":\"To set an epic as the parent, use the epic link instead\"}},\"summary\":\"Eu, como Rebecca, desejo ver a coluna PO Number na tabela de Import License.\",\"creator\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/user?accountId=5ae1cbc37b44642d39d33b8d\",\"name\":\"stefany.simoes\",\"key\":\"stefany.simoes\",\"accountId\":\"5ae1cbc37b44642d39d33b8d\",\"emailAddress\":\"stefany.simoes@kestraa.com\",\"avatarUrls\":{\"48x48\":\"https://avatar-cdn.atlassian.com/3e29736d37968f40e06dec34e188c57f?s=48&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2F3e29736d37968f40e06dec34e188c57f%3Fd%3Dmm%26s%3D48%26noRedirect%3Dtrue\",\"24x24\":\"https://avatar-cdn.atlassian.com/3e29736d37968f40e06dec34e188c57f?s=24&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2F3e29736d37968f40e06dec34e188c57f%3Fd%3Dmm%26s%3D24%26noRedirect%3Dtrue\",\"16x16\":\"https://avatar-cdn.atlassian.com/3e29736d37968f40e06dec34e188c57f?s=16&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2F3e29736d37968f40e06dec34e188c57f%3Fd%3Dmm%26s%3D16%26noRedirect%3Dtrue\",\"32x32\":\"https://avatar-cdn.atlassian.com/3e29736d37968f40e06dec34e188c57f?s=32&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2F3e29736d37968f40e06dec34e188c57f%3Fd%3Dmm%26s%3D32%26noRedirect%3Dtrue\"},\"displayName\":\"Stefany Lucchesi Simões\",\"active\":true,\"timeZone\":\"America/Sao_Paulo\"},\"subtasks\":[{\"id\":\"13482\",\"key\":\"KES-2367\",\"self\":\"https://kestraa.atlassian.net/rest/api/2/issue/13482\",\"fields\":{\"summary\":\"Tabela dinâmica\",\"status\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/status/10026\",\"description\":\"This status is managed internally by Jira Software\",\"iconUrl\":\"https://kestraa.atlassian.net/\",\"name\":\"In Dev\",\"id\":\"10026\",\"statusCategory\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/statuscategory/4\",\"id\":4,\"key\":\"indeterminate\",\"colorName\":\"yellow\",\"name\":\"In Progress\"}},\"priority\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/priority/3\",\"iconUrl\":\"https://kestraa.atlassian.net/images/icons/priorities/medium.svg\",\"name\":\"Medium\",\"id\":\"3\"},\"issuetype\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/issuetype/10003\",\"id\":\"10003\",\"description\":\"The sub-task of the issue\",\"iconUrl\":\"https://kestraa.atlassian.net/secure/viewavatar?size=xsmall&avatarId=10316&avatarType=issuetype\",\"name\":\"Development Sub-Task\",\"subtask\":true,\"avatarId\":10316}}},{\"id\":\"13483\",\"key\":\"KES-2368\",\"self\":\"https://kestraa.atlassian.net/rest/api/2/issue/13483\",\"fields\":{\"summary\":\"Refactor\",\"status\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/status/10026\",\"description\":\"This status is managed internally by Jira Software\",\"iconUrl\":\"https://kestraa.atlassian.net/\",\"name\":\"In Dev\",\"id\":\"10026\",\"statusCategory\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/statuscategory/4\",\"id\":4,\"key\":\"indeterminate\",\"colorName\":\"yellow\",\"name\":\"In Progress\"}},\"priority\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/priority/3\",\"iconUrl\":\"https://kestraa.atlassian.net/images/icons/priorities/medium.svg\",\"name\":\"Medium\",\"id\":\"3\"},\"issuetype\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/issuetype/10003\",\"id\":\"10003\",\"description\":\"The sub-task of the issue\",\"iconUrl\":\"https://kestraa.atlassian.net/secure/viewavatar?size=xsmall&avatarId=10316&avatarType=issuetype\",\"name\":\"Development Sub-Task\",\"subtask\":true,\"avatarId\":10316}}},{\"id\":\"13534\",\"key\":\"KES-2388\",\"self\":\"https://kestraa.atlassian.net/rest/api/2/issue/13534\",\"fields\":{\"summary\":\"Inclusão de dados no back\",\"status\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/status/10026\",\"description\":\"This status is managed internally by Jira Software\",\"iconUrl\":\"https://kestraa.atlassian.net/\",\"name\":\"In Dev\",\"id\":\"10026\",\"statusCategory\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/statuscategory/4\",\"id\":4,\"key\":\"indeterminate\",\"colorName\":\"yellow\",\"name\":\"In Progress\"}},\"priority\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/priority/3\",\"iconUrl\":\"https://kestraa.atlassian.net/images/icons/priorities/medium.svg\",\"name\":\"Medium\",\"id\":\"3\"},\"issuetype\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/issuetype/10003\",\"id\":\"10003\",\"description\":\"The sub-task of the issue\",\"iconUrl\":\"https://kestraa.atlassian.net/secure/viewavatar?size=xsmall&avatarId=10316&avatarType=issuetype\",\"name\":\"Development Sub-Task\",\"subtask\":true,\"avatarId\":10316}}}],\"customfield_10040\":null,\"customfield_10041\":null,\"customfield_10042\":null,\"reporter\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/user?accountId=5ae1cbc37b44642d39d33b8d\",\"name\":\"stefany.simoes\",\"key\":\"stefany.simoes\",\"accountId\":\"5ae1cbc37b44642d39d33b8d\",\"emailAddress\":\"stefany.simoes@kestraa.com\",\"avatarUrls\":{\"48x48\":\"https://avatar-cdn.atlassian.com/3e29736d37968f40e06dec34e188c57f?s=48&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2F3e29736d37968f40e06dec34e188c57f%3Fd%3Dmm%26s%3D48%26noRedirect%3Dtrue\",\"24x24\":\"https://avatar-cdn.atlassian.com/3e29736d37968f40e06dec34e188c57f?s=24&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2F3e29736d37968f40e06dec34e188c57f%3Fd%3Dmm%26s%3D24%26noRedirect%3Dtrue\",\"16x16\":\"https://avatar-cdn.atlassian.com/3e29736d37968f40e06dec34e188c57f?s=16&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2F3e29736d37968f40e06dec34e188c57f%3Fd%3Dmm%26s%3D16%26noRedirect%3Dtrue\",\"32x32\":\"https://avatar-cdn.atlassian.com/3e29736d37968f40e06dec34e188c57f?s=32&d=https%3A%2F%2Fsecure.gravatar.com%2Favatar%2F3e29736d37968f40e06dec34e188c57f%3Fd%3Dmm%26s%3D32%26noRedirect%3Dtrue\"},\"displayName\":\"Stefany Lucchesi Simões\",\"active\":true,\"timeZone\":\"America/Sao_Paulo\"},\"customfield_10043\":null,\"customfield_10000\":\"{}\",\"aggregateprogress\":{\"progress\":0,\"total\":0},\"customfield_10001\":null,\"customfield_10047\":null,\"customfield_10004\":null,\"customfield_10039\":null,\"environment\":null,\"duedate\":null,\"progress\":{\"progress\":0,\"total\":0},\"votes\":{\"self\":\"https://kestraa.atlassian.net/rest/api/2/issue/KES-2357/votes\",\"votes\":0,\"hasVoted\":false}}},\"changelog\":{\"id\":\"69065\",\"items\":[{\"field\":\"status\",\"fieldtype\":\"jira\",\"fieldId\":\"status\",\"from\":\"10026\",\"fromString\":\"In Dev\",\"to\":\"10028\",\"toString\":\"Ready to QA\"}]}}";
        InputStream inputStream = new ByteArrayInputStream(json.getBytes());
        OutputStream outputStream = new ByteArrayOutputStream();
        this.handler.handleRequest(inputStream, outputStream, null);
    }
}