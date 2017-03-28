package com.liwei.bean;

import java.util.List;

/**
 * Created by wu  suo  wei on 2017/3/16.
 */

public class BannerBean {

    /**
     * code : 200
     * msg : success
     * data : {"subjects":[{"id":"35","title":"缤纷新品","detail":"缤纷上新 懂你所爱\n每一次上新 都是一次相遇\n但我更希望 能在护肤的路上与你牵手同行\n了解你的喜怒哀乐与点点滴滴\n陪在你身边 用美好好宠爱你","image":"http://image.hmeili.com/yunifang/images/goods/temp/161130100494020947901157808.jpg","start_time":"2016.11.30 10:01:16","end_time":"2017.03.28 00:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"1638","goods_name":"新品上市|嫩肌酵素黑膜礼盒21片","shop_price":139.9,"market_price":299,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1638/goods_img/17030210211762506087062132.jpg","reservable":false,"efficacy":"鲜果酵素 弹嫩水润"},{"id":"1615","goods_name":"新品上市丨御泥坊悠然舒缓蒸汽眼罩","shop_price":49,"market_price":49,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1615/goods_img/17021711575612130589207037.jpg","reservable":false,"efficacy":"舒缓疲劳 莹亮眼周"},{"id":"1280","goods_name":"潜心研制|御泥坊精华水分光感气垫BB霜 新品上市","shop_price":139,"market_price":169,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1280/goods_img/16120518307098199689667991.jpg","reservable":false,"efficacy":"控油遮瑕 水润透亮"},{"id":"1250","goods_name":"新品推荐|红石榴矿物面霜50g","shop_price":79,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1250/goods_img/16120711377623595883702997.jpg","reservable":false,"efficacy":"水润亮颜 紧致淡纹"},{"id":"1330","goods_name":"新品推荐|男士冰川深润补水面膜","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1330/goods_img/161226170256015772208103754.jpg","reservable":false,"efficacy":"深润补水 长效保湿"},{"id":"1281","goods_name":"红石榴矿物眼霜25g","shop_price":129,"market_price":159,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1281/goods_img/17030611054128553621233557.jpg","reservable":false,"efficacy":"亮肤修护 改善补水"},{"id":"1254","goods_name":"新品推荐|黑珍珠盈润亮采黑面膜7片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1254/goods_img/16112517549399376533709198.jpg","reservable":false,"efficacy":"清洁补水 提亮肤色"},{"id":"1234","goods_name":"热销|樱桃鲜润补水矿物面膜7片","shop_price":39.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1234/goods_img/161122183456315727984418108.jpg","reservable":false,"efficacy":"补水保湿  润泽滋养"},{"id":"1256","goods_name":"新品面膜丨埃及洛神花紧致面膜5片 3段式提拉","shop_price":59.9,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1256/goods_img/161128101656810774865882474.jpg","reservable":false,"efficacy":"润泽修护 提拉紧致"},{"id":"1258","goods_name":"新品水果面膜|牛油果水润亲肤黑面膜7片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1258/goods_img/16112810259763472659996926.jpg","reservable":false,"efficacy":"补水保湿 清洁净透"},{"id":"1277","goods_name":"新品面膜|异域风情水润亮颜面膜套装","shop_price":119.9,"market_price":159.8,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1277/goods_img/16113015251372332658926589.jpg","reservable":false,"efficacy":"补水保湿 润泽修护"},{"id":"1257","goods_name":"新品面膜丨瑞士欧锦葵深补水修护面膜5片","shop_price":59.9,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1257/goods_img/16112810218779610552336670.jpg","reservable":false,"efficacy":"深层补水 舒缓修护"},{"id":"1248","goods_name":"新品面膜|御泥坊海洋水漾透润面膜7片","shop_price":59.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1248/goods_img/161125212640917710585897403.jpg","reservable":false,"efficacy":"补水保湿 滋养肌肤"},{"id":"1252","goods_name":"柠檬鲜萃净颜矿物面膜7片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1252/goods_img/161125204853020531022844238.jpg","reservable":false,"efficacy":"清洁控油 补水保湿"},{"id":"1230","goods_name":"男士舒爽清透矿物洁面乳","shop_price":29.9,"market_price":39.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1230/goods_img/161122113046021358243094018.jpg","reservable":false,"efficacy":"深透清洁 清透毛孔"},{"id":"1228","goods_name":"男士珊瑚清洁控油面膜5片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1228/goods_img/161122111317219082185346251.jpg","reservable":false,"efficacy":"清洁控油 平滑毛孔"},{"id":"1229","goods_name":"男士黑茶清爽矿物面膜20片 黄致列定制版","shop_price":99.9,"market_price":375,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1229/goods_img/161122112568013495425696259.jpg","reservable":false,"efficacy":"净透肌肤 清洁控油"},{"id":"1227","goods_name":"男士红盐活力爽肤面膜5片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1227/goods_img/16112211067297788200406393.jpg","reservable":false,"efficacy":"提升活力 畅透醒肤"},{"id":"1220","goods_name":"男士炫活亮肤凝乳","shop_price":69,"market_price":89,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1220/goods_img/161120132537912312357149912.jpg","reservable":false,"efficacy":"改善黯哑 保湿锁水"},{"id":"1219","goods_name":"男士新品丨炫活亮肤晶露","shop_price":59,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1219/goods_img/16112013058403452949723470.jpg","reservable":false,"efficacy":"深层补水 改善黯哑"},{"id":"1218","goods_name":"男士新品丨炫活亮肤洁面乳","shop_price":49,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1218/goods_img/161120125345819475356221525.jpg","reservable":false,"efficacy":"改善黯哑  清洁亮肤"},{"id":"1221","goods_name":"男士新品丨炫活亮肤礼盒","shop_price":139.9,"market_price":237,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1221/goods_img/161120132834212433896505066.jpg","reservable":false,"efficacy":"炫活亮彩 劲能醒肤"},{"id":"1226","goods_name":"男士白茶控油面膜5片","shop_price":39.9,"market_price":75,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1226/goods_img/161122104426019564249198030.jpg","reservable":false,"efficacy":"清爽控油 净化肌肤"},{"id":"1216","goods_name":"男士新品|净畅黑头泥浆鼻膜60g","shop_price":59,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1216/goods_img/161120124273911769788096987.jpg","reservable":false,"efficacy":"改善黑头 收缩毛孔"},{"id":"1217","goods_name":"男士新品丨火山泥清洁控油泥浆面膜","shop_price":79,"market_price":139,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1217/goods_img/161120124763716596592995963.jpg","reservable":false,"efficacy":"清洁控油 清爽不油腻"},{"id":"1212","goods_name":"男士新品|茶树清痘净爽泥浆面膜110g","shop_price":79,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1212/goods_img/161120110788710403903073534.jpg","reservable":false,"efficacy":"深层清洁 净肤祛痘"},{"id":"1213","goods_name":"男士新品|橄榄石畅透亮肤黑面膜5片","shop_price":59.9,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1213/goods_img/16112011174805234612745667.jpg","reservable":false,"efficacy":"控油亮肤 清爽透亮"},{"id":"1214","goods_name":"男士新品|海盐炫活亮肤面膜","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1214/goods_img/1611201229207648144994110.jpg","reservable":false,"efficacy":"炫活亮肤 清爽舒缓"},{"id":"1215","goods_name":"男士新品丨火山岩净透控油黑面膜5片","shop_price":49.9,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1215/goods_img/16112012349006647978335734.jpg","reservable":false,"efficacy":"净透控油 舒爽体验"},{"id":"1352","goods_name":"男士新品丨黑茶净爽沐浴露150ml","shop_price":19.9,"market_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1352/goods_img/170109115166212137535299302.jpg","reservable":false,"efficacy":"净爽清洁 舒缓滋润"}],"goodsIdsList":["1638","1615","1280","1250","1331","1330","1281","1254","1234","1256","1258","1262","1277","1257","1248","1252","1325","1230","1228","1229","1227","1220","1219","1218","1221","1226","1216","1217","1212","1213","1214","1215","1352"]},{"id":"17","title":"热销爆款","detail":"御泥坊APP畅销优品\n千万会员的口碑之选\n轻薄服帖的贴士面膜\n清洁吸附的泥浆面膜\n彻夜润养的睡眠面膜\n妹子们缔造美肌的必备选择","image":"http://image.hmeili.com/yunifang/images/goods/temp/160928090305467283569257.jpg","start_time":"2016.09.28 09:02:02","end_time":"2017.03.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"9","goods_name":"玫瑰滋养矿物睡眠面膜180g","shop_price":59.9,"market_price":79.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/9/goods_img/160819084569920890610621654.jpg","reservable":false,"efficacy":"镇店之宝 彻夜补水"},{"id":"559","goods_name":"热销泥浆丨竹炭净透矿物泥浆面膜110g","shop_price":59,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/559/goods_img/16081909445727749257882094.jpg","reservable":false,"efficacy":"控油净肤 细腻毛孔"},{"id":"14","goods_name":"矿物泥浆鼻膜60g","shop_price":55,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/14/goods_img/160819084841216186223194195.jpg","reservable":false,"efficacy":"草莓鼻小救星 收敛毛孔"},{"id":"446","goods_name":"芦荟补水保湿凝胶150g","shop_price":49.9,"market_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/446/goods_img/16081909409518953549635059.jpg","reservable":false,"efficacy":"水水润润 修护受损"},{"id":"10","goods_name":"美白嫩肤睡眠面膜180g","shop_price":69,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/10/goods_img/161109200044614716799834077.jpg","reservable":false,"efficacy":"补水美白 越睡越白"},{"id":"8","goods_name":"镇店之宝|美白嫩肤面膜20片","shop_price":139.9,"market_price":298,"goods_img":"https://image.yunifang.com/yunifang/images/goods/8/goods_img/1703060954389257968293129.jpg","reservable":false,"efficacy":"爆款面膜 明星同款"},{"id":"101","goods_name":"玫瑰滋养矿物洁面乳100ml","shop_price":26.9,"market_price":29.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/101/goods_img/160819085919220738763253204.jpg","reservable":false,"efficacy":"温和清洁 补水保湿"},{"id":"343","goods_name":"美白嫩肤润肤水150ml","shop_price":59,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/343/goods_img/161109195539019451480402371.jpg","reservable":false,"efficacy":"补水保湿 美白嫩肤"},{"id":"16","goods_name":"玫瑰滋养保湿四件套","shop_price":169.9,"market_price":259.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/16/goods_img/16081908495157874536435487.jpg","reservable":false,"efficacy":"一整套源源补水"},{"id":"389","goods_name":"清爽平衡矿物蚕丝面膜黑面膜21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/389/goods_img/16081909368531961221339216.jpg","reservable":false,"efficacy":"以黑吸黑 净透亮肤"}],"goodsIdsList":["9","559","14","446","10","8","101","343","16","389"]},{"id":"12","title":"型男之选","detail":"针对男士肤质\n精选补水控油原材\n改善男士肌肤缺水、水油失衡的状态\n深入补水，清爽控油，收敛毛孔\n带来畅爽护肤新感觉\n唤醒型男自信魅力","image":"http://image.hmeili.com/yunifang/images/goods/temp/1609280906311531930037465.jpg","start_time":"2016.09.28 09:06:49","end_time":"2017.06.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"1699","goods_name":"男士新品丨玉石紧致细肤水凝面膜","shop_price":49.9,"market_price":159,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1699/goods_img/170314092523919884876852385.jpg","reservable":false,"efficacy":"紧致细肤 平抚肌纹"},{"id":"1698","goods_name":"男士新品丨碧玺滋养修护水凝面膜","shop_price":49.9,"market_price":159,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1698/goods_img/17031409161239002438572691.jpg","reservable":false,"efficacy":"滋养修护 提升活力"},{"id":"1176","goods_name":"新品上市丨男士火山泥清洁控油洁面乳2支装","shop_price":39.9,"market_price":89,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1176/goods_img/16111400198611202108006896.jpg","reservable":false,"efficacy":"深层清洁 平衡水油"},{"id":"869","goods_name":"男士深海水动力洁面乳","shop_price":39.9,"market_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/869/goods_img/16081914304586693050802388.jpg","reservable":false,"efficacy":"洁净控油 深层补水"},{"id":"598","goods_name":"男士黑茶清爽控油矿物泥浆面膜260g","shop_price":69,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/598/goods_img/16081909464842878902279307.jpg","reservable":false,"efficacy":"清洁控油 保湿收毛孔"},{"id":"868","goods_name":"男士黑茶清爽矿物面膜  今日买5片送5片","shop_price":49.9,"market_price":150,"goods_img":"http://image.hmeili.com/yunifang/images/goods/868/goods_img/1608191430564693145258305.jpg","reservable":false,"efficacy":"洁净控油 强劲清爽"},{"id":"17","goods_name":"礼盒装丨男士黑茶控油护肤三件套","shop_price":99.9,"market_price":199.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/17/goods_img/16081908499853298911775471.jpg","reservable":false,"efficacy":"清洁控油 神清气爽"},{"id":"871","goods_name":"男士深海水动力面膜5片","shop_price":39.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/871/goods_img/16081914311832949617861907.jpg","reservable":false,"efficacy":"水润肌肤 长效锁水"},{"id":"687","goods_name":"男士黑茶控油爽肤水90ml","shop_price":39.9,"market_price":69.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/687/goods_img/16081909508541503013588246.jpg","reservable":false,"efficacy":"清洁控油 补水保湿"},{"id":"161","goods_name":"男士补水活力矿物蚕丝7片 今日送7片共14片","shop_price":59.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/161/goods_img/16081909077546170320476224.jpg","reservable":false,"efficacy":"补水保湿 清爽控油"},{"id":"516","goods_name":"男士清爽亮采面膜套装14片","shop_price":79.9,"market_price":198,"goods_img":"http://image.hmeili.com/yunifang/images/goods/516/goods_img/160819094247314792800294349.jpg","reservable":false,"efficacy":"清爽控油 净透亮肤"},{"id":"514","goods_name":"男士清爽净痘亮采套装21片","shop_price":109.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/514/goods_img/16081909425937696616207001.jpg","reservable":false,"efficacy":"清爽控油 净痘亮彩"},{"id":"870","goods_name":"男士深海水动力三件套（礼盒装）","shop_price":109.9,"market_price":208.8,"goods_img":"http://image.hmeili.com/yunifang/images/goods/870/goods_img/160819143153618813111554454.jpg","reservable":false,"efficacy":"解决肌渴 爆发水能量"},{"id":"1212","goods_name":"男士新品|茶树清痘净爽泥浆面膜110g","shop_price":79,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1212/goods_img/161120110788710403903073534.jpg","reservable":false,"efficacy":"深层清洁 净肤祛痘"},{"id":"1213","goods_name":"男士新品|橄榄石畅透亮肤黑面膜5片","shop_price":59.9,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1213/goods_img/16112011174805234612745667.jpg","reservable":false,"efficacy":"控油亮肤 清爽透亮"},{"id":"1214","goods_name":"男士新品|海盐炫活亮肤面膜","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1214/goods_img/1611201229207648144994110.jpg","reservable":false,"efficacy":"炫活亮肤 清爽舒缓"},{"id":"1215","goods_name":"男士新品丨火山岩净透控油黑面膜5片","shop_price":49.9,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1215/goods_img/16112012349006647978335734.jpg","reservable":false,"efficacy":"净透控油 舒爽体验"},{"id":"1216","goods_name":"男士新品|净畅黑头泥浆鼻膜60g","shop_price":59,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1216/goods_img/161120124273911769788096987.jpg","reservable":false,"efficacy":"改善黑头 收缩毛孔"},{"id":"1217","goods_name":"男士新品丨火山泥清洁控油泥浆面膜","shop_price":79,"market_price":139,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1217/goods_img/161120124763716596592995963.jpg","reservable":false,"efficacy":"清洁控油 清爽不油腻"},{"id":"1218","goods_name":"男士新品丨炫活亮肤洁面乳","shop_price":49,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1218/goods_img/161120125345819475356221525.jpg","reservable":false,"efficacy":"改善黯哑  清洁亮肤"},{"id":"1219","goods_name":"男士新品丨炫活亮肤晶露","shop_price":59,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1219/goods_img/16112013058403452949723470.jpg","reservable":false,"efficacy":"深层补水 改善黯哑"},{"id":"1220","goods_name":"男士炫活亮肤凝乳","shop_price":69,"market_price":89,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1220/goods_img/161120132537912312357149912.jpg","reservable":false,"efficacy":"改善黯哑 保湿锁水"},{"id":"1221","goods_name":"男士新品丨炫活亮肤礼盒","shop_price":139.9,"market_price":237,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1221/goods_img/161120132834212433896505066.jpg","reservable":false,"efficacy":"炫活亮彩 劲能醒肤"}],"goodsIdsList":["1699","1698","1176","869","598","868","17","871","687","161","516","514","870","1212","1213","1214","1215","1216","1217","1218","1219","1220","1221"]},{"id":"16","title":"贴式面膜","detail":"融入优质原材，汇聚鲜活精粹\n源源补充肌肤所需营养\n膜布轻柔质地，亲肤贴肤\n多倍亲和渗透力\n肌肤自在好呼吸\n大容量精华液，淡淡清香\n给肌肤带来愉悦的护理体验\n15分钟亲肤享受\n敷出水嫩润泽素颜肌","image":"http://image.hmeili.com/yunifang/images/goods/temp/1609280904444476518778630.jpg","start_time":"2016.09.28 09:04:23","end_time":"2017.03.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"428","goods_name":"多彩水润亮颜蚕丝面膜套装21片","shop_price":79.9,"market_price":270.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/428/goods_img/160819094034113421009937866.jpg","reservable":false,"efficacy":"吸黑焕彩 补水保湿"},{"id":"389","goods_name":"清爽平衡矿物蚕丝面膜黑面膜21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/389/goods_img/16081909368531961221339216.jpg","reservable":false,"efficacy":"以黑吸黑 净透亮肤"},{"id":"1189","goods_name":"热销黑膜丨清透水嫩亮颜黑面膜套装21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1189/goods_img/161128144382319687354892538.jpg","reservable":false,"efficacy":"净透补水 润泽提亮"},{"id":"1224","goods_name":"新品推荐|水润皙颜面膜套装21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1224/goods_img/17010410156820301725524608.jpg","reservable":false,"efficacy":"清洁控油 补水提亮"},{"id":"1248","goods_name":"新品面膜|御泥坊海洋水漾透润面膜7片","shop_price":59.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1248/goods_img/161125212640917710585897403.jpg","reservable":false,"efficacy":"补水保湿 滋养肌肤"},{"id":"1638","goods_name":"新品上市|嫩肌酵素黑膜礼盒21片","shop_price":139.9,"market_price":299,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1638/goods_img/17030210211762506087062132.jpg","reservable":false,"efficacy":"鲜果酵素 弹嫩水润"},{"id":"6","goods_name":"好用不贵丨亮颜水润蚕丝面膜（寂地定制版）","shop_price":59.9,"market_price":239.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/6/goods_img/160819084594721181484473699.jpg","reservable":false,"efficacy":"深层补水 提亮肤色"},{"id":"8","goods_name":"镇店之宝|美白嫩肤面膜20片","shop_price":139.9,"market_price":298,"goods_img":"https://image.yunifang.com/yunifang/images/goods/8/goods_img/1703060954389257968293129.jpg","reservable":false,"efficacy":"爆款面膜 明星同款"},{"id":"959","goods_name":"水光肌微精华矿物面膜","shop_price":69,"market_price":89,"goods_img":"http://image.hmeili.com/yunifang/images/goods/959/goods_img/160906100761117725619574092.jpg","reservable":false,"efficacy":"水光迸发 素肌绽放"},{"id":"85","goods_name":"果味鲜饮|水果鲜润亮肤补水面膜套装17片","shop_price":59.9,"market_price":240,"goods_img":"http://image.hmeili.com/yunifang/images/goods/85/goods_img/160819085747012099748482408.jpg","reservable":false,"efficacy":"水嫩舒爽 鲜活亮颜"},{"id":"772","goods_name":"清爽亮颜黑面膜套装21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/772/goods_img/1608191429278479187604212.jpg","reservable":false,"efficacy":"热销黑膜 净透亮肤"},{"id":"593","goods_name":"热销黑膜丨葡萄籽琉璃亮颜黑面膜21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/593/goods_img/1608190945359698973439364.jpg","reservable":false,"efficacy":"葡萄鲜饮 净透亮肤"},{"id":"514","goods_name":"男士清爽净痘亮采套装21片","shop_price":109.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/514/goods_img/16081909425937696616207001.jpg","reservable":false,"efficacy":"清爽控油 净痘亮彩"},{"id":"319","goods_name":"男士补水活力矿物蚕丝21片","shop_price":99,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/319/goods_img/16081909273161845841818485.jpg","reservable":false,"efficacy":"补水保湿 清爽控油"},{"id":"730","goods_name":"莹亮透白矿物蚕丝面膜套装28片","shop_price":169.9,"market_price":436,"goods_img":"http://image.hmeili.com/yunifang/images/goods/730/goods_img/16081909524222235149291721.jpg","reservable":false,"efficacy":"莹亮透白 光彩闪耀"},{"id":"534","goods_name":"净透美白矿物蚕丝面膜套装28片","shop_price":139.9,"market_price":396,"goods_img":"http://image.hmeili.com/yunifang/images/goods/534/goods_img/160819094245115265661305031.jpg","reservable":false,"efficacy":"清洁净透 以白养白"},{"id":"95","goods_name":"多效套装丨补水滋养提亮修护多效蚕丝面膜28片","shop_price":139.9,"market_price":416,"goods_img":"http://image.hmeili.com/yunifang/images/goods/95/goods_img/160819085823018111120147866.jpg","reservable":false,"efficacy":"补水滋养 提亮修护"}],"goodsIdsList":["428","389","1189","1224","1248","1638","6","8","959","85","772","593","514","319","730","534","95"]},{"id":"14","title":"实惠套装","detail":"简单几步\n给肌肤整套呵护\n甄选优质原材\n为肌肤层层注入营养\n清爽控油 补水保湿 美白提亮\n精心搭配全套养护\n按流程护肤事半功倍","image":"http://image.hmeili.com/yunifang/images/goods/temp/1609280905423494989195088.jpg","start_time":"2016.09.28 09:05:49","end_time":"2017.12.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"16","goods_name":"玫瑰滋养保湿四件套","shop_price":169.9,"market_price":259.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/16/goods_img/16081908495157874536435487.jpg","reservable":false,"efficacy":"一整套源源补水"},{"id":"189","goods_name":"高回购率丨清爽平衡护肤三件套","shop_price":99.9,"market_price":179.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/189/goods_img/160819091183119066095185335.jpg","reservable":false,"efficacy":"深层清洁 平衡水油"},{"id":"71","goods_name":"红石榴矿物补水亮肤十件套","shop_price":159.99,"market_price":319.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/71/goods_img/160819085118618037277379170.jpg","reservable":false,"efficacy":"补水保湿 鲜活亮肤"},{"id":"253","goods_name":"美白嫩肤睡眠四件套","shop_price":239.9,"market_price":309.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/253/goods_img/16110920078693304771874925.jpg","reservable":false,"efficacy":"美白补水 净白如初"},{"id":"185","goods_name":"美白嫩肤护肤基础三件套装","shop_price":169.9,"market_price":209.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/185/goods_img/161109205558015059221705123.jpg","reservable":false,"efficacy":"温和清洁 补水美白"},{"id":"15","goods_name":"清爽控油泥浆面膜四件套","shop_price":179.9,"market_price":279.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/15/goods_img/160819084839612979380157998.jpg","reservable":false,"efficacy":"一套清爽控油"},{"id":"596","goods_name":"薰衣草补水舒缓护肤三件套","shop_price":159,"market_price":217,"goods_img":"http://image.hmeili.com/yunifang/images/goods/596/goods_img/16081909464073809280443780.jpg","reservable":false,"efficacy":"深度滋养 舒缓修护"},{"id":"211","goods_name":"银杏亮采焕肤睡眠四件套装","shop_price":269.9,"market_price":329.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/211/goods_img/160819091434410143385788659.jpg","reservable":false,"efficacy":"提升光泽 点亮美丽"},{"id":"205","goods_name":"芦荟清洁控油净痘淡印护理两件套","shop_price":128,"market_price":158,"goods_img":"http://image.hmeili.com/yunifang/images/goods/205/goods_img/16081909133052334468184028.jpg","reservable":false,"efficacy":"休止痘印 舒爽无痕"},{"id":"229","goods_name":"薰衣草修护保湿四件套装","shop_price":269.9,"market_price":339.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/229/goods_img/160819091452319876638191775.jpg","reservable":false,"efficacy":"改善受损 舒缓修护"},{"id":"255","goods_name":"清爽平衡睡眠护肤四件套装","shop_price":209.9,"market_price":259.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/255/goods_img/16081909265819605278452488.jpg","reservable":false,"efficacy":"控油补水  清爽净透"},{"id":"191","goods_name":"清洁补水保湿护肤三件套","shop_price":279,"market_price":347,"goods_img":"http://image.hmeili.com/yunifang/images/goods/191/goods_img/16081909118566356917232988.jpg","reservable":false,"efficacy":"温和清洁 补水保湿"}],"goodsIdsList":["16","189","71","253","185","15","955","596","211","205","229","255","191"]},{"id":"13","title":"明星单品","detail":"夜间润养的睡眠面膜\n吸附清洁的泥浆面膜\n清透不粘腻的润肤水\n温和清洁的洁面乳\n优选御泥坊明星单品大集合\n一瓶一罐品质满满\n好用不贵 效果出众","image":"http://image.hmeili.com/yunifang/images/goods/temp/160928090680504224406736.jpg","start_time":"2016.09.28 09:06:07","end_time":"2017.06.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"446","goods_name":"芦荟补水保湿凝胶150g","shop_price":49.9,"market_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/446/goods_img/16081909409518953549635059.jpg","reservable":false,"efficacy":"水水润润 修护受损"},{"id":"10","goods_name":"美白嫩肤睡眠面膜180g","shop_price":69,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/10/goods_img/161109200044614716799834077.jpg","reservable":false,"efficacy":"补水美白 越睡越白"},{"id":"313","goods_name":"清爽平衡矿物爽肤水150ml","shop_price":65,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/313/goods_img/160819092628116143728778105.jpg","reservable":false,"efficacy":"补水控油 收敛毛孔"},{"id":"141","goods_name":"清爽平衡矿物睡眠面膜180g","shop_price":69.9,"market_price":79.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/141/goods_img/160819090489317926014897812.jpg","reservable":false,"efficacy":"平衡水油 清爽净透"},{"id":"3","goods_name":"清爽平衡矿物洁面乳100ml","shop_price":26.9,"market_price":29.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/3/goods_img/160819084315017845139127816.jpg","reservable":false,"efficacy":"深层清洁 平衡水油"},{"id":"315","goods_name":"玫瑰滋养矿物润肤水","shop_price":65,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/315/goods_img/160819092638220971403079814.jpg","reservable":false,"efficacy":"持久保湿 静享芬芳"},{"id":"340","goods_name":"黑玫瑰矿物柔肤乳液120ml","shop_price":159,"market_price":169,"goods_img":"http://image.hmeili.com/yunifang/images/goods/340/goods_img/160819092931413070202481427.jpg","reservable":false,"efficacy":"提亮肤色 补水润肤"},{"id":"338","goods_name":"薰衣草矿物柔肤乳液120ml","shop_price":89,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/338/goods_img/160819092964320132162271201.jpg","reservable":false,"efficacy":"水润滋养 舒缓修护"},{"id":"403","goods_name":"黑玫瑰矿物精华液30ml","shop_price":159,"market_price":199,"goods_img":"http://image.hmeili.com/yunifang/images/goods/403/goods_img/160819093789216886909199956.jpg","reservable":false,"efficacy":"深度保养 提亮肤色"},{"id":"317","goods_name":"红石榴矿物养肤水150ml","shop_price":69,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/317/goods_img/160819092775417735367991709.jpg","reservable":false,"efficacy":"持续补水 莹润透亮"}],"goodsIdsList":["446","344","10","313","141","3","315","340","338","403","317"]},{"id":"11","title":"睡眠面膜","detail":"细腻柔滑质感\n轻轻涂抹易揉开\n清爽不粘腻 好吸收\n不必担心弄脏衣领和被子\n于美梦中源源润养肌肤\n翌日醒来肌肤光彩照人","image":"http://image.hmeili.com/yunifang/images/goods/temp/1609280908290513459618380.jpg","start_time":"2016.09.28 09:08:25","end_time":"2017.09.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"9","goods_name":"玫瑰滋养矿物睡眠面膜180g","shop_price":59.9,"market_price":79.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/9/goods_img/160819084569920890610621654.jpg","reservable":false,"efficacy":"镇店之宝 彻夜补水"},{"id":"10","goods_name":"美白嫩肤睡眠面膜180g","shop_price":69,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/10/goods_img/161109200044614716799834077.jpg","reservable":false,"efficacy":"补水美白 越睡越白"},{"id":"141","goods_name":"清爽平衡矿物睡眠面膜180g","shop_price":69.9,"market_price":79.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/141/goods_img/160819090489317926014897812.jpg","reservable":false,"efficacy":"平衡水油 清爽净透"},{"id":"153","goods_name":"蜂蜜矿物睡眠面膜180g","shop_price":99,"market_price":109,"goods_img":"http://image.hmeili.com/yunifang/images/goods/153/goods_img/16081909056325842723014612.jpg","reservable":false,"efficacy":"补水滋养 柔润嫩肤"},{"id":"143","goods_name":"黑玫瑰矿物睡眠面膜180g","shop_price":139,"market_price":159,"goods_img":"http://image.hmeili.com/yunifang/images/goods/143/goods_img/160819090410413544395528977.jpg","reservable":false,"efficacy":"滋养净透 璀璨亮颜"},{"id":"151","goods_name":"红石榴鲜活矿物睡眠面膜180g","shop_price":99,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/151/goods_img/16081909054507867930003657.jpg","reservable":false,"efficacy":"源源养护 鲜活亮颜"},{"id":"147","goods_name":"人参矿物睡眠面膜180g","shop_price":129,"market_price":149,"goods_img":"http://image.hmeili.com/yunifang/images/goods/147/goods_img/160819090549411816633367846.jpg","reservable":false,"efficacy":"三参宠护 青春光泽"},{"id":"145","goods_name":"洋甘菊矿物睡眠面膜180g","shop_price":109.9,"market_price":129.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/145/goods_img/160819090579213684120831643.jpg","reservable":false,"efficacy":"舒缓修护 健康养肤"},{"id":"139","goods_name":"芦荟矿物睡眠面膜180g","shop_price":99,"market_price":129,"goods_img":"http://image.hmeili.com/yunifang/images/goods/139/goods_img/16081909049706137637561178.jpg","reservable":false,"efficacy":"淡化痘印 舒爽无痕"},{"id":"157","goods_name":"光感皙妍矿物睡眠面膜180g","shop_price":119,"market_price":139,"goods_img":"http://image.hmeili.com/yunifang/images/goods/157/goods_img/16081909062668407652566107.jpg","reservable":false,"efficacy":"补水亮颜 光感立现"},{"id":"155","goods_name":"黑茶修护矿物睡眠面膜180g","shop_price":169,"market_price":199,"goods_img":"http://image.hmeili.com/yunifang/images/goods/155/goods_img/1608190906982202985815286.jpg","reservable":false,"efficacy":"六维修护 优质保养"}],"goodsIdsList":["9","10","141","153","143","151","147","159","145","139","157","155"]},{"id":"10","title":"泥浆面膜","detail":"御泥坊以\u201c泥\u201d著称\n质感细腻柔滑的泥浆\n具有更强的吸附能力\n能深入清洁肌肤\n吸附毛孔污垢 收敛毛孔\n保持肌肤清爽不油腻\n倍享泥浆洁净护肤体验","image":"http://image.hmeili.com/yunifang/images/goods/temp/1609280909585522694823269.jpg","start_time":"2016.09.28 09:08:47","end_time":"2017.06.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"559","goods_name":"热销泥浆丨竹炭净透矿物泥浆面膜110g","shop_price":59,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/559/goods_img/16081909445727749257882094.jpg","reservable":false,"efficacy":"控油净肤 细腻毛孔"},{"id":"903","goods_name":"绿豆原浆泥面膜100g","shop_price":69,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/903/goods_img/16081914318755132085345401.jpg","reservable":false,"efficacy":"绿豆鲜粹 控油清痘"},{"id":"13","goods_name":"芦荟泥浆面膜110g","shop_price":69,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/13/goods_img/16083021124081202108009565.jpg","reservable":false,"efficacy":"休止痘痘 平滑肌肤"},{"id":"125","goods_name":"深层清洁矿物泥浆面膜260g","shop_price":119,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/125/goods_img/160819090177310444496298297.jpg","reservable":false,"efficacy":"深层清洁 净享清新"},{"id":"127","goods_name":"黑玫瑰泥浆面膜260g","shop_price":199,"market_price":199,"goods_img":"http://image.hmeili.com/yunifang/images/goods/127/goods_img/160819090188019322803025635.jpg","reservable":false,"efficacy":"滋养润滑 提亮肤色"},{"id":"12","goods_name":"美白嫩肤泥浆面膜260g","shop_price":129,"market_price":129,"goods_img":"http://image.hmeili.com/yunifang/images/goods/12/goods_img/1611092002609629373951762.jpg","reservable":false,"efficacy":"清洁净透 亮白润泽"},{"id":"129","goods_name":"蜂蜜泥浆面膜260g","shop_price":119,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/129/goods_img/16081909012221965131318640.jpg","reservable":false,"efficacy":"清洁滋养 水润细腻"},{"id":"133","goods_name":"薰衣草泥浆面膜110g","shop_price":69,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/133/goods_img/16083021362531202108008866.jpg","reservable":false,"efficacy":"改善受损 舒缓修护"},{"id":"131","goods_name":"光感皙妍矿物泥浆面膜260g","shop_price":159,"market_price":159,"goods_img":"http://image.hmeili.com/yunifang/images/goods/131/goods_img/160819090249014906086187882.jpg","reservable":false,"efficacy":"亮颜柔嫩 光感立现"},{"id":"348","goods_name":"绿茶泥浆面膜260g","shop_price":169,"market_price":169,"goods_img":"http://image.hmeili.com/yunifang/images/goods/348/goods_img/16092917151586045147234614.jpg","reservable":false,"efficacy":"清洁肌肤 收敛毛孔"}],"goodsIdsList":["559","903","13","125","127","12","129","133","131","348"]}],"bestSellers":[{"id":"2","name":"本周热销","descript":"1","state":"1","show_number":6,"begin_date":"2017.02.15 09:56:58","end_date":"2017.06.15 10:00:00","goodsList":[{"id":"6","goods_name":"好用不贵丨亮颜水润蚕丝面膜（寂地定制版）","shop_price":59.9,"market_price":239.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/6/goods_img/160819084594721181484473699.jpg","reservable":false,"efficacy":"深层补水 提亮肤色"},{"id":"189","goods_name":"高回购率丨清爽平衡护肤三件套","shop_price":99.9,"market_price":179.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/189/goods_img/160819091183119066095185335.jpg","reservable":false,"efficacy":"深层清洁 平衡水油"},{"id":"85","goods_name":"果味鲜饮|水果鲜润亮肤补水面膜套装17片","shop_price":59.9,"market_price":240,"goods_img":"http://image.hmeili.com/yunifang/images/goods/85/goods_img/160819085747012099748482408.jpg","reservable":false,"efficacy":"水嫩舒爽 鲜活亮颜"},{"id":"5","goods_name":"黑眼圈不见啦丨金桂花矿物眼膜贴60片","shop_price":69,"market_price":89,"goods_img":"http://image.hmeili.com/yunifang/images/goods/5/goods_img/16081908444051052195086751.jpg","reservable":false,"efficacy":"补水靓眼 改善熊猫眼"},{"id":"428","goods_name":"多彩水润亮颜蚕丝面膜套装21片","shop_price":79.9,"market_price":270.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/428/goods_img/160819094034113421009937866.jpg","reservable":false,"efficacy":"吸黑焕彩 补水保湿"},{"id":"1234","goods_name":"热销|樱桃鲜润补水矿物面膜7片","shop_price":39.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1234/goods_img/161122183456315727984418108.jpg","reservable":false,"efficacy":"补水保湿  润泽滋养"},{"id":"446","goods_name":"芦荟补水保湿凝胶150g","shop_price":49.9,"market_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/446/goods_img/16081909409518953549635059.jpg","reservable":false,"efficacy":"水水润润 修护受损"},{"id":"14","goods_name":"矿物泥浆鼻膜60g","shop_price":55,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/14/goods_img/160819084841216186223194195.jpg","reservable":false,"efficacy":"草莓鼻小救星 收敛毛孔"},{"id":"9","goods_name":"玫瑰滋养矿物睡眠面膜180g","shop_price":59.9,"market_price":79.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/9/goods_img/160819084569920890610621654.jpg","reservable":false,"efficacy":"镇店之宝 彻夜补水"}],"goodsIdsList":["6","189","85","5","428","1234","446","14","9"]}],"activityInfo":{"activityAreaDisplay":"1","activityInfoList":[{"id":"1","activityImg":"https://image.yunifang.com/yunifang/images/goods/temp/170314093761019893797815826.jpg","activityType":"4","activityData":"177","activityDataDetail":"177","startSeconds":"-191225","endSeconds":"352374","activityStatus":"2","activityAreaDisplay":"1","countDownEnable":"1","starttime":"2017.03.14 10:00:00","endtime":"2017.03.20 17:00:00","sort":0},{"id":"8","activityImg":"https://image.yunifang.com/yunifang/images/goods/temp/170316101076414603756144092.jpg","activityType":"2","activityData":"1699","activityDataDetail":"1699","activityAreaDisplay":"1","countDownEnable":"0","starttime":"2017.03.16 10:12:19","endtime":"2017.07.31 10:12:21","sort":0},{"id":"21","activityImg":"http://image.hmeili.com/yunifang/images/goods/temp/1611141100711533046163493.jpg","activityType":"1","activityData":"http://h.yunifang.com/invite/invite.html?login_check=2","activityDataDetail":"http%3A%2F%2Fh.yunifang.com%2Finvite%2Finvite.html%3Flogin_check%3D2","activityAreaDisplay":"1","countDownEnable":"0","sort":0}]},"ad1":[{"id":"881","image":"https://image.yunifang.com/yunifang/images/goods/ad0/17031517406303974036478057.jpg","ad_type":0,"sort":1056,"position":0,"enabled":1,"createtime":"2017.03.15 17:41:12","createuser":"hani","ad_type_dynamic":"1","ad_type_dynamic_data":"http://h.yunifang.com/h/manNews.html","ad_type_dynamic_detail":"http%3A%2F%2Fh.yunifang.com%2Fh%2FmanNews.html","show_channel":"1,2","title":"男士高端系列","channelType":"1"},{"id":"880","image":"https://image.yunifang.com/yunifang/images/goods/ad0/1703151603387814865615044.jpg","ad_type":0,"sort":1055,"position":0,"enabled":1,"createtime":"2017.03.15 16:04:22","createuser":"hani","lastupdateuser":"lingyue","ad_type_dynamic":"61","ad_type_dynamic_data":"68","ad_type_dynamic_detail":"68","show_channel":"1,2,3,4","title":"搭配购","channelType":"0"},{"id":"513","image":"https://image.yunifang.com/yunifang/images/goods/ad0/1701190959809077048917947.jpg","ad_type":0,"sort":1052,"position":0,"enabled":1,"createtime":"2016.05.23 18:45:30","createuser":"shanxian","ad_type_dynamic":"1","ad_type_dynamic_data":"http://h.yunifang.com/h/11_meet.html","ad_type_dynamic_detail":"http%3A%2F%2Fh.yunifang.com%2Fh%2F11_meet.html","show_channel":"1,2,3,4","channelType":"0"},{"id":"871","image":"https://image.yunifang.com/yunifang/images/goods/ad0/170301165920612393251158072.jpg","ad_type":0,"sort":1051,"position":0,"enabled":1,"createtime":"2017.03.01 16:59:34","createuser":"hani","ad_type_dynamic":"2","ad_type_dynamic_data":"1615","ad_type_dynamic_detail":"1615","show_channel":"1,2,3,4","title":"蒸汽眼罩","channelType":"0"},{"id":"823","image":"http://image.hmeili.com/yunifang/images/goods/ad0/170111173213619823650768274.jpg","ad_type":0,"sort":1050,"position":0,"enabled":1,"createtime":"2017.01.11 15:59:17","createuser":"ruge","ad_type_dynamic":"69","show_channel":"1,2","channelType":"1"},{"id":"723","image":"http://image.hmeili.com/yunifang/images/goods/ad0/16122110567474029873241894.jpg","ad_type":0,"sort":1049,"position":0,"enabled":1,"createtime":"2016.10.31 18:09:49","createuser":"hani","ad_type_dynamic":"1","ad_type_dynamic_data":"http://m.yunifang.com/yunifang/web/h/integral-cash.html","ad_type_dynamic_detail":"http%3A%2F%2Fm.yunifang.com%2Fyunifang%2Fweb%2Fh%2Fintegral-cash.html","show_channel":"1,2,3,4","title":"积分超值抵现","channelType":"0"},{"id":"693","image":"http://image.hmeili.com/yunifang/images/goods/ad0/16101517113385857065462262.jpg","ad_type":0,"sort":1046,"position":0,"enabled":1,"createtime":"2016.10.15 16:59:54","createuser":"leiling","ad_type_dynamic":"1","ad_type_dynamic_data":"http://h.yunifang.com/invite/invite.html?login_check=2","ad_type_dynamic_detail":"http%3A%2F%2Fh.yunifang.com%2Finvite%2Finvite.html%3Flogin_check%3D2","show_channel":"1","title":"邀请有礼安卓","channelType":"3"},{"id":"491","image":"http://image.hmeili.com/yunifang/images/goods/ad0/16090611503412651428962103.jpg","ad_type":0,"sort":1044,"position":0,"enabled":1,"createtime":"2016.05.13 18:35:44","createuser":"shanxian","ad_type_dynamic":"1","ad_type_dynamic_data":"http://h.yunifang.com/member/info.html","ad_type_dynamic_detail":"http%3A%2F%2Fh.yunifang.com%2Fmember%2Finfo.html","show_channel":"1,2,3,4","channelType":"0"},{"id":"879","image":"https://image.yunifang.com/yunifang/images/goods/ad0/17030317572876071477102023.jpg","ad_type":0,"sort":1043,"position":0,"enabled":1,"createtime":"2017.03.03 17:57:49","createuser":"shanxian","ad_type_dynamic":"-1","channelType":"0"}],"ad5":[{"id":"359","image":"http://image.hmeili.com/yunifang/images/goods/ad0/160823172997710201253418883.png","ad_type":4,"sort":106,"position":5,"enabled":0,"ad_type_dynamic":"1","ad_type_dynamic_data":"http://h.yunifang.com/sign/sign.html?login_check=2","ad_type_dynamic_detail":"http%3A%2F%2Fh.yunifang.com%2Fsign%2Fsign.html%3Flogin_check%3D2","show_channel":"1,2","title":"每日签到"},{"id":"358","image":"http://image.hmeili.com/yunifang/images/goods/ad0/160623120383916524110935835.png","ad_type":1,"url":"http://mobile.hmeili.com/yunifang/web/member/gift","sort":104,"position":5,"enabled":0,"ad_type_dynamic":"1","ad_type_dynamic_data":"http://m.yunifang.com/yunifang/mobile/creditShop/loginDBShop?dbredirect=http://www.duiba.com.cn/chome/index","ad_type_dynamic_detail":"http%3A%2F%2Fm.yunifang.com%2Fyunifang%2Fmobile%2FcreditShop%2FloginDBShop%3Fdbredirect%3Dhttp%3A%2F%2Fwww.duiba.com.cn%2Fchome%2Findex","show_channel":"1,2","title":"积分商城"},{"id":"357","image":"http://image.hmeili.com/yunifang/images/goods/ad0/160623120326416505640517284.png","ad_type":1,"url":"http://mobile.hmeili.com/yunifang/web/help/cash","sort":102,"position":5,"enabled":0,"ad_type_dynamic":"1","ad_type_dynamic_data":"http://h.yunifang.com/exchange/code_app.html?login_check=1","ad_type_dynamic_detail":"http%3A%2F%2Fh.yunifang.com%2Fexchange%2Fcode_app.html%3Flogin_check%3D1","show_channel":"1,2","title":"兑换专区"},{"id":"360","image":"http://image.hmeili.com/yunifang/images/goods/ad0/160623120430916487170096321.png","ad_type":1,"url":"http://www.yunifang.com/a/fangweichaxun/wap_fwcx.html","sort":100,"position":5,"enabled":0,"ad_type_dynamic":"1","ad_type_dynamic_data":"http://www.yunifang.com/a/fangweichaxun/wap_fwcx.html","ad_type_dynamic_detail":"http%3A%2F%2Fwww.yunifang.com%2Fa%2Ffangweichaxun%2Fwap_fwcx.html","show_channel":"1,2,3,4","title":"真伪查询"}],"defaultGoodsList":[{"id":"121","goods_name":"镇店之宝丨美白嫩肤面膜7片","shop_price":49.9,"market_price":99,"goods_img":"https://image.yunifang.com/yunifang/images/goods/121/goods_img/170301091610311632161123479.jpg","reservable":false,"efficacy":"镇店之宝 美白爆款"},{"id":"389","goods_name":"清爽平衡矿物蚕丝面膜黑面膜21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/389/goods_img/16081909368531961221339216.jpg","reservable":false,"efficacy":"以黑吸黑 净透亮肤"},{"id":"85","goods_name":"果味鲜饮|水果鲜润亮肤补水面膜套装17片","shop_price":59.9,"market_price":240,"goods_img":"http://image.hmeili.com/yunifang/images/goods/85/goods_img/160819085747012099748482408.jpg","reservable":false,"efficacy":"水嫩舒爽 鲜活亮颜"},{"id":"684","goods_name":"【凑单必买】花粹水润面膜套装10片","shop_price":29.9,"market_price":139,"goods_img":"http://image.hmeili.com/yunifang/images/goods/684/goods_img/160819095063413908186337181.jpg","reservable":false,"efficacy":"水润充盈 鲜嫩少女肌"},{"id":"6","goods_name":"好用不贵丨亮颜水润蚕丝面膜（寂地定制版）","shop_price":59.9,"market_price":239.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/6/goods_img/160819084594721181484473699.jpg","reservable":false,"efficacy":"深层补水 提亮肤色"},{"id":"343","goods_name":"美白嫩肤润肤水150ml","shop_price":59,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/343/goods_img/161109195539019451480402371.jpg","reservable":false,"efficacy":"补水保湿 美白嫩肤"}],"creditRecived":false}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * subjects : [{"id":"35","title":"缤纷新品","detail":"缤纷上新 懂你所爱\n每一次上新 都是一次相遇\n但我更希望 能在护肤的路上与你牵手同行\n了解你的喜怒哀乐与点点滴滴\n陪在你身边 用美好好宠爱你","image":"http://image.hmeili.com/yunifang/images/goods/temp/161130100494020947901157808.jpg","start_time":"2016.11.30 10:01:16","end_time":"2017.03.28 00:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"1638","goods_name":"新品上市|嫩肌酵素黑膜礼盒21片","shop_price":139.9,"market_price":299,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1638/goods_img/17030210211762506087062132.jpg","reservable":false,"efficacy":"鲜果酵素 弹嫩水润"},{"id":"1615","goods_name":"新品上市丨御泥坊悠然舒缓蒸汽眼罩","shop_price":49,"market_price":49,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1615/goods_img/17021711575612130589207037.jpg","reservable":false,"efficacy":"舒缓疲劳 莹亮眼周"},{"id":"1280","goods_name":"潜心研制|御泥坊精华水分光感气垫BB霜 新品上市","shop_price":139,"market_price":169,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1280/goods_img/16120518307098199689667991.jpg","reservable":false,"efficacy":"控油遮瑕 水润透亮"},{"id":"1250","goods_name":"新品推荐|红石榴矿物面霜50g","shop_price":79,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1250/goods_img/16120711377623595883702997.jpg","reservable":false,"efficacy":"水润亮颜 紧致淡纹"},{"id":"1330","goods_name":"新品推荐|男士冰川深润补水面膜","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1330/goods_img/161226170256015772208103754.jpg","reservable":false,"efficacy":"深润补水 长效保湿"},{"id":"1281","goods_name":"红石榴矿物眼霜25g","shop_price":129,"market_price":159,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1281/goods_img/17030611054128553621233557.jpg","reservable":false,"efficacy":"亮肤修护 改善补水"},{"id":"1254","goods_name":"新品推荐|黑珍珠盈润亮采黑面膜7片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1254/goods_img/16112517549399376533709198.jpg","reservable":false,"efficacy":"清洁补水 提亮肤色"},{"id":"1234","goods_name":"热销|樱桃鲜润补水矿物面膜7片","shop_price":39.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1234/goods_img/161122183456315727984418108.jpg","reservable":false,"efficacy":"补水保湿  润泽滋养"},{"id":"1256","goods_name":"新品面膜丨埃及洛神花紧致面膜5片 3段式提拉","shop_price":59.9,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1256/goods_img/161128101656810774865882474.jpg","reservable":false,"efficacy":"润泽修护 提拉紧致"},{"id":"1258","goods_name":"新品水果面膜|牛油果水润亲肤黑面膜7片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1258/goods_img/16112810259763472659996926.jpg","reservable":false,"efficacy":"补水保湿 清洁净透"},{"id":"1277","goods_name":"新品面膜|异域风情水润亮颜面膜套装","shop_price":119.9,"market_price":159.8,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1277/goods_img/16113015251372332658926589.jpg","reservable":false,"efficacy":"补水保湿 润泽修护"},{"id":"1257","goods_name":"新品面膜丨瑞士欧锦葵深补水修护面膜5片","shop_price":59.9,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1257/goods_img/16112810218779610552336670.jpg","reservable":false,"efficacy":"深层补水 舒缓修护"},{"id":"1248","goods_name":"新品面膜|御泥坊海洋水漾透润面膜7片","shop_price":59.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1248/goods_img/161125212640917710585897403.jpg","reservable":false,"efficacy":"补水保湿 滋养肌肤"},{"id":"1252","goods_name":"柠檬鲜萃净颜矿物面膜7片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1252/goods_img/161125204853020531022844238.jpg","reservable":false,"efficacy":"清洁控油 补水保湿"},{"id":"1230","goods_name":"男士舒爽清透矿物洁面乳","shop_price":29.9,"market_price":39.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1230/goods_img/161122113046021358243094018.jpg","reservable":false,"efficacy":"深透清洁 清透毛孔"},{"id":"1228","goods_name":"男士珊瑚清洁控油面膜5片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1228/goods_img/161122111317219082185346251.jpg","reservable":false,"efficacy":"清洁控油 平滑毛孔"},{"id":"1229","goods_name":"男士黑茶清爽矿物面膜20片 黄致列定制版","shop_price":99.9,"market_price":375,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1229/goods_img/161122112568013495425696259.jpg","reservable":false,"efficacy":"净透肌肤 清洁控油"},{"id":"1227","goods_name":"男士红盐活力爽肤面膜5片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1227/goods_img/16112211067297788200406393.jpg","reservable":false,"efficacy":"提升活力 畅透醒肤"},{"id":"1220","goods_name":"男士炫活亮肤凝乳","shop_price":69,"market_price":89,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1220/goods_img/161120132537912312357149912.jpg","reservable":false,"efficacy":"改善黯哑 保湿锁水"},{"id":"1219","goods_name":"男士新品丨炫活亮肤晶露","shop_price":59,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1219/goods_img/16112013058403452949723470.jpg","reservable":false,"efficacy":"深层补水 改善黯哑"},{"id":"1218","goods_name":"男士新品丨炫活亮肤洁面乳","shop_price":49,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1218/goods_img/161120125345819475356221525.jpg","reservable":false,"efficacy":"改善黯哑  清洁亮肤"},{"id":"1221","goods_name":"男士新品丨炫活亮肤礼盒","shop_price":139.9,"market_price":237,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1221/goods_img/161120132834212433896505066.jpg","reservable":false,"efficacy":"炫活亮彩 劲能醒肤"},{"id":"1226","goods_name":"男士白茶控油面膜5片","shop_price":39.9,"market_price":75,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1226/goods_img/161122104426019564249198030.jpg","reservable":false,"efficacy":"清爽控油 净化肌肤"},{"id":"1216","goods_name":"男士新品|净畅黑头泥浆鼻膜60g","shop_price":59,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1216/goods_img/161120124273911769788096987.jpg","reservable":false,"efficacy":"改善黑头 收缩毛孔"},{"id":"1217","goods_name":"男士新品丨火山泥清洁控油泥浆面膜","shop_price":79,"market_price":139,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1217/goods_img/161120124763716596592995963.jpg","reservable":false,"efficacy":"清洁控油 清爽不油腻"},{"id":"1212","goods_name":"男士新品|茶树清痘净爽泥浆面膜110g","shop_price":79,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1212/goods_img/161120110788710403903073534.jpg","reservable":false,"efficacy":"深层清洁 净肤祛痘"},{"id":"1213","goods_name":"男士新品|橄榄石畅透亮肤黑面膜5片","shop_price":59.9,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1213/goods_img/16112011174805234612745667.jpg","reservable":false,"efficacy":"控油亮肤 清爽透亮"},{"id":"1214","goods_name":"男士新品|海盐炫活亮肤面膜","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1214/goods_img/1611201229207648144994110.jpg","reservable":false,"efficacy":"炫活亮肤 清爽舒缓"},{"id":"1215","goods_name":"男士新品丨火山岩净透控油黑面膜5片","shop_price":49.9,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1215/goods_img/16112012349006647978335734.jpg","reservable":false,"efficacy":"净透控油 舒爽体验"},{"id":"1352","goods_name":"男士新品丨黑茶净爽沐浴露150ml","shop_price":19.9,"market_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1352/goods_img/170109115166212137535299302.jpg","reservable":false,"efficacy":"净爽清洁 舒缓滋润"}],"goodsIdsList":["1638","1615","1280","1250","1331","1330","1281","1254","1234","1256","1258","1262","1277","1257","1248","1252","1325","1230","1228","1229","1227","1220","1219","1218","1221","1226","1216","1217","1212","1213","1214","1215","1352"]},{"id":"17","title":"热销爆款","detail":"御泥坊APP畅销优品\n千万会员的口碑之选\n轻薄服帖的贴士面膜\n清洁吸附的泥浆面膜\n彻夜润养的睡眠面膜\n妹子们缔造美肌的必备选择","image":"http://image.hmeili.com/yunifang/images/goods/temp/160928090305467283569257.jpg","start_time":"2016.09.28 09:02:02","end_time":"2017.03.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"9","goods_name":"玫瑰滋养矿物睡眠面膜180g","shop_price":59.9,"market_price":79.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/9/goods_img/160819084569920890610621654.jpg","reservable":false,"efficacy":"镇店之宝 彻夜补水"},{"id":"559","goods_name":"热销泥浆丨竹炭净透矿物泥浆面膜110g","shop_price":59,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/559/goods_img/16081909445727749257882094.jpg","reservable":false,"efficacy":"控油净肤 细腻毛孔"},{"id":"14","goods_name":"矿物泥浆鼻膜60g","shop_price":55,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/14/goods_img/160819084841216186223194195.jpg","reservable":false,"efficacy":"草莓鼻小救星 收敛毛孔"},{"id":"446","goods_name":"芦荟补水保湿凝胶150g","shop_price":49.9,"market_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/446/goods_img/16081909409518953549635059.jpg","reservable":false,"efficacy":"水水润润 修护受损"},{"id":"10","goods_name":"美白嫩肤睡眠面膜180g","shop_price":69,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/10/goods_img/161109200044614716799834077.jpg","reservable":false,"efficacy":"补水美白 越睡越白"},{"id":"8","goods_name":"镇店之宝|美白嫩肤面膜20片","shop_price":139.9,"market_price":298,"goods_img":"https://image.yunifang.com/yunifang/images/goods/8/goods_img/1703060954389257968293129.jpg","reservable":false,"efficacy":"爆款面膜 明星同款"},{"id":"101","goods_name":"玫瑰滋养矿物洁面乳100ml","shop_price":26.9,"market_price":29.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/101/goods_img/160819085919220738763253204.jpg","reservable":false,"efficacy":"温和清洁 补水保湿"},{"id":"343","goods_name":"美白嫩肤润肤水150ml","shop_price":59,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/343/goods_img/161109195539019451480402371.jpg","reservable":false,"efficacy":"补水保湿 美白嫩肤"},{"id":"16","goods_name":"玫瑰滋养保湿四件套","shop_price":169.9,"market_price":259.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/16/goods_img/16081908495157874536435487.jpg","reservable":false,"efficacy":"一整套源源补水"},{"id":"389","goods_name":"清爽平衡矿物蚕丝面膜黑面膜21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/389/goods_img/16081909368531961221339216.jpg","reservable":false,"efficacy":"以黑吸黑 净透亮肤"}],"goodsIdsList":["9","559","14","446","10","8","101","343","16","389"]},{"id":"12","title":"型男之选","detail":"针对男士肤质\n精选补水控油原材\n改善男士肌肤缺水、水油失衡的状态\n深入补水，清爽控油，收敛毛孔\n带来畅爽护肤新感觉\n唤醒型男自信魅力","image":"http://image.hmeili.com/yunifang/images/goods/temp/1609280906311531930037465.jpg","start_time":"2016.09.28 09:06:49","end_time":"2017.06.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"1699","goods_name":"男士新品丨玉石紧致细肤水凝面膜","shop_price":49.9,"market_price":159,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1699/goods_img/170314092523919884876852385.jpg","reservable":false,"efficacy":"紧致细肤 平抚肌纹"},{"id":"1698","goods_name":"男士新品丨碧玺滋养修护水凝面膜","shop_price":49.9,"market_price":159,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1698/goods_img/17031409161239002438572691.jpg","reservable":false,"efficacy":"滋养修护 提升活力"},{"id":"1176","goods_name":"新品上市丨男士火山泥清洁控油洁面乳2支装","shop_price":39.9,"market_price":89,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1176/goods_img/16111400198611202108006896.jpg","reservable":false,"efficacy":"深层清洁 平衡水油"},{"id":"869","goods_name":"男士深海水动力洁面乳","shop_price":39.9,"market_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/869/goods_img/16081914304586693050802388.jpg","reservable":false,"efficacy":"洁净控油 深层补水"},{"id":"598","goods_name":"男士黑茶清爽控油矿物泥浆面膜260g","shop_price":69,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/598/goods_img/16081909464842878902279307.jpg","reservable":false,"efficacy":"清洁控油 保湿收毛孔"},{"id":"868","goods_name":"男士黑茶清爽矿物面膜  今日买5片送5片","shop_price":49.9,"market_price":150,"goods_img":"http://image.hmeili.com/yunifang/images/goods/868/goods_img/1608191430564693145258305.jpg","reservable":false,"efficacy":"洁净控油 强劲清爽"},{"id":"17","goods_name":"礼盒装丨男士黑茶控油护肤三件套","shop_price":99.9,"market_price":199.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/17/goods_img/16081908499853298911775471.jpg","reservable":false,"efficacy":"清洁控油 神清气爽"},{"id":"871","goods_name":"男士深海水动力面膜5片","shop_price":39.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/871/goods_img/16081914311832949617861907.jpg","reservable":false,"efficacy":"水润肌肤 长效锁水"},{"id":"687","goods_name":"男士黑茶控油爽肤水90ml","shop_price":39.9,"market_price":69.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/687/goods_img/16081909508541503013588246.jpg","reservable":false,"efficacy":"清洁控油 补水保湿"},{"id":"161","goods_name":"男士补水活力矿物蚕丝7片 今日送7片共14片","shop_price":59.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/161/goods_img/16081909077546170320476224.jpg","reservable":false,"efficacy":"补水保湿 清爽控油"},{"id":"516","goods_name":"男士清爽亮采面膜套装14片","shop_price":79.9,"market_price":198,"goods_img":"http://image.hmeili.com/yunifang/images/goods/516/goods_img/160819094247314792800294349.jpg","reservable":false,"efficacy":"清爽控油 净透亮肤"},{"id":"514","goods_name":"男士清爽净痘亮采套装21片","shop_price":109.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/514/goods_img/16081909425937696616207001.jpg","reservable":false,"efficacy":"清爽控油 净痘亮彩"},{"id":"870","goods_name":"男士深海水动力三件套（礼盒装）","shop_price":109.9,"market_price":208.8,"goods_img":"http://image.hmeili.com/yunifang/images/goods/870/goods_img/160819143153618813111554454.jpg","reservable":false,"efficacy":"解决肌渴 爆发水能量"},{"id":"1212","goods_name":"男士新品|茶树清痘净爽泥浆面膜110g","shop_price":79,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1212/goods_img/161120110788710403903073534.jpg","reservable":false,"efficacy":"深层清洁 净肤祛痘"},{"id":"1213","goods_name":"男士新品|橄榄石畅透亮肤黑面膜5片","shop_price":59.9,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1213/goods_img/16112011174805234612745667.jpg","reservable":false,"efficacy":"控油亮肤 清爽透亮"},{"id":"1214","goods_name":"男士新品|海盐炫活亮肤面膜","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1214/goods_img/1611201229207648144994110.jpg","reservable":false,"efficacy":"炫活亮肤 清爽舒缓"},{"id":"1215","goods_name":"男士新品丨火山岩净透控油黑面膜5片","shop_price":49.9,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1215/goods_img/16112012349006647978335734.jpg","reservable":false,"efficacy":"净透控油 舒爽体验"},{"id":"1216","goods_name":"男士新品|净畅黑头泥浆鼻膜60g","shop_price":59,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1216/goods_img/161120124273911769788096987.jpg","reservable":false,"efficacy":"改善黑头 收缩毛孔"},{"id":"1217","goods_name":"男士新品丨火山泥清洁控油泥浆面膜","shop_price":79,"market_price":139,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1217/goods_img/161120124763716596592995963.jpg","reservable":false,"efficacy":"清洁控油 清爽不油腻"},{"id":"1218","goods_name":"男士新品丨炫活亮肤洁面乳","shop_price":49,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1218/goods_img/161120125345819475356221525.jpg","reservable":false,"efficacy":"改善黯哑  清洁亮肤"},{"id":"1219","goods_name":"男士新品丨炫活亮肤晶露","shop_price":59,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1219/goods_img/16112013058403452949723470.jpg","reservable":false,"efficacy":"深层补水 改善黯哑"},{"id":"1220","goods_name":"男士炫活亮肤凝乳","shop_price":69,"market_price":89,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1220/goods_img/161120132537912312357149912.jpg","reservable":false,"efficacy":"改善黯哑 保湿锁水"},{"id":"1221","goods_name":"男士新品丨炫活亮肤礼盒","shop_price":139.9,"market_price":237,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1221/goods_img/161120132834212433896505066.jpg","reservable":false,"efficacy":"炫活亮彩 劲能醒肤"}],"goodsIdsList":["1699","1698","1176","869","598","868","17","871","687","161","516","514","870","1212","1213","1214","1215","1216","1217","1218","1219","1220","1221"]},{"id":"16","title":"贴式面膜","detail":"融入优质原材，汇聚鲜活精粹\n源源补充肌肤所需营养\n膜布轻柔质地，亲肤贴肤\n多倍亲和渗透力\n肌肤自在好呼吸\n大容量精华液，淡淡清香\n给肌肤带来愉悦的护理体验\n15分钟亲肤享受\n敷出水嫩润泽素颜肌","image":"http://image.hmeili.com/yunifang/images/goods/temp/1609280904444476518778630.jpg","start_time":"2016.09.28 09:04:23","end_time":"2017.03.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"428","goods_name":"多彩水润亮颜蚕丝面膜套装21片","shop_price":79.9,"market_price":270.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/428/goods_img/160819094034113421009937866.jpg","reservable":false,"efficacy":"吸黑焕彩 补水保湿"},{"id":"389","goods_name":"清爽平衡矿物蚕丝面膜黑面膜21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/389/goods_img/16081909368531961221339216.jpg","reservable":false,"efficacy":"以黑吸黑 净透亮肤"},{"id":"1189","goods_name":"热销黑膜丨清透水嫩亮颜黑面膜套装21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1189/goods_img/161128144382319687354892538.jpg","reservable":false,"efficacy":"净透补水 润泽提亮"},{"id":"1224","goods_name":"新品推荐|水润皙颜面膜套装21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1224/goods_img/17010410156820301725524608.jpg","reservable":false,"efficacy":"清洁控油 补水提亮"},{"id":"1248","goods_name":"新品面膜|御泥坊海洋水漾透润面膜7片","shop_price":59.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1248/goods_img/161125212640917710585897403.jpg","reservable":false,"efficacy":"补水保湿 滋养肌肤"},{"id":"1638","goods_name":"新品上市|嫩肌酵素黑膜礼盒21片","shop_price":139.9,"market_price":299,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1638/goods_img/17030210211762506087062132.jpg","reservable":false,"efficacy":"鲜果酵素 弹嫩水润"},{"id":"6","goods_name":"好用不贵丨亮颜水润蚕丝面膜（寂地定制版）","shop_price":59.9,"market_price":239.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/6/goods_img/160819084594721181484473699.jpg","reservable":false,"efficacy":"深层补水 提亮肤色"},{"id":"8","goods_name":"镇店之宝|美白嫩肤面膜20片","shop_price":139.9,"market_price":298,"goods_img":"https://image.yunifang.com/yunifang/images/goods/8/goods_img/1703060954389257968293129.jpg","reservable":false,"efficacy":"爆款面膜 明星同款"},{"id":"959","goods_name":"水光肌微精华矿物面膜","shop_price":69,"market_price":89,"goods_img":"http://image.hmeili.com/yunifang/images/goods/959/goods_img/160906100761117725619574092.jpg","reservable":false,"efficacy":"水光迸发 素肌绽放"},{"id":"85","goods_name":"果味鲜饮|水果鲜润亮肤补水面膜套装17片","shop_price":59.9,"market_price":240,"goods_img":"http://image.hmeili.com/yunifang/images/goods/85/goods_img/160819085747012099748482408.jpg","reservable":false,"efficacy":"水嫩舒爽 鲜活亮颜"},{"id":"772","goods_name":"清爽亮颜黑面膜套装21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/772/goods_img/1608191429278479187604212.jpg","reservable":false,"efficacy":"热销黑膜 净透亮肤"},{"id":"593","goods_name":"热销黑膜丨葡萄籽琉璃亮颜黑面膜21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/593/goods_img/1608190945359698973439364.jpg","reservable":false,"efficacy":"葡萄鲜饮 净透亮肤"},{"id":"514","goods_name":"男士清爽净痘亮采套装21片","shop_price":109.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/514/goods_img/16081909425937696616207001.jpg","reservable":false,"efficacy":"清爽控油 净痘亮彩"},{"id":"319","goods_name":"男士补水活力矿物蚕丝21片","shop_price":99,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/319/goods_img/16081909273161845841818485.jpg","reservable":false,"efficacy":"补水保湿 清爽控油"},{"id":"730","goods_name":"莹亮透白矿物蚕丝面膜套装28片","shop_price":169.9,"market_price":436,"goods_img":"http://image.hmeili.com/yunifang/images/goods/730/goods_img/16081909524222235149291721.jpg","reservable":false,"efficacy":"莹亮透白 光彩闪耀"},{"id":"534","goods_name":"净透美白矿物蚕丝面膜套装28片","shop_price":139.9,"market_price":396,"goods_img":"http://image.hmeili.com/yunifang/images/goods/534/goods_img/160819094245115265661305031.jpg","reservable":false,"efficacy":"清洁净透 以白养白"},{"id":"95","goods_name":"多效套装丨补水滋养提亮修护多效蚕丝面膜28片","shop_price":139.9,"market_price":416,"goods_img":"http://image.hmeili.com/yunifang/images/goods/95/goods_img/160819085823018111120147866.jpg","reservable":false,"efficacy":"补水滋养 提亮修护"}],"goodsIdsList":["428","389","1189","1224","1248","1638","6","8","959","85","772","593","514","319","730","534","95"]},{"id":"14","title":"实惠套装","detail":"简单几步\n给肌肤整套呵护\n甄选优质原材\n为肌肤层层注入营养\n清爽控油 补水保湿 美白提亮\n精心搭配全套养护\n按流程护肤事半功倍","image":"http://image.hmeili.com/yunifang/images/goods/temp/1609280905423494989195088.jpg","start_time":"2016.09.28 09:05:49","end_time":"2017.12.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"16","goods_name":"玫瑰滋养保湿四件套","shop_price":169.9,"market_price":259.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/16/goods_img/16081908495157874536435487.jpg","reservable":false,"efficacy":"一整套源源补水"},{"id":"189","goods_name":"高回购率丨清爽平衡护肤三件套","shop_price":99.9,"market_price":179.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/189/goods_img/160819091183119066095185335.jpg","reservable":false,"efficacy":"深层清洁 平衡水油"},{"id":"71","goods_name":"红石榴矿物补水亮肤十件套","shop_price":159.99,"market_price":319.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/71/goods_img/160819085118618037277379170.jpg","reservable":false,"efficacy":"补水保湿 鲜活亮肤"},{"id":"253","goods_name":"美白嫩肤睡眠四件套","shop_price":239.9,"market_price":309.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/253/goods_img/16110920078693304771874925.jpg","reservable":false,"efficacy":"美白补水 净白如初"},{"id":"185","goods_name":"美白嫩肤护肤基础三件套装","shop_price":169.9,"market_price":209.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/185/goods_img/161109205558015059221705123.jpg","reservable":false,"efficacy":"温和清洁 补水美白"},{"id":"15","goods_name":"清爽控油泥浆面膜四件套","shop_price":179.9,"market_price":279.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/15/goods_img/160819084839612979380157998.jpg","reservable":false,"efficacy":"一套清爽控油"},{"id":"596","goods_name":"薰衣草补水舒缓护肤三件套","shop_price":159,"market_price":217,"goods_img":"http://image.hmeili.com/yunifang/images/goods/596/goods_img/16081909464073809280443780.jpg","reservable":false,"efficacy":"深度滋养 舒缓修护"},{"id":"211","goods_name":"银杏亮采焕肤睡眠四件套装","shop_price":269.9,"market_price":329.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/211/goods_img/160819091434410143385788659.jpg","reservable":false,"efficacy":"提升光泽 点亮美丽"},{"id":"205","goods_name":"芦荟清洁控油净痘淡印护理两件套","shop_price":128,"market_price":158,"goods_img":"http://image.hmeili.com/yunifang/images/goods/205/goods_img/16081909133052334468184028.jpg","reservable":false,"efficacy":"休止痘印 舒爽无痕"},{"id":"229","goods_name":"薰衣草修护保湿四件套装","shop_price":269.9,"market_price":339.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/229/goods_img/160819091452319876638191775.jpg","reservable":false,"efficacy":"改善受损 舒缓修护"},{"id":"255","goods_name":"清爽平衡睡眠护肤四件套装","shop_price":209.9,"market_price":259.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/255/goods_img/16081909265819605278452488.jpg","reservable":false,"efficacy":"控油补水  清爽净透"},{"id":"191","goods_name":"清洁补水保湿护肤三件套","shop_price":279,"market_price":347,"goods_img":"http://image.hmeili.com/yunifang/images/goods/191/goods_img/16081909118566356917232988.jpg","reservable":false,"efficacy":"温和清洁 补水保湿"}],"goodsIdsList":["16","189","71","253","185","15","955","596","211","205","229","255","191"]},{"id":"13","title":"明星单品","detail":"夜间润养的睡眠面膜\n吸附清洁的泥浆面膜\n清透不粘腻的润肤水\n温和清洁的洁面乳\n优选御泥坊明星单品大集合\n一瓶一罐品质满满\n好用不贵 效果出众","image":"http://image.hmeili.com/yunifang/images/goods/temp/160928090680504224406736.jpg","start_time":"2016.09.28 09:06:07","end_time":"2017.06.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"446","goods_name":"芦荟补水保湿凝胶150g","shop_price":49.9,"market_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/446/goods_img/16081909409518953549635059.jpg","reservable":false,"efficacy":"水水润润 修护受损"},{"id":"10","goods_name":"美白嫩肤睡眠面膜180g","shop_price":69,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/10/goods_img/161109200044614716799834077.jpg","reservable":false,"efficacy":"补水美白 越睡越白"},{"id":"313","goods_name":"清爽平衡矿物爽肤水150ml","shop_price":65,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/313/goods_img/160819092628116143728778105.jpg","reservable":false,"efficacy":"补水控油 收敛毛孔"},{"id":"141","goods_name":"清爽平衡矿物睡眠面膜180g","shop_price":69.9,"market_price":79.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/141/goods_img/160819090489317926014897812.jpg","reservable":false,"efficacy":"平衡水油 清爽净透"},{"id":"3","goods_name":"清爽平衡矿物洁面乳100ml","shop_price":26.9,"market_price":29.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/3/goods_img/160819084315017845139127816.jpg","reservable":false,"efficacy":"深层清洁 平衡水油"},{"id":"315","goods_name":"玫瑰滋养矿物润肤水","shop_price":65,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/315/goods_img/160819092638220971403079814.jpg","reservable":false,"efficacy":"持久保湿 静享芬芳"},{"id":"340","goods_name":"黑玫瑰矿物柔肤乳液120ml","shop_price":159,"market_price":169,"goods_img":"http://image.hmeili.com/yunifang/images/goods/340/goods_img/160819092931413070202481427.jpg","reservable":false,"efficacy":"提亮肤色 补水润肤"},{"id":"338","goods_name":"薰衣草矿物柔肤乳液120ml","shop_price":89,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/338/goods_img/160819092964320132162271201.jpg","reservable":false,"efficacy":"水润滋养 舒缓修护"},{"id":"403","goods_name":"黑玫瑰矿物精华液30ml","shop_price":159,"market_price":199,"goods_img":"http://image.hmeili.com/yunifang/images/goods/403/goods_img/160819093789216886909199956.jpg","reservable":false,"efficacy":"深度保养 提亮肤色"},{"id":"317","goods_name":"红石榴矿物养肤水150ml","shop_price":69,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/317/goods_img/160819092775417735367991709.jpg","reservable":false,"efficacy":"持续补水 莹润透亮"}],"goodsIdsList":["446","344","10","313","141","3","315","340","338","403","317"]},{"id":"11","title":"睡眠面膜","detail":"细腻柔滑质感\n轻轻涂抹易揉开\n清爽不粘腻 好吸收\n不必担心弄脏衣领和被子\n于美梦中源源润养肌肤\n翌日醒来肌肤光彩照人","image":"http://image.hmeili.com/yunifang/images/goods/temp/1609280908290513459618380.jpg","start_time":"2016.09.28 09:08:25","end_time":"2017.09.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"9","goods_name":"玫瑰滋养矿物睡眠面膜180g","shop_price":59.9,"market_price":79.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/9/goods_img/160819084569920890610621654.jpg","reservable":false,"efficacy":"镇店之宝 彻夜补水"},{"id":"10","goods_name":"美白嫩肤睡眠面膜180g","shop_price":69,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/10/goods_img/161109200044614716799834077.jpg","reservable":false,"efficacy":"补水美白 越睡越白"},{"id":"141","goods_name":"清爽平衡矿物睡眠面膜180g","shop_price":69.9,"market_price":79.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/141/goods_img/160819090489317926014897812.jpg","reservable":false,"efficacy":"平衡水油 清爽净透"},{"id":"153","goods_name":"蜂蜜矿物睡眠面膜180g","shop_price":99,"market_price":109,"goods_img":"http://image.hmeili.com/yunifang/images/goods/153/goods_img/16081909056325842723014612.jpg","reservable":false,"efficacy":"补水滋养 柔润嫩肤"},{"id":"143","goods_name":"黑玫瑰矿物睡眠面膜180g","shop_price":139,"market_price":159,"goods_img":"http://image.hmeili.com/yunifang/images/goods/143/goods_img/160819090410413544395528977.jpg","reservable":false,"efficacy":"滋养净透 璀璨亮颜"},{"id":"151","goods_name":"红石榴鲜活矿物睡眠面膜180g","shop_price":99,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/151/goods_img/16081909054507867930003657.jpg","reservable":false,"efficacy":"源源养护 鲜活亮颜"},{"id":"147","goods_name":"人参矿物睡眠面膜180g","shop_price":129,"market_price":149,"goods_img":"http://image.hmeili.com/yunifang/images/goods/147/goods_img/160819090549411816633367846.jpg","reservable":false,"efficacy":"三参宠护 青春光泽"},{"id":"145","goods_name":"洋甘菊矿物睡眠面膜180g","shop_price":109.9,"market_price":129.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/145/goods_img/160819090579213684120831643.jpg","reservable":false,"efficacy":"舒缓修护 健康养肤"},{"id":"139","goods_name":"芦荟矿物睡眠面膜180g","shop_price":99,"market_price":129,"goods_img":"http://image.hmeili.com/yunifang/images/goods/139/goods_img/16081909049706137637561178.jpg","reservable":false,"efficacy":"淡化痘印 舒爽无痕"},{"id":"157","goods_name":"光感皙妍矿物睡眠面膜180g","shop_price":119,"market_price":139,"goods_img":"http://image.hmeili.com/yunifang/images/goods/157/goods_img/16081909062668407652566107.jpg","reservable":false,"efficacy":"补水亮颜 光感立现"},{"id":"155","goods_name":"黑茶修护矿物睡眠面膜180g","shop_price":169,"market_price":199,"goods_img":"http://image.hmeili.com/yunifang/images/goods/155/goods_img/1608190906982202985815286.jpg","reservable":false,"efficacy":"六维修护 优质保养"}],"goodsIdsList":["9","10","141","153","143","151","147","159","145","139","157","155"]},{"id":"10","title":"泥浆面膜","detail":"御泥坊以\u201c泥\u201d著称\n质感细腻柔滑的泥浆\n具有更强的吸附能力\n能深入清洁肌肤\n吸附毛孔污垢 收敛毛孔\n保持肌肤清爽不油腻\n倍享泥浆洁净护肤体验","image":"http://image.hmeili.com/yunifang/images/goods/temp/1609280909585522694823269.jpg","start_time":"2016.09.28 09:08:47","end_time":"2017.06.28 10:00:00","show_number":6,"state":"1","sort":0,"goodsList":[{"id":"559","goods_name":"热销泥浆丨竹炭净透矿物泥浆面膜110g","shop_price":59,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/559/goods_img/16081909445727749257882094.jpg","reservable":false,"efficacy":"控油净肤 细腻毛孔"},{"id":"903","goods_name":"绿豆原浆泥面膜100g","shop_price":69,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/903/goods_img/16081914318755132085345401.jpg","reservable":false,"efficacy":"绿豆鲜粹 控油清痘"},{"id":"13","goods_name":"芦荟泥浆面膜110g","shop_price":69,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/13/goods_img/16083021124081202108009565.jpg","reservable":false,"efficacy":"休止痘痘 平滑肌肤"},{"id":"125","goods_name":"深层清洁矿物泥浆面膜260g","shop_price":119,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/125/goods_img/160819090177310444496298297.jpg","reservable":false,"efficacy":"深层清洁 净享清新"},{"id":"127","goods_name":"黑玫瑰泥浆面膜260g","shop_price":199,"market_price":199,"goods_img":"http://image.hmeili.com/yunifang/images/goods/127/goods_img/160819090188019322803025635.jpg","reservable":false,"efficacy":"滋养润滑 提亮肤色"},{"id":"12","goods_name":"美白嫩肤泥浆面膜260g","shop_price":129,"market_price":129,"goods_img":"http://image.hmeili.com/yunifang/images/goods/12/goods_img/1611092002609629373951762.jpg","reservable":false,"efficacy":"清洁净透 亮白润泽"},{"id":"129","goods_name":"蜂蜜泥浆面膜260g","shop_price":119,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/129/goods_img/16081909012221965131318640.jpg","reservable":false,"efficacy":"清洁滋养 水润细腻"},{"id":"133","goods_name":"薰衣草泥浆面膜110g","shop_price":69,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/133/goods_img/16083021362531202108008866.jpg","reservable":false,"efficacy":"改善受损 舒缓修护"},{"id":"131","goods_name":"光感皙妍矿物泥浆面膜260g","shop_price":159,"market_price":159,"goods_img":"http://image.hmeili.com/yunifang/images/goods/131/goods_img/160819090249014906086187882.jpg","reservable":false,"efficacy":"亮颜柔嫩 光感立现"},{"id":"348","goods_name":"绿茶泥浆面膜260g","shop_price":169,"market_price":169,"goods_img":"http://image.hmeili.com/yunifang/images/goods/348/goods_img/16092917151586045147234614.jpg","reservable":false,"efficacy":"清洁肌肤 收敛毛孔"}],"goodsIdsList":["559","903","13","125","127","12","129","133","131","348"]}]
         * bestSellers : [{"id":"2","name":"本周热销","descript":"1","state":"1","show_number":6,"begin_date":"2017.02.15 09:56:58","end_date":"2017.06.15 10:00:00","goodsList":[{"id":"6","goods_name":"好用不贵丨亮颜水润蚕丝面膜（寂地定制版）","shop_price":59.9,"market_price":239.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/6/goods_img/160819084594721181484473699.jpg","reservable":false,"efficacy":"深层补水 提亮肤色"},{"id":"189","goods_name":"高回购率丨清爽平衡护肤三件套","shop_price":99.9,"market_price":179.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/189/goods_img/160819091183119066095185335.jpg","reservable":false,"efficacy":"深层清洁 平衡水油"},{"id":"85","goods_name":"果味鲜饮|水果鲜润亮肤补水面膜套装17片","shop_price":59.9,"market_price":240,"goods_img":"http://image.hmeili.com/yunifang/images/goods/85/goods_img/160819085747012099748482408.jpg","reservable":false,"efficacy":"水嫩舒爽 鲜活亮颜"},{"id":"5","goods_name":"黑眼圈不见啦丨金桂花矿物眼膜贴60片","shop_price":69,"market_price":89,"goods_img":"http://image.hmeili.com/yunifang/images/goods/5/goods_img/16081908444051052195086751.jpg","reservable":false,"efficacy":"补水靓眼 改善熊猫眼"},{"id":"428","goods_name":"多彩水润亮颜蚕丝面膜套装21片","shop_price":79.9,"market_price":270.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/428/goods_img/160819094034113421009937866.jpg","reservable":false,"efficacy":"吸黑焕彩 补水保湿"},{"id":"1234","goods_name":"热销|樱桃鲜润补水矿物面膜7片","shop_price":39.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1234/goods_img/161122183456315727984418108.jpg","reservable":false,"efficacy":"补水保湿  润泽滋养"},{"id":"446","goods_name":"芦荟补水保湿凝胶150g","shop_price":49.9,"market_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/446/goods_img/16081909409518953549635059.jpg","reservable":false,"efficacy":"水水润润 修护受损"},{"id":"14","goods_name":"矿物泥浆鼻膜60g","shop_price":55,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/14/goods_img/160819084841216186223194195.jpg","reservable":false,"efficacy":"草莓鼻小救星 收敛毛孔"},{"id":"9","goods_name":"玫瑰滋养矿物睡眠面膜180g","shop_price":59.9,"market_price":79.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/9/goods_img/160819084569920890610621654.jpg","reservable":false,"efficacy":"镇店之宝 彻夜补水"}],"goodsIdsList":["6","189","85","5","428","1234","446","14","9"]}]
         * activityInfo : {"activityAreaDisplay":"1","activityInfoList":[{"id":"1","activityImg":"https://image.yunifang.com/yunifang/images/goods/temp/170314093761019893797815826.jpg","activityType":"4","activityData":"177","activityDataDetail":"177","startSeconds":"-191225","endSeconds":"352374","activityStatus":"2","activityAreaDisplay":"1","countDownEnable":"1","starttime":"2017.03.14 10:00:00","endtime":"2017.03.20 17:00:00","sort":0},{"id":"8","activityImg":"https://image.yunifang.com/yunifang/images/goods/temp/170316101076414603756144092.jpg","activityType":"2","activityData":"1699","activityDataDetail":"1699","activityAreaDisplay":"1","countDownEnable":"0","starttime":"2017.03.16 10:12:19","endtime":"2017.07.31 10:12:21","sort":0},{"id":"21","activityImg":"http://image.hmeili.com/yunifang/images/goods/temp/1611141100711533046163493.jpg","activityType":"1","activityData":"http://h.yunifang.com/invite/invite.html?login_check=2","activityDataDetail":"http%3A%2F%2Fh.yunifang.com%2Finvite%2Finvite.html%3Flogin_check%3D2","activityAreaDisplay":"1","countDownEnable":"0","sort":0}]}
         * ad1 : [{"id":"881","image":"https://image.yunifang.com/yunifang/images/goods/ad0/17031517406303974036478057.jpg","ad_type":0,"sort":1056,"position":0,"enabled":1,"createtime":"2017.03.15 17:41:12","createuser":"hani","ad_type_dynamic":"1","ad_type_dynamic_data":"http://h.yunifang.com/h/manNews.html","ad_type_dynamic_detail":"http%3A%2F%2Fh.yunifang.com%2Fh%2FmanNews.html","show_channel":"1,2","title":"男士高端系列","channelType":"1"},{"id":"880","image":"https://image.yunifang.com/yunifang/images/goods/ad0/1703151603387814865615044.jpg","ad_type":0,"sort":1055,"position":0,"enabled":1,"createtime":"2017.03.15 16:04:22","createuser":"hani","lastupdateuser":"lingyue","ad_type_dynamic":"61","ad_type_dynamic_data":"68","ad_type_dynamic_detail":"68","show_channel":"1,2,3,4","title":"搭配购","channelType":"0"},{"id":"513","image":"https://image.yunifang.com/yunifang/images/goods/ad0/1701190959809077048917947.jpg","ad_type":0,"sort":1052,"position":0,"enabled":1,"createtime":"2016.05.23 18:45:30","createuser":"shanxian","ad_type_dynamic":"1","ad_type_dynamic_data":"http://h.yunifang.com/h/11_meet.html","ad_type_dynamic_detail":"http%3A%2F%2Fh.yunifang.com%2Fh%2F11_meet.html","show_channel":"1,2,3,4","channelType":"0"},{"id":"871","image":"https://image.yunifang.com/yunifang/images/goods/ad0/170301165920612393251158072.jpg","ad_type":0,"sort":1051,"position":0,"enabled":1,"createtime":"2017.03.01 16:59:34","createuser":"hani","ad_type_dynamic":"2","ad_type_dynamic_data":"1615","ad_type_dynamic_detail":"1615","show_channel":"1,2,3,4","title":"蒸汽眼罩","channelType":"0"},{"id":"823","image":"http://image.hmeili.com/yunifang/images/goods/ad0/170111173213619823650768274.jpg","ad_type":0,"sort":1050,"position":0,"enabled":1,"createtime":"2017.01.11 15:59:17","createuser":"ruge","ad_type_dynamic":"69","show_channel":"1,2","channelType":"1"},{"id":"723","image":"http://image.hmeili.com/yunifang/images/goods/ad0/16122110567474029873241894.jpg","ad_type":0,"sort":1049,"position":0,"enabled":1,"createtime":"2016.10.31 18:09:49","createuser":"hani","ad_type_dynamic":"1","ad_type_dynamic_data":"http://m.yunifang.com/yunifang/web/h/integral-cash.html","ad_type_dynamic_detail":"http%3A%2F%2Fm.yunifang.com%2Fyunifang%2Fweb%2Fh%2Fintegral-cash.html","show_channel":"1,2,3,4","title":"积分超值抵现","channelType":"0"},{"id":"693","image":"http://image.hmeili.com/yunifang/images/goods/ad0/16101517113385857065462262.jpg","ad_type":0,"sort":1046,"position":0,"enabled":1,"createtime":"2016.10.15 16:59:54","createuser":"leiling","ad_type_dynamic":"1","ad_type_dynamic_data":"http://h.yunifang.com/invite/invite.html?login_check=2","ad_type_dynamic_detail":"http%3A%2F%2Fh.yunifang.com%2Finvite%2Finvite.html%3Flogin_check%3D2","show_channel":"1","title":"邀请有礼安卓","channelType":"3"},{"id":"491","image":"http://image.hmeili.com/yunifang/images/goods/ad0/16090611503412651428962103.jpg","ad_type":0,"sort":1044,"position":0,"enabled":1,"createtime":"2016.05.13 18:35:44","createuser":"shanxian","ad_type_dynamic":"1","ad_type_dynamic_data":"http://h.yunifang.com/member/info.html","ad_type_dynamic_detail":"http%3A%2F%2Fh.yunifang.com%2Fmember%2Finfo.html","show_channel":"1,2,3,4","channelType":"0"},{"id":"879","image":"https://image.yunifang.com/yunifang/images/goods/ad0/17030317572876071477102023.jpg","ad_type":0,"sort":1043,"position":0,"enabled":1,"createtime":"2017.03.03 17:57:49","createuser":"shanxian","ad_type_dynamic":"-1","channelType":"0"}]
         * ad5 : [{"id":"359","image":"http://image.hmeili.com/yunifang/images/goods/ad0/160823172997710201253418883.png","ad_type":4,"sort":106,"position":5,"enabled":0,"ad_type_dynamic":"1","ad_type_dynamic_data":"http://h.yunifang.com/sign/sign.html?login_check=2","ad_type_dynamic_detail":"http%3A%2F%2Fh.yunifang.com%2Fsign%2Fsign.html%3Flogin_check%3D2","show_channel":"1,2","title":"每日签到"},{"id":"358","image":"http://image.hmeili.com/yunifang/images/goods/ad0/160623120383916524110935835.png","ad_type":1,"url":"http://mobile.hmeili.com/yunifang/web/member/gift","sort":104,"position":5,"enabled":0,"ad_type_dynamic":"1","ad_type_dynamic_data":"http://m.yunifang.com/yunifang/mobile/creditShop/loginDBShop?dbredirect=http://www.duiba.com.cn/chome/index","ad_type_dynamic_detail":"http%3A%2F%2Fm.yunifang.com%2Fyunifang%2Fmobile%2FcreditShop%2FloginDBShop%3Fdbredirect%3Dhttp%3A%2F%2Fwww.duiba.com.cn%2Fchome%2Findex","show_channel":"1,2","title":"积分商城"},{"id":"357","image":"http://image.hmeili.com/yunifang/images/goods/ad0/160623120326416505640517284.png","ad_type":1,"url":"http://mobile.hmeili.com/yunifang/web/help/cash","sort":102,"position":5,"enabled":0,"ad_type_dynamic":"1","ad_type_dynamic_data":"http://h.yunifang.com/exchange/code_app.html?login_check=1","ad_type_dynamic_detail":"http%3A%2F%2Fh.yunifang.com%2Fexchange%2Fcode_app.html%3Flogin_check%3D1","show_channel":"1,2","title":"兑换专区"},{"id":"360","image":"http://image.hmeili.com/yunifang/images/goods/ad0/160623120430916487170096321.png","ad_type":1,"url":"http://www.yunifang.com/a/fangweichaxun/wap_fwcx.html","sort":100,"position":5,"enabled":0,"ad_type_dynamic":"1","ad_type_dynamic_data":"http://www.yunifang.com/a/fangweichaxun/wap_fwcx.html","ad_type_dynamic_detail":"http%3A%2F%2Fwww.yunifang.com%2Fa%2Ffangweichaxun%2Fwap_fwcx.html","show_channel":"1,2,3,4","title":"真伪查询"}]
         * defaultGoodsList : [{"id":"121","goods_name":"镇店之宝丨美白嫩肤面膜7片","shop_price":49.9,"market_price":99,"goods_img":"https://image.yunifang.com/yunifang/images/goods/121/goods_img/170301091610311632161123479.jpg","reservable":false,"efficacy":"镇店之宝 美白爆款"},{"id":"389","goods_name":"清爽平衡矿物蚕丝面膜黑面膜21片","shop_price":99.9,"market_price":297,"goods_img":"http://image.hmeili.com/yunifang/images/goods/389/goods_img/16081909368531961221339216.jpg","reservable":false,"efficacy":"以黑吸黑 净透亮肤"},{"id":"85","goods_name":"果味鲜饮|水果鲜润亮肤补水面膜套装17片","shop_price":59.9,"market_price":240,"goods_img":"http://image.hmeili.com/yunifang/images/goods/85/goods_img/160819085747012099748482408.jpg","reservable":false,"efficacy":"水嫩舒爽 鲜活亮颜"},{"id":"684","goods_name":"【凑单必买】花粹水润面膜套装10片","shop_price":29.9,"market_price":139,"goods_img":"http://image.hmeili.com/yunifang/images/goods/684/goods_img/160819095063413908186337181.jpg","reservable":false,"efficacy":"水润充盈 鲜嫩少女肌"},{"id":"6","goods_name":"好用不贵丨亮颜水润蚕丝面膜（寂地定制版）","shop_price":59.9,"market_price":239.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/6/goods_img/160819084594721181484473699.jpg","reservable":false,"efficacy":"深层补水 提亮肤色"},{"id":"343","goods_name":"美白嫩肤润肤水150ml","shop_price":59,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/343/goods_img/161109195539019451480402371.jpg","reservable":false,"efficacy":"补水保湿 美白嫩肤"}]
         * creditRecived : false
         */

