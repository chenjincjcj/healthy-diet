package com.example.ccccccc

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.ccccccc.xiaxian.Pengren
import kotlinx.android.synthetic.main.activity_pengren.*
import kotlinx.android.synthetic.main.activity_pengren.toolbar

class PengrenActivity : AppCompatActivity() {
    var pengrenList = ArrayList<Pengren>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(toolbar)
        setContentView(R.layout.activity_pengren)
        initPengren()
        val layoutManager = GridLayoutManager(this, 1)
        recyclerView_pengren.layoutManager = layoutManager
        val adapter = PengrenAdapter(this, pengrenList)
        recyclerView_pengren.adapter = adapter
    }

    private fun  initPengren() {
        val uri = Uri.parse("android.resource://$packageName/${R.raw.yuxiangrousi}")
        pengrenList.add(Pengren("外婆红烧肉",uri.toString(),"外婆红烧肉\n" +
                "以五花肉、鹌鹑蛋为主料的菜品\n" +
                "上海本帮菜。外焦里嫩，香甜润滑，油而不腻。和北方的红烧肉不同，少一分咸、多一分甜。\n" +
                "带皮肉洗净，将猪毛处理干净，为了拔几根顽固的猪毛，我都用上了眉毛夹子，呵呵，很轻松的就把的干干净净了！\n" +
                "将肉切成麻将牌大小正方形的块，肉不要切得太小，太小易缩易碎，没有卖相了。切完后，用冷水浸没，水中放半杯料酒。放在水中浸，可以浸去毛细血管中的血水；水中加酒易于肉纤维吸收，去除肉腥。肉不宜多浸，多浸则鲜味尽失，一般浸十五分钟左右即可。"))
        val uri1 = Uri.parse("android.resource://$packageName/${R.raw.aa}")
        pengrenList.add(Pengren("鱼香肉丝",uri1.toString(),"四川鱼香肉丝做法： 1、将瘦肉洗净切成粗丝，盛于碗内，加盐和水淀粉调匀 2、葱姜蒜洗净切丝备用 3、木耳和胡萝卜切丝备用 4、把白糖、酱油、香醋、精盐、葱花、姜末、蒜末、高汤、鸡精、水、淀粉调成鱼香汁 5、锅内放油、烧至五成热油时倒入肉丝，炒散后下入泡椒末，待炒出色时，再将木耳、胡萝卜丝和鱼香汁倒入，急炒几下即可"))
        val uri2 = Uri.parse("android.resource://$packageName/${R.raw.jiaoyanjichi}")
        pengrenList.add(Pengren("椒盐鸡翅",uri2.toString(),"做法一\n" +
                "食材准备\n" +
                "鸡翅3只，芫茜（香菜）少许，生抽1小匙，酒1小匙，胡椒盐少许，姜汁1小匙，豆粉4大匙，水2大匙。\n" +
                "做法步骤\n" +
                "（1）从鸡翅的关节处切开。\n" +
                "（2）鸡肉放碗中，加盐混匀腌30-60分钟。\n" +
                "（3）把(2)洗净，用布擦干，加生抽腌入味。\n" +
                "（4）把豆粉放入大碗中，拌混至糊状态。\n" +
                "（5）把腌入味的鸡肉放入(4)中，沾取(4)用作裹衣。\n" +
                "（6）炸油加热至高温，一一放入(5)，表面稍微凝固后，转用小火炸3分钟，再以大火炸1-2分钟，把表面炸酥。 装盘即可."))
        val uri3 = Uri.parse("android.resource://$packageName/${R.raw.gongbaojiding}")
        pengrenList.add(Pengren("剁椒鱼头",uri3.toString(),"大葱1小段，生姜一块，酱油5g，料酒20g，醋10g， 水淀粉5g，盐2g，花生油10g， 干辣椒10根，花椒30粒，胡椒粉少许\n" +
                "\n" +
                "\n" +
                "2、鸡胸肉提前泡水，洗净去除血水。\n" +
                "\n" +
                "\n" +
                "3、将鸡胸肉切成约一寸的大小。\n" +
                "\n" +
                "\n" +
                "4、加入5g酱油，10g料酒，水淀粉，胡椒粉、花生油、盐少许。\n" +
                "\n" +
                "\n" +
                "5、将调好味的鸡胸肉，搅拌均匀，使其均匀上浆。\n" +
                "\n" +
                "\n" +
                "6、胡萝卜削去皮，黄瓜切成条状后用刀削去籽。\n" +
                "\n" +
                "\n" +
                "7、将胡萝卜和黄瓜切成与鸡胸肉差不多大小的块，姜切成片，大葱切成1厘米大小的小段，备用。\n" +
                "\n" +
                "\n" +
                "8、起油锅，将油烧至五成热，倒入洗净晾干的花生，小火炸至花生皮略微变色，即可捞起。\n" +
                "\n" +
                "\n" +
                "9、炸好花生后进行最后一步，调制芡汁：碗内加入1勺淀粉，1勺老抽，2勺酱油，3勺香醋，少许胡椒粉、盐，加入少许水调和均匀。\n" +
                "\n" +
                "\n" +
                "10、起锅热，倒入10g花生油，小火将花椒以及干辣椒炒出香味。\n" +
                "\n" +
                "\n" +
                "11、干辣椒、花椒炒出香味后，将其捞出，弃之不用。\n" +
                "\n" +
                "\n" +
                "12、炒香的油直接加入葱段、姜片，继续爆炒出香味。\n" +
                "\n" +
                "\n" +
                "13、加入腌渍好的鸡胸肉，大火翻炒，可以看到鸡胸肉在很快速地由粉红色转白。鸡胸肉完全转白之后，倒入调好的芡汁，继续翻炒均匀。\n" +
                "\n" +
                "\n" +
                "14、倒入芡汁翻炒数十秒后即可加入胡萝卜以及黄瓜，如果喜欢胡萝卜软一点，可以提前放入，翻炒一分钟后再加入黄瓜粒。\n" +
                "\n" +
                "\n" +
                "15、最后一步，加入炸香了的花生粒，即可关火，略微搅拌均匀，出锅！\n" +
                "\n" +
                "\n" +
                "16、这样一道看似配料众多，操作复杂的菜，其实从鸡胸肉下过到出锅，几乎不超过五分钟哦，省时间又非常下饭的一道菜，你要不要也试试？\n" +
                "\n" +
                "\n" +
                "小贴士\n" +
                "\n" +
                "1.鸡胸肉要用清水浸泡十分钟左右，可"))
        val uri4 = Uri.parse("android.resource://$packageName/${R.raw.guobaorou}")
        pengrenList.add(Pengren("锅包肉",uri4.toString(),"锅包肉做法： 准备好里脊肉、土豆淀粉、葱丝、蒜丝、香菜段等食材。\n" +
                "2/10\n" +
                "猪里脊切成薄片，加盐腌制20分钟。\n" +
                "3/10\n" +
                "入味后加入土豆淀粉，抓均匀。\n" +
                "4/10\n" +
                "起锅烧油至5成热，拎起上浆肉片，逐次放入锅中。\n" +
                "5/10\n" +
                "中火炸至浅黄色，炸好后，出锅沥油。\n" +
                "6/10\n" +
                "将适量的糖和醋调配成汁。\n" +
                "7/10\n" +
                "高汤、料酒和生抽调成清汁。\n" +
                "8/10\n" +
                "锅中留底油，加入糖醋汁，大火熬化。\n" +
                "9/10\n" +
                "糖醋汁熬化后，倒入炸好的里脊肉，撒上葱蒜和香菜。\n" +
                "10/10\n" +
                "出锅装盘即可。"))
        val uri5 = Uri.parse("android.resource://$packageName/${R.raw.duojiaoyutou}")
        pengrenList.add(Pengren("剁椒鱼头",uri5.toString(),"制作过程：\n" +
                "\n" +
                "\n" +
                "1、我们先将买回的鱼头去掉鱼鳃，用清水洗净以后，斩成两半，在鱼肉比较厚的地方划几刀，这样腌制的时候方便入味，也能更好地去除腥味，然后再次冲洗干净，然后沥干水分备用。\n" +
                "\n" +
                "\n" +
                "\n" +
                "2、我们现在开始腌制鱼头，在鱼头的表面均匀的抹上盐、白胡椒粉，注意要抹均匀，鱼头里面也要全部抹到，再放几片生姜，腌制半个小时左右备用。\n" +
                "\n" +
                "\n" +
                "\n" +
                "3、然后起锅，烧热，锅热后，倒入油，下入姜蒜末和葱根，小火煸炒出香味，再放入剁椒，炒出剁椒的香辣味，然后倒入一点生抽和料酒去腥增香，翻炒均匀出辣香味，大火烧开后，汁稍微收一下，这样汤汁变得浓一点即可关火备用。\n" +
                "\n" +
                "\n" +
                "\n" +
                "4、我们现在开始整剁椒鱼头，将腌好的鱼头装入大盘中，盘子最下面铺几片生姜，再放上鱼头，将炒好的剁椒均匀平铺在鱼头上面就好了。锅中烧水，将水烧开后，将鱼头上锅，开大火蒸15分钟左右即可出锅。\n" +
                "\n" +
                "\n" +
                "\n" +
                "5、鱼头蒸好以后，撒一点葱花和白芝麻，然后用锅烧一点热油，油热后，将油淋在鱼头上，葱花和白芝麻的香味就出来了，而且剁椒鱼头的香辣味马上就可以闻到了，满屋子都飘香。\n" +
                "\n" +
                "\n" +
                "\n" +
                "温馨小贴士：\n" +
                "\n" +
                "\n" +
                "1、鱼头一定要选择肉质比较厚的鱼头，鱼头新鲜为主。\n" +
                "\n" +
                "\n" +
                "2、由于这道剁椒鱼头是采用蒸的方式，所以腌制的时候一定要腌制好，不然蒸出来以后腥味会很大，影响口感和味道。\n" +
                "\n" +
                "\n" +
                "3、蒸鱼的时候一定要水烧开才可以，然后蒸制的时候不宜太长，时间太久了反而影响鱼的口感，而且营养成分会流失。"))
        val uri6 = Uri.parse("android.resource://$packageName/${R.raw.shuizhuroupian}")
        pengrenList.add(Pengren("水煮肉片",uri6.toString(),"食材：\n" +
                "猪里脊 300克\n" +
                "任何蔬菜都可以：比如圆白菜、菠菜、白菜、油菜、生菜\uD83E\uDD6C豆芽等等\n" +
                "我选的绿甘蓝 半颗\n" +
                "和油麦菜 2颗\n" +
                "蒜末 适量\n" +
                "葱花 适量\n" +
                "水煮肉片（肯定不翻车）的家常做法步骤\n" +
                "步骤 1\n" +
                "肉尽量切成薄片，别太大，加适量盐，生抽，白胡椒粉、一个蛋清，淀粉，抓拌均匀。因为我切的肉多，＊＊＊所以我放了一个鸡蛋。\n" +
                "步骤 2\n" +
                "最后放点油，腌制最少半小时，时间越长肉片越嫩滑，千万别着急，要不肉不嫩你们又来找我\n" +
                "步骤 3\n" +
                "葱、蒜切好，留一点葱花，一会儿装饰用\n" +
                "步骤 4\n" +
                "起锅烧油，先放葱蒜，再放郫县豆瓣酱或红油豆瓣酱都行，我感觉味道一样，有火锅底料的可以放一小块，味道更佳，小火炒出红油\n" +
                "步骤 5\n" +
                "家里只有红油豆瓣，再加入适量清水，水量看一下一会儿够煮蔬菜就可以，加盐、味精、酱油、糖、蚝油、尝一下，得咸点，最后加一点点陈醋！调好味后，汤烧开后用漏勺把调料残渣捞出。\n" +
                "步骤 6\n" +
                "＊接着放入准备好的蔬菜，爱吃什么菜就放什么菜，菜煮到八分熟，用漏勺捞出放入大碗或盆中备用。\n" +
                "步骤 7\n" +
                "再次把汤烧开转小火，用手慢慢地圆着圈往汤里放入肉片，全部放入后，＊千…万…不用动它，别欠儿欠儿的用铲子扒拉它啊，会造成脱浆的，而且肉会很碎，一定等5一10秒，再打打散，改成中火。\n" +
                "步骤 8\n" +
                "等两、三分钟，肉片变白熟了就可以了。\n" +
                "步骤 9\n" +
                "把肉片和汤一起倒入刚才放蔬菜的大碗中，这时会感觉汤有点粘稠，这属于正常，因为肉片上有淀粉。\n" +
                "步骤 10\n" +
                "锅放入多一点的油加热，一会儿要浇在肉和调料上\n" +
                "步骤 11\n" +
                "烧油的功夫，在肉片上撒些葱花、蒜末、麻椒粒、花椒粒、花椒粉、干辣椒、辣椒粉\n" +
                "步骤 12\n" +
                "这时候锅里的油也烧热了，必须得冒烟哈，再浇在调料上，吡啦一声，哎玛！太好听了\n" +
                "步骤13\n" +
                "鲜香可口，肉质细嫩的水煮肉片做好啦，我去盛饭\uD83D\uDE0B\uD83D\uDE0B"))
        val uri7 = Uri.parse("android.resource://$packageName/${R.raw.shaoqiezi}")
        pengrenList.add(Pengren("烧茄子",uri7.toString(),"做法步骤：\n" +
                "\n" +
                "1.把茄子去蒂，洗净，沥净水分。吃茄子最好不要去皮，因为茄子皮里面含有维生素B，维生素B和维生素C是一对好搭档，维生素C的代谢过程中需要维生素B的支持，带皮吃茄子有助于促进维生素C的吸收。\n" +
                "\n" +
                "\n" +
                "2.把茄子切成滚刀块，放在盆内，加入少许盐，拌匀，腌制10分钟，把茄子腌制出水。茄子炒之前，多做这一步，茄子颜色不会氧化变黑，炒制时，茄子就不会吸油，用很少的油就能做出美味的茄子。\n" +
                "\n" +
                "\n" +
                "3.把尖椒去蒂，斜刀切成辣椒圈，葱切葱花，姜切末，大蒜切末。\n" +
                "\n" +
                "\n" +
                "4.碗内加入半碗水，再加入酱油，淀粉，鸡精，花椒粉，搅拌均匀，调成调味汁。\n" +
                "\n" +
                "\n" +
                "5.锅内加入油烧热，下入茄子翻炒，将茄子炒至变软，把茄子炒一下，茄子更容易入味。\n" +
                "\n" +
                "\n" +
                "6.下入葱花，姜末翻炒均匀，加入少许水烧开，煮1-2分钟，把茄子煮软。\n" +
                "\n" +
                "\n" +
                "7.淋入做好的调味汁，大火加热至汤汁变得黏稠，包裹在茄子上，撒入蒜末，翻炒均匀，关火，盛出装盘即可。\n" +
                "\n" +
                "\n" +
                "小贴士：茄子切好后，加入少许盐，把茄子腌制出水。茄子炒之前，多做这一步，茄子颜色不会氧化变黑，炒制时，茄子就不会吸油，用很少的油就能做出美味的茄子。\n" +
                "\n" +
                "腌制茄子时已经加盐了，后期又放了酱油，所以，就不用放盐了。蒜末后放，可以为菜肴提味。" ))
        val uri8 = Uri.parse("android.resource://$packageName/${R.raw.youmen}")
        pengrenList.add(Pengren("油闷大虾",uri8.toString(),"第一个关键点：虾的这些部位务必要清理干净。\n" +
                "\n" +
                "这是我今天买了一斤大虾，每只都是活蹦乱跳的，都很新鲜。我们先把大虾处理一下。首先，我们用剪刀剪去虾脚，这样吃的时候更方便，喜欢吃的人也可以不剪。\n" +
                "\n" +
                "\n" +
                "接下来，剪去虾枪，学名叫额箭。它特别容易扎到嘴，也容易扎到手。别人不知道，我本人要被扎到了，基本上要红肿疼好几天。\n" +
                "\n" +
                "\n" +
                "接下来，我们就要清理虾线了，先用剪刀斜着一剪，把虾头也剪下来。这个黑的地方就是虾囊，用剪刀竖着剪开，剩余虾头部分，学名叫头胸甲。\n" +
                "\n" +
                "然后，用剪刀的头部挑出虾囊。一只手抓住虾囊，轻轻一拉，虾线就全部拉出来，是不是特别方便呢？\n" +
                "\n" +
                "\n" +
                "很多人不明白，虾囊和虾线，到底是什么东西？\n" +
                "\n" +
                "这里用一张图进行说明。\n" +
                "\n" +
                "\n" +
                "您可以这么理解，虾囊即是虾胃，虾鳃，虾心以及肝胰腺。虾线就是虾的消化道。刚才这么一拉，就把虾的内脏都清理干净了，剩下的除了壳之外，都是能吃的肉。\n" +
                "\n" +
                "\n" +
                "那么多人就要问了，肚子下面不是也有一条线吗？下面那根线是神经，虽然平常虾是用虾脚来游泳的，但它逃命的时候，是迅速弹走的。\n" +
                "\n" +
                "好了，我们重复这个操作，剪一剪，拉一拉，直到把所有的虾线，都取出来。\n" +
                "\n" +
                "接下来，把大虾平铺在案板上，横刀进刀，给大虾开背，这样等会烹饪的时候，更容易入味。\n" +
                "\n" +
                "\n" +
                "全部开背完成后，把处理好的大虾装入一个大碗中，再往里面加入适量的清水，把它们清洗一下，这里不用洗太久，简单抓洗一分钟左右的时间就行了。\n" +
                "\n" +
                "完全抓洗干净后，把大虾全部捞出来，沥水备用。\n" +
                "\n" +
                "\n" +
                "第二个关键点：大虾用葱姜水腌制一下会更香。\n" +
                "\n" +
                "我们准备一块去皮的生姜，先改刀切成片，再改刀切成姜丝，这粗细没有讲究，尽量大小均匀一点比较好。\n" +
                "\n" +
                "接下来，我们准备几根清洗干净的小葱，先一刀去掉根部，然后改刀切成小段，长短和大虾差不多就行。然后把葱白和葱绿分开。\n" +
                "\n" +
                "\n" +
                "准备，一个干净的大盘中，加入一点姜丝，加入一点切好的葱绿部分，再加入一点料酒，用手把姜丝和葱段抓起来，用力捏出里面葱姜汁。\n" +
                "\n" +
                "\n" +
                "接下来，我们把全部的大虾倒进去，用手把它们抓拌均匀，然后放一旁腌制10分钟。\n" +
                "\n" +
                "第二个关键点：焖虾的料汁调配有讲究，不能影响大虾的鲜味。\n" +
                "\n" +
                "等待的时间，我们调个一个焖虾的料汁，都是很平常的调味品。\n" +
                "\n" +
                "准备一个干净的碗，碗中加入一点食盐，加入一点白糖，加入一点胡椒粉，加入2勺生抽、一勺料酒，最后加入半碗清水，用勺子搅拌化开，这个焖虾的料汁就调好了。\n" +
                "\n" +
                "\n" +
                "这个时候，大虾也差不多腌好后，我们把葱姜都挑出来不要。接下来，把大虾控一下水分，防止等会煎的时候溅油。\n" +
                "\n" +
                "准备一口干净的锅，加入适量的植物油，油温六成热左右，我们下入全部的大虾。下锅之后不要翻动，只需要把大虾尽量铺平就可以了，让它们能与油接触，受热均匀。\n" +
                "\n" +
                "\n" +
                "略微煎一会儿，先把一面煎熟，然后我们翻个面，煎另外一边。因为锅里面油较多，不熟悉的朋友千万别翻锅，大过年的，别烫到自己，用筷子一个一个翻也很快。做菜嘛，安全第一。\n" +
                "\n" +
                "第三个关键点：大虾要煎得金黄焦脆，还要把虾油煎出来。\n" +
                "\n" +
                "我们一定要把大虾煎至两面都金黄酥脆，这样才会外酥里嫩，这也是油焖大虾好吃的关键。大虾的肉质就决定了它，很难变得很柴。只要外面煎得比较脆，里面的水分也就出不来。\n" +
                "\n" +
                "煎的过程中，我们用炒勺轻轻地敲打和按压虾头，这样就能把虾油就可以煎出来，会特别的香，而且特别的鲜美，是天然的提鲜剂。\n" +
                "\n" +
                "\n" +
                "朋友们，文章都看到这里了，如果您觉得我的文章对你有一些帮助的话，请您伸出发财的手，为我点个赞吧，祝您虎年大吉，万事如意。\n" +
                "\n" +
                "第四个关键点：注意焖煮的时间，大火收汁就可以上桌。\n" +
                "\n" +
                "接下来，我们来下入全部的小葱白和生姜丝。开大火，把葱姜丝爆炒出香味。\n" +
                "\n" +
                "\n" +
                "下一步，我们倒入全部提前准备好的料汁，把它们翻炒均匀，然后盖上盖子，开小火焖煮5分钟。\n" +
                "\n" +
                "\n" +
                "5分钟后，我们立刻打开盖子，一股浓郁的海鲜香味扑面而来，让人忍不住说一句：哇，真的好香。\n" +
                "\n" +
                "接下来，开大火收汁。没一会儿，汤汁就变得非常浓稠了，您可以选择性加入一点香油，翻炒均匀后，即可出锅装盘。\n" +
                "\n" +
                "既然是年夜饭的菜，我们就做个特别简单又好看的装盘。准备一根上海青，从下半截直刀切断，焯下水摆入盘子中央。\n" +
                "\n" +
                "然后将大虾均匀地铺开就可以，最后淋入汤汁。\n" +
                "\n" +
                "\n" +
                "这道菜，有一个好听的名字，花开富贵虾，非常适合年夜饭的氛围。\n" +
                "\n" +
                "\n" +
                "这样一道，简单又美味的油焖大虾就完成了。大虾色泽红润，香气扑鼻，看着就非常的有食欲。吃起来也特别方便，一点都不扎嘴，因为开过背了的，能很轻松就能脱壳。\n" +
                "\n" +
                "\n" +
                "这样做出来的油焖大虾外酥里嫩，鲜嫩多汁，虾的鲜美完全保留，而且一点都不腥，大人小孩都喜欢。年夜饭的时候安排上，一定会大受好评。"))
        val uri9 = Uri.parse("android.resource://$packageName/${R.raw.tangcu}")
    pengrenList.add(Pengren("糖醋里脊",uri9.toString(),"调味料：\n" +
            "\n" +
            "醋10克、淀粉1勺、白糖10克、生抽1勺、番茄酱20克、料酒1勺 、盐、鸡精\n" +
            "\n" +
            "步骤：\n" +
            "\n" +
            "1、姜1块，切姜片，里脊肉切成大小均匀的长条，放入切好的姜片、生抽1勺、料酒1勺、胡椒粉1克、鸡蛋清1个，放入淀粉2勺，拌匀腌制10分钟；\n" +
            "\n" +
            "糖醋里脊的做法 糖醋里脊怎么做\n" +
            "\n" +
            "2.锅中放入适量油，油温烧至7成热，放入腌好的里脊炸至表面金黄后捞出，待油温升高，放入里脊继续复炸半分钟后捞出待用；\n" +
            "\n" +
            "糖醋里脊的做法 糖醋里脊怎么做\n" +
            "\n" +
            "3.锅中放入适量油，油温烧至7成热，放入番茄酱20克、白糖10克、醋10克、盐半勺转小火将白糖炒化后放入适量水淀粉收汁，放入炸好的里脊翻炒几下，里脊肉均匀裹上汁盛出装盘后撒上芝麻即可。"))
        val uri10 = Uri.parse("android.resource://$packageName/${R.raw.huang}")
        pengrenList.add(Pengren("黄焖鸡",uri10.toString(),"　食材：三黄鸡500克土豆1个青椒1个干香菇10克干辣椒5个姜1块蒜3瓣糖水1勺\n" +
                "\n" +
                "黄焖鸡的做法\n" +
                "\n" +
                "　　步骤：\n" +
                "\n" +
                "　　1.干香菇洗净放入清水中浸泡10分钟，对半切开。青椒去蒂去籽切成小块。姜1块切片，蒜3瓣切片，干辣椒5个剪成段\n" +
                "\n" +
                "黄焖鸡的做法\n" +
                "\n" +
                "　　12.锅中放入适量油，油温烧至7成热，放入鸡块炒干水分，倒入糖水1勺，让鸡肉裹上糖色。放入姜蒜片、干辣椒小火煸香，加入料酒1勺、生抽1勺、黄豆酱1勺翻炒均匀。\n" +
                "\n" +
                "黄焖鸡的做法\n" +
                "\n" +
                "　　4.将泡香菇的水倒入锅中，大火烧开，放入土豆块、香菇煮开后换小火焖煮15分钟。放入青椒块、盐1勺、胡椒粉1克大火收浓汤汁即可"))
    }
}