        private ActivityInfoBean activityInfo;
        private boolean creditRecived;
        private List<SubjectsBean> subjects;
        private List<BestSellersBean> bestSellers;
        private List<Ad1Bean> ad1;
        private List<Ad5Bean> ad5;
        private List<DefaultGoodsListBean> defaultGoodsList;

        public ActivityInfoBean getActivityInfo() {
            return activityInfo;
        }

        public void setActivityInfo(ActivityInfoBean activityInfo) {
            this.activityInfo = activityInfo;
        }

        public boolean isCreditRecived() {
            return creditRecived;
        }

        public void setCreditRecived(boolean creditRecived) {
            this.creditRecived = creditRecived;
        }

        public List<SubjectsBean> getSubjects() {
            return subjects;
        }

        public void setSubjects(List<SubjectsBean> subjects) {
            this.subjects = subjects;
        }

        public List<BestSellersBean> getBestSellers() {
            return bestSellers;
        }

        public void setBestSellers(List<BestSellersBean> bestSellers) {
            this.bestSellers = bestSellers;
        }

        public List<Ad1Bean> getAd1() {
            return ad1;
        }

        public void setAd1(List<Ad1Bean> ad1) {
            this.ad1 = ad1;
        }

        public List<Ad5Bean> getAd5() {
            return ad5;
        }

        public void setAd5(List<Ad5Bean> ad5) {
            this.ad5 = ad5;
        }

        public List<DefaultGoodsListBean> getDefaultGoodsList() {
            return defaultGoodsList;
        }

        public void setDefaultGoodsList(List<DefaultGoodsListBean> defaultGoodsList) {
            this.defaultGoodsList = defaultGoodsList;
        }

        public static class ActivityInfoBean {
            /**
             * activityAreaDisplay : 1
             * activityInfoList : [{"id":"1","activityImg":"https://image.yunifang.com/yunifang/images/goods/temp/170314093761019893797815826.jpg","activityType":"4","activityData":"177","activityDataDetail":"177","startSeconds":"-191225","endSeconds":"352374","activityStatus":"2","activityAreaDisplay":"1","countDownEnable":"1","starttime":"2017.03.14 10:00:00","endtime":"2017.03.20 17:00:00","sort":0},{"id":"8","activityImg":"https://image.yunifang.com/yunifang/images/goods/temp/170316101076414603756144092.jpg","activityType":"2","activityData":"1699","activityDataDetail":"1699","activityAreaDisplay":"1","countDownEnable":"0","starttime":"2017.03.16 10:12:19","endtime":"2017.07.31 10:12:21","sort":0},{"id":"21","activityImg":"http://image.hmeili.com/yunifang/images/goods/temp/1611141100711533046163493.jpg","activityType":"1","activityData":"http://h.yunifang.com/invite/invite.html?login_check=2","activityDataDetail":"http%3A%2F%2Fh.yunifang.com%2Finvite%2Finvite.html%3Flogin_check%3D2","activityAreaDisplay":"1","countDownEnable":"0","sort":0}]
             */

            private String activityAreaDisplay;
            private List<ActivityInfoListBean> activityInfoList;

            public String getActivityAreaDisplay() {
                return activityAreaDisplay;
            }

            public void setActivityAreaDisplay(String activityAreaDisplay) {
                this.activityAreaDisplay = activityAreaDisplay;
            }

            public List<ActivityInfoListBean> getActivityInfoList() {
                return activityInfoList;
            }

            public void setActivityInfoList(List<ActivityInfoListBean> activityInfoList) {
                this.activityInfoList = activityInfoList;
            }

            public static class ActivityInfoListBean {
                /**
                 * id : 1
                 * activityImg : https://image.yunifang.com/yunifang/images/goods/temp/170314093761019893797815826.jpg
                 * activityType : 4
                 * activityData : 177
                 * activityDataDetail : 177
                 * startSeconds : -191225
                 * endSeconds : 352374
                 * activityStatus : 2
                 * activityAreaDisplay : 1
                 * countDownEnable : 1
                 * starttime : 2017.03.14 10:00:00
                 * endtime : 2017.03.20 17:00:00
                 * sort : 0
                 */

                private String id;
                private String activityImg;
                private String activityType;
                private String activityData;
                private String activityDataDetail;
                private String startSeconds;
                private String endSeconds;
                private String activityStatus;
                private String activityAreaDisplay;
                private String countDownEnable;
                private String starttime;
                private String endtime;
                private int sort;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getActivityImg() {
                    return activityImg;
                }

                public void setActivityImg(String activityImg) {
                    this.activityImg = activityImg;
                }

                public String getActivityType() {
                    return activityType;
                }

                public void setActivityType(String activityType) {
                    this.activityType = activityType;
                }

                public String getActivityData() {
                    return activityData;
                }

                public void setActivityData(String activityData) {
                    this.activityData = activityData;
                }

                public String getActivityDataDetail() {
                    return activityDataDetail;
                }

                public void setActivityDataDetail(String activityDataDetail) {
                    this.activityDataDetail = activityDataDetail;
                }

                public String getStartSeconds() {
                    return startSeconds;
                }

                public void setStartSeconds(String startSeconds) {
                    this.startSeconds = startSeconds;
                }

                public String getEndSeconds() {
                    return endSeconds;
                }

                public void setEndSeconds(String endSeconds) {
                    this.endSeconds = endSeconds;
                }

                public String getActivityStatus() {
                    return activityStatus;
                }

                public void setActivityStatus(String activityStatus) {
                    this.activityStatus = activityStatus;
                }

                public String getActivityAreaDisplay() {
                    return activityAreaDisplay;
                }

                public void setActivityAreaDisplay(String activityAreaDisplay) {
                    this.activityAreaDisplay = activityAreaDisplay;
                }

                public String getCountDownEnable() {
                    return countDownEnable;
                }

                public void setCountDownEnable(String countDownEnable) {
                    this.countDownEnable = countDownEnable;
                }

                public String getStarttime() {
                    return starttime;
                }

                public void setStarttime(String starttime) {
                    this.starttime = starttime;
                }

                public String getEndtime() {
                    return endtime;
                }

                public void setEndtime(String endtime) {
                    this.endtime = endtime;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }
            }
        }

        public static class SubjectsBean {
            /**
             * id : 35
             * title : 缤纷新品
             * detail : 缤纷上新 懂你所爱
             每一次上新 都是一次相遇
             但我更希望 能在护肤的路上与你牵手同行
             了解你的喜怒哀乐与点点滴滴
             陪在你身边 用美好好宠爱你
             * image : http://image.hmeili.com/yunifang/images/goods/temp/161130100494020947901157808.jpg
             * start_time : 2016.11.30 10:01:16
             * end_time : 2017.03.28 00:00:00
             * show_number : 6
             * state : 1
             * sort : 0
             * goodsList : [{"id":"1638","goods_name":"新品上市|嫩肌酵素黑膜礼盒21片","shop_price":139.9,"market_price":299,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1638/goods_img/17030210211762506087062132.jpg","reservable":false,"efficacy":"鲜果酵素 弹嫩水润"},{"id":"1615","goods_name":"新品上市丨御泥坊悠然舒缓蒸汽眼罩","shop_price":49,"market_price":49,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1615/goods_img/17021711575612130589207037.jpg","reservable":false,"efficacy":"舒缓疲劳 莹亮眼周"},{"id":"1280","goods_name":"潜心研制|御泥坊精华水分光感气垫BB霜 新品上市","shop_price":139,"market_price":169,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1280/goods_img/16120518307098199689667991.jpg","reservable":false,"efficacy":"控油遮瑕 水润透亮"},{"id":"1250","goods_name":"新品推荐|红石榴矿物面霜50g","shop_price":79,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1250/goods_img/16120711377623595883702997.jpg","reservable":false,"efficacy":"水润亮颜 紧致淡纹"},{"id":"1330","goods_name":"新品推荐|男士冰川深润补水面膜","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1330/goods_img/161226170256015772208103754.jpg","reservable":false,"efficacy":"深润补水 长效保湿"},{"id":"1281","goods_name":"红石榴矿物眼霜25g","shop_price":129,"market_price":159,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1281/goods_img/17030611054128553621233557.jpg","reservable":false,"efficacy":"亮肤修护 改善补水"},{"id":"1254","goods_name":"新品推荐|黑珍珠盈润亮采黑面膜7片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1254/goods_img/16112517549399376533709198.jpg","reservable":false,"efficacy":"清洁补水 提亮肤色"},{"id":"1234","goods_name":"热销|樱桃鲜润补水矿物面膜7片","shop_price":39.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1234/goods_img/161122183456315727984418108.jpg","reservable":false,"efficacy":"补水保湿  润泽滋养"},{"id":"1256","goods_name":"新品面膜丨埃及洛神花紧致面膜5片 3段式提拉","shop_price":59.9,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1256/goods_img/161128101656810774865882474.jpg","reservable":false,"efficacy":"润泽修护 提拉紧致"},{"id":"1258","goods_name":"新品水果面膜|牛油果水润亲肤黑面膜7片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1258/goods_img/16112810259763472659996926.jpg","reservable":false,"efficacy":"补水保湿 清洁净透"},{"id":"1277","goods_name":"新品面膜|异域风情水润亮颜面膜套装","shop_price":119.9,"market_price":159.8,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1277/goods_img/16113015251372332658926589.jpg","reservable":false,"efficacy":"补水保湿 润泽修护"},{"id":"1257","goods_name":"新品面膜丨瑞士欧锦葵深补水修护面膜5片","shop_price":59.9,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1257/goods_img/16112810218779610552336670.jpg","reservable":false,"efficacy":"深层补水 舒缓修护"},{"id":"1248","goods_name":"新品面膜|御泥坊海洋水漾透润面膜7片","shop_price":59.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1248/goods_img/161125212640917710585897403.jpg","reservable":false,"efficacy":"补水保湿 滋养肌肤"},{"id":"1252","goods_name":"柠檬鲜萃净颜矿物面膜7片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1252/goods_img/161125204853020531022844238.jpg","reservable":false,"efficacy":"清洁控油 补水保湿"},{"id":"1230","goods_name":"男士舒爽清透矿物洁面乳","shop_price":29.9,"market_price":39.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1230/goods_img/161122113046021358243094018.jpg","reservable":false,"efficacy":"深透清洁 清透毛孔"},{"id":"1228","goods_name":"男士珊瑚清洁控油面膜5片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1228/goods_img/161122111317219082185346251.jpg","reservable":false,"efficacy":"清洁控油 平滑毛孔"},{"id":"1229","goods_name":"男士黑茶清爽矿物面膜20片 黄致列定制版","shop_price":99.9,"market_price":375,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1229/goods_img/161122112568013495425696259.jpg","reservable":false,"efficacy":"净透肌肤 清洁控油"},{"id":"1227","goods_name":"男士红盐活力爽肤面膜5片","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1227/goods_img/16112211067297788200406393.jpg","reservable":false,"efficacy":"提升活力 畅透醒肤"},{"id":"1220","goods_name":"男士炫活亮肤凝乳","shop_price":69,"market_price":89,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1220/goods_img/161120132537912312357149912.jpg","reservable":false,"efficacy":"改善黯哑 保湿锁水"},{"id":"1219","goods_name":"男士新品丨炫活亮肤晶露","shop_price":59,"market_price":79,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1219/goods_img/16112013058403452949723470.jpg","reservable":false,"efficacy":"深层补水 改善黯哑"},{"id":"1218","goods_name":"男士新品丨炫活亮肤洁面乳","shop_price":49,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1218/goods_img/161120125345819475356221525.jpg","reservable":false,"efficacy":"改善黯哑  清洁亮肤"},{"id":"1221","goods_name":"男士新品丨炫活亮肤礼盒","shop_price":139.9,"market_price":237,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1221/goods_img/161120132834212433896505066.jpg","reservable":false,"efficacy":"炫活亮彩 劲能醒肤"},{"id":"1226","goods_name":"男士白茶控油面膜5片","shop_price":39.9,"market_price":75,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1226/goods_img/161122104426019564249198030.jpg","reservable":false,"efficacy":"清爽控油 净化肌肤"},{"id":"1216","goods_name":"男士新品|净畅黑头泥浆鼻膜60g","shop_price":59,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1216/goods_img/161120124273911769788096987.jpg","reservable":false,"efficacy":"改善黑头 收缩毛孔"},{"id":"1217","goods_name":"男士新品丨火山泥清洁控油泥浆面膜","shop_price":79,"market_price":139,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1217/goods_img/161120124763716596592995963.jpg","reservable":false,"efficacy":"清洁控油 清爽不油腻"},{"id":"1212","goods_name":"男士新品|茶树清痘净爽泥浆面膜110g","shop_price":79,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1212/goods_img/161120110788710403903073534.jpg","reservable":false,"efficacy":"深层清洁 净肤祛痘"},{"id":"1213","goods_name":"男士新品|橄榄石畅透亮肤黑面膜5片","shop_price":59.9,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1213/goods_img/16112011174805234612745667.jpg","reservable":false,"efficacy":"控油亮肤 清爽透亮"},{"id":"1214","goods_name":"男士新品|海盐炫活亮肤面膜","shop_price":49.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1214/goods_img/1611201229207648144994110.jpg","reservable":false,"efficacy":"炫活亮肤 清爽舒缓"},{"id":"1215","goods_name":"男士新品丨火山岩净透控油黑面膜5片","shop_price":49.9,"market_price":119,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1215/goods_img/16112012349006647978335734.jpg","reservable":false,"efficacy":"净透控油 舒爽体验"},{"id":"1352","goods_name":"男士新品丨黑茶净爽沐浴露150ml","shop_price":19.9,"market_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1352/goods_img/170109115166212137535299302.jpg","reservable":false,"efficacy":"净爽清洁 舒缓滋润"}]
             * goodsIdsList : ["1638","1615","1280","1250","1331","1330","1281","1254","1234","1256","1258","1262","1277","1257","1248","1252","1325","1230","1228","1229","1227","1220","1219","1218","1221","1226","1216","1217","1212","1213","1214","1215","1352"]
             */

            private String id;
            private String title;
            private String detail;
            private String image;
            private String start_time;
            private String end_time;
            private int show_number;
            private String state;
            private int sort;
            private List<GoodsListBean> goodsList;
            private List<String> goodsIdsList;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getStart_time() {
                return start_time;
            }

            public void setStart_time(String start_time) {
                this.start_time = start_time;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public int getShow_number() {
                return show_number;
            }

            public void setShow_number(int show_number) {
                this.show_number = show_number;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public List<GoodsListBean> getGoodsList() {
                return goodsList;
            }

            public void setGoodsList(List<GoodsListBean> goodsList) {
                this.goodsList = goodsList;
            }

            public List<String> getGoodsIdsList() {
                return goodsIdsList;
            }

            public void setGoodsIdsList(List<String> goodsIdsList) {
                this.goodsIdsList = goodsIdsList;
            }

            public static class GoodsListBean {
                /**
                 * id : 1638
                 * goods_name : 新品上市|嫩肌酵素黑膜礼盒21片
                 * shop_price : 139.9
                 * market_price : 299.0
                 * goods_img : https://image.yunifang.com/yunifang/images/goods/1638/goods_img/17030210211762506087062132.jpg
                 * reservable : false
                 * efficacy : 鲜果酵素 弹嫩水润
                 */

                private String id;
                private String goods_name;
                private double shop_price;
                private double market_price;
                private String goods_img;
                private boolean reservable;
                private String efficacy;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getGoods_name() {
                    return goods_name;
                }

                public void setGoods_name(String goods_name) {
                    this.goods_name = goods_name;
                }

                public double getShop_price() {
                    return shop_price;
                }

                public void setShop_price(double shop_price) {
                    this.shop_price = shop_price;
                }

                public double getMarket_price() {
                    return market_price;
                }

                public void setMarket_price(double market_price) {
                    this.market_price = market_price;
                }

                public String getGoods_img() {
                    return goods_img;
                }

                public void setGoods_img(String goods_img) {
                    this.goods_img = goods_img;
                }

                public boolean isReservable() {
                    return reservable;
                }

                public void setReservable(boolean reservable) {
                    this.reservable = reservable;
                }

                public String getEfficacy() {
                    return efficacy;
                }

                public void setEfficacy(String efficacy) {
                    this.efficacy = efficacy;
                }
            }
        }

        public static class BestSellersBean {
            /**
             * id : 2
             * name : 本周热销
             * descript : 1
             * state : 1
             * show_number : 6
             * begin_date : 2017.02.15 09:56:58
             * end_date : 2017.06.15 10:00:00
             * goodsList : [{"id":"6","goods_name":"好用不贵丨亮颜水润蚕丝面膜（寂地定制版）","shop_price":59.9,"market_price":239.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/6/goods_img/160819084594721181484473699.jpg","reservable":false,"efficacy":"深层补水 提亮肤色"},{"id":"189","goods_name":"高回购率丨清爽平衡护肤三件套","shop_price":99.9,"market_price":179.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/189/goods_img/160819091183119066095185335.jpg","reservable":false,"efficacy":"深层清洁 平衡水油"},{"id":"85","goods_name":"果味鲜饮|水果鲜润亮肤补水面膜套装17片","shop_price":59.9,"market_price":240,"goods_img":"http://image.hmeili.com/yunifang/images/goods/85/goods_img/160819085747012099748482408.jpg","reservable":false,"efficacy":"水嫩舒爽 鲜活亮颜"},{"id":"5","goods_name":"黑眼圈不见啦丨金桂花矿物眼膜贴60片","shop_price":69,"market_price":89,"goods_img":"http://image.hmeili.com/yunifang/images/goods/5/goods_img/16081908444051052195086751.jpg","reservable":false,"efficacy":"补水靓眼 改善熊猫眼"},{"id":"428","goods_name":"多彩水润亮颜蚕丝面膜套装21片","shop_price":79.9,"market_price":270.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/428/goods_img/160819094034113421009937866.jpg","reservable":false,"efficacy":"吸黑焕彩 补水保湿"},{"id":"1234","goods_name":"热销|樱桃鲜润补水矿物面膜7片","shop_price":39.9,"market_price":99,"goods_img":"http://image.hmeili.com/yunifang/images/goods/1234/goods_img/161122183456315727984418108.jpg","reservable":false,"efficacy":"补水保湿  润泽滋养"},{"id":"446","goods_name":"芦荟补水保湿凝胶150g","shop_price":49.9,"market_price":59,"goods_img":"http://image.hmeili.com/yunifang/images/goods/446/goods_img/16081909409518953549635059.jpg","reservable":false,"efficacy":"水水润润 修护受损"},{"id":"14","goods_name":"矿物泥浆鼻膜60g","shop_price":55,"market_price":69,"goods_img":"http://image.hmeili.com/yunifang/images/goods/14/goods_img/160819084841216186223194195.jpg","reservable":false,"efficacy":"草莓鼻小救星 收敛毛孔"},{"id":"9","goods_name":"玫瑰滋养矿物睡眠面膜180g","shop_price":59.9,"market_price":79.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/9/goods_img/160819084569920890610621654.jpg","reservable":false,"efficacy":"镇店之宝 彻夜补水"}]
             * goodsIdsList : ["6","189","85","5","428","1234","446","14","9"]
             */

            private String id;
            private String name;
            private String descript;
            private String state;
            private int show_number;
            private String begin_date;
            private String end_date;
            private List<GoodsListBeanX> goodsList;
            private List<String> goodsIdsList;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescript() {
                return descript;
            }

            public void setDescript(String descript) {
                this.descript = descript;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public int getShow_number() {
                return show_number;
            }

            public void setShow_number(int show_number) {
                this.show_number = show_number;
            }

            public String getBegin_date() {
                return begin_date;
            }

            public void setBegin_date(String begin_date) {
                this.begin_date = begin_date;
            }

            public String getEnd_date() {
                return end_date;
            }

            public void setEnd_date(String end_date) {
                this.end_date = end_date;
            }

            public List<GoodsListBeanX> getGoodsList() {
                return goodsList;
            }

            public void setGoodsList(List<GoodsListBeanX> goodsList) {
                this.goodsList = goodsList;
            }

            public List<String> getGoodsIdsList() {
                return goodsIdsList;
            }

            public void setGoodsIdsList(List<String> goodsIdsList) {
                this.goodsIdsList = goodsIdsList;
            }

            public static class GoodsListBeanX {
                /**
                 * id : 6
                 * goods_name : 好用不贵丨亮颜水润蚕丝面膜（寂地定制版）
                 * shop_price : 59.9
                 * market_price : 239.9
                 * goods_img : http://image.hmeili.com/yunifang/images/goods/6/goods_img/160819084594721181484473699.jpg
                 * reservable : false
                 * efficacy : 深层补水 提亮肤色
                 */

                private String id;
                private String goods_name;
                private double shop_price;
                private double market_price;
                private String goods_img;
                private boolean reservable;
                private String efficacy;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getGoods_name() {
                    return goods_name;
                }

                public void setGoods_name(String goods_name) {
                    this.goods_name = goods_name;
                }

                public double getShop_price() {
                    return shop_price;
                }

                public void setShop_price(double shop_price) {
                    this.shop_price = shop_price;
                }

                public double getMarket_price() {
                    return market_price;
                }

                public void setMarket_price(double market_price) {
                    this.market_price = market_price;
                }

                public String getGoods_img() {
                    return goods_img;
                }

                public void setGoods_img(String goods_img) {
                    this.goods_img = goods_img;
                }

                public boolean isReservable() {
                    return reservable;
                }

                public void setReservable(boolean reservable) {
                    this.reservable = reservable;
                }

                public String getEfficacy() {
                    return efficacy;
                }

                public void setEfficacy(String efficacy) {
                    this.efficacy = efficacy;
                }
            }
        }

        public static class Ad1Bean {
            /**
             * id : 881
             * image : https://image.yunifang.com/yunifang/images/goods/ad0/17031517406303974036478057.jpg
             * ad_type : 0
             * sort : 1056
             * position : 0
             * enabled : 1
             * createtime : 2017.03.15 17:41:12
             * createuser : hani
             * ad_type_dynamic : 1
             * ad_type_dynamic_data : http://h.yunifang.com/h/manNews.html
             * ad_type_dynamic_detail : http%3A%2F%2Fh.yunifang.com%2Fh%2FmanNews.html
             * show_channel : 1,2
             * title : 男士高端系列
             * channelType : 1
             * lastupdateuser : lingyue
             */

            private String id;
            private String image;
            private int ad_type;
            private int sort;
            private int position;
            private int enabled;
            private String createtime;
            private String createuser;
            private String ad_type_dynamic;
            private String ad_type_dynamic_data;
            private String ad_type_dynamic_detail;
            private String show_channel;
            private String title;
            private String channelType;
            private String lastupdateuser;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getAd_type() {
                return ad_type;
            }

            public void setAd_type(int ad_type) {
                this.ad_type = ad_type;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public int getEnabled() {
                return enabled;
            }

            public void setEnabled(int enabled) {
                this.enabled = enabled;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public String getCreateuser() {
                return createuser;
            }

            public void setCreateuser(String createuser) {
                this.createuser = createuser;
            }

            public String getAd_type_dynamic() {
                return ad_type_dynamic;
            }

            public void setAd_type_dynamic(String ad_type_dynamic) {
                this.ad_type_dynamic = ad_type_dynamic;
            }

            public String getAd_type_dynamic_data() {
                return ad_type_dynamic_data;
            }

            public void setAd_type_dynamic_data(String ad_type_dynamic_data) {
                this.ad_type_dynamic_data = ad_type_dynamic_data;
            }

            public String getAd_type_dynamic_detail() {
                return ad_type_dynamic_detail;
            }

            public void setAd_type_dynamic_detail(String ad_type_dynamic_detail) {
                this.ad_type_dynamic_detail = ad_type_dynamic_detail;
            }

            public String getShow_channel() {
                return show_channel;
            }

            public void setShow_channel(String show_channel) {
                this.show_channel = show_channel;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getChannelType() {
                return channelType;
            }

            public void setChannelType(String channelType) {
                this.channelType = channelType;
            }

            public String getLastupdateuser() {
                return lastupdateuser;
            }

            public void setLastupdateuser(String lastupdateuser) {
                this.lastupdateuser = lastupdateuser;
            }
        }

        public static class Ad5Bean {
            /**
             * id : 359
             * image : http://image.hmeili.com/yunifang/images/goods/ad0/160823172997710201253418883.png
             * ad_type : 4
             * sort : 106
             * position : 5
             * enabled : 0
             * ad_type_dynamic : 1
             * ad_type_dynamic_data : http://h.yunifang.com/sign/sign.html?login_check=2
             * ad_type_dynamic_detail : http%3A%2F%2Fh.yunifang.com%2Fsign%2Fsign.html%3Flogin_check%3D2
             * show_channel : 1,2
             * title : 每日签到
             * url : http://mobile.hmeili.com/yunifang/web/member/gift
             */

            private String id;
            private String image;
            private int ad_type;
            private int sort;
            private int position;
            private int enabled;
            private String ad_type_dynamic;
            private String ad_type_dynamic_data;
            private String ad_type_dynamic_detail;
            private String show_channel;
            private String title;
            private String url;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public int getAd_type() {
                return ad_type;
            }

            public void setAd_type(int ad_type) {
                this.ad_type = ad_type;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public int getEnabled() {
                return enabled;
            }

            public void setEnabled(int enabled) {
                this.enabled = enabled;
            }

            public String getAd_type_dynamic() {
                return ad_type_dynamic;
            }

            public void setAd_type_dynamic(String ad_type_dynamic) {
                this.ad_type_dynamic = ad_type_dynamic;
            }

            public String getAd_type_dynamic_data() {
                return ad_type_dynamic_data;
            }

            public void setAd_type_dynamic_data(String ad_type_dynamic_data) {
                this.ad_type_dynamic_data = ad_type_dynamic_data;
            }

            public String getAd_type_dynamic_detail() {
                return ad_type_dynamic_detail;
            }

            public void setAd_type_dynamic_detail(String ad_type_dynamic_detail) {
                this.ad_type_dynamic_detail = ad_type_dynamic_detail;
            }

            public String getShow_channel() {
                return show_channel;
            }

            public void setShow_channel(String show_channel) {
                this.show_channel = show_channel;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class DefaultGoodsListBean {
            /**
             * id : 121
             * goods_name : 镇店之宝丨美白嫩肤面膜7片
             * shop_price : 49.9
             * market_price : 99.0
             * goods_img : https://image.yunifang.com/yunifang/images/goods/121/goods_img/170301091610311632161123479.jpg
             * reservable : false
             * efficacy : 镇店之宝 美白爆款
             */

            private String id;
            private String goods_name;
            private double shop_price;
            private double market_price;
            private String goods_img;
            private boolean reservable;
            private String efficacy;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public double getShop_price() {
                return shop_price;
            }

            public void setShop_price(double shop_price) {
                this.shop_price = shop_price;
            }

            public double getMarket_price() {
                return market_price;
            }

            public void setMarket_price(double market_price) {
                this.market_price = market_price;
            }

            public String getGoods_img() {
                return goods_img;
            }

            public void setGoods_img(String goods_img) {
                this.goods_img = goods_img;
            }

            public boolean isReservable() {
                return reservable;
            }

            public void setReservable(boolean reservable) {
                this.reservable = reservable;
            }

            public String getEfficacy() {
                return efficacy;
            }

            public void setEfficacy(String efficacy) {
                this.efficacy = efficacy;
            }
        }
    }
}
