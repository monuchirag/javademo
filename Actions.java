import com.thoughtworks.xstream.*;
import java.io.*;
import javaHttpJ.*;
import javaHttpJ.parsers.*;
import javaHttpJ.replay.*;
import lrapi.*;

public class Actions
{
  public int init(){
    return 0;
  }

    public int end(){return 0;}


    public int action() throws Throwable{

	String ENDFORM      =  "ENDFORM";
	String LAST         =  "LAST";
	String ENDITEM      =  "ENDITEM";
	String ITEMDATA     =  "ITEMDATA";
	String STARTHIDDENS =  "STARTHIDDENS";
	String ENDHIDDENS   =  "ENDHIDDENS";
	String CONNECT	    =  "CONNECT";
	String RECEIVE      =  "RECEIVE";
	String RESOLVE	    =  "RESOLVE";
	String REQUEST      =  "REQUEST";
	String RESPONSE	    =  "RESPONSE";
	String EXTRARES     =  "EXTRARES";
	int _webresult; 

	try{

	lr.think_time(0);

	_webresult = lrapi.web.set_sockets_option("SSL_VERSION", "AUTO");

	_webresult = lrapi.web.add_auto_header("Accept", 
		"application/dns-message");

	_webresult = lrapi.web.add_auto_header("Accept-Encoding", 
		"identity");

	_webresult = lrapi.web.add_auto_header("Accept-Language", 
		"*");

	_webresult = lrapi.web.add_auto_header("User-Agent", 
		"Chrome");

	_webresult = lrapi.web.url("dns-query", 
		"URL=https://dns.google/dns-query?dns=AAABAAABAAAAAAABA3d3dwdnc3RhdGljA2NvbQAAAQABAAApEAAAAAAAAFQADABQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", new String[]{ 
		"Resource=1", 
		"RecContentType=application/dns-message", 
		"Referer=", 
		"Snapshot=t1.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("dns-query_2", 
		"URL=https://dns.google/dns-query?dns=AAABAAABAAAAAAABA3d3dwdnc3RhdGljA2NvbQAAAQABAAApEAAAAAAAAFQADABQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", new String[]{ 
		"Resource=1", 
		"RecContentType=application/dns-message", 
		"Referer=", 
		"Snapshot=t2.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("dns-query_3", 
		"URL=https://dns.google/dns-query?dns=AAABAAABAAAAAAABA3d3dwdnc3RhdGljA2NvbQAAAQABAAApEAAAAAAAAFQADABQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", new String[]{ 
		"Resource=1", 
		"RecContentType=application/dns-message", 
		"Referer=", 
		"Snapshot=t3.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("dns-query_4", 
		"URL=https://dns.google/dns-query?dns=AAABAAABAAAAAAABA3d3dwdnc3RhdGljA2NvbQAAAQABAAApEAAAAAAAAFQADABQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", new String[]{ 
		"Resource=1", 
		"RecContentType=application/dns-message", 
		"Referer=", 
		"Snapshot=t4.inf", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.revert_auto_header("Accept");

	_webresult = lrapi.web.revert_auto_header("Accept-Language");

	_webresult = lrapi.web.add_header("Sec-Fetch-Mode", 
		"no-cors");

	_webresult = lrapi.web.add_header("Sec-Fetch-Dest", 
		"empty");

	_webresult = lrapi.web.add_header("A-IM", 
		"x-bm,gzip");

	_webresult = lrapi.web.add_auto_header("Accept-Encoding", 
		"gzip, deflate, br");

	_webresult = lrapi.web.add_header("If-None-Match", 
		"8bb681d99131df462a5f71a5e6093a22dbb65ffe");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"none");

	_webresult = lrapi.web.add_auto_header("User-Agent", 
		"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36");

	_webresult = lrapi.web.url("seed", 
		"URL=https://clientservices.googleapis.com/chrome-variations/seed?osname=win&channel=stable&milestone=91", new String[]{ 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t5.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://cdn.mxpnl.com/libs/mixpanel-2.2.min.js", "Referer=", ENDITEM, 
		"Url=https://d27xxe7juh1us6.cloudfront.net/dynamicConfig.json", "Referer=", ENDITEM, 
		"Url=https://ssl.gstatic.com/safebrowsing/csd/client_model_v5_variation_6.pb", "Referer=", ENDITEM, 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_auto_header("Accept", 
		"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Dest", 
		"document");

	_webresult = lrapi.web.add_auto_header("Accept-Language", 
		"en-US,en;q=0.9");

	_webresult = lrapi.web.add_header("Sec-Fetch-User", 
		"?1");

	_webresult = lrapi.web.add_header("Upgrade-Insecure-Requests", 
		"1");

	_webresult = lrapi.web.add_auto_header("sec-ch-ua", 
		"\" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"");

	_webresult = lrapi.web.add_auto_header("sec-ch-ua-mobile", 
		"?0");

	_webresult = lrapi.web.add_cookie("visitCount=1; DOMAIN=www.amazon.in");

	_webresult = lrapi.web.add_cookie("csm-hit=tb:EE9C4QZH64TKGS28S5QH+s-EE9C4QZH64TKGS28S5QH|1622707235187&t:1622707235187&adb:adblk_no; DOMAIN=www.amazon.in");

	_webresult = lrapi.web.url("www.amazon.in", 
		"URL=https://www.amazon.in/", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t6.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://dns.google/dns-query?dns=AAABAAABAAAAAAABCWltYWdlcy1ldRFzc2wtaW1hZ2VzLWFtYXpvbgNjb20AAAEAAQAAKRAAAAAAAABEAAwAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Referer=", ENDITEM, 
		"Url=https://dns.google/dns-query?dns=AAABAAABAAAAAAABCWltYWdlcy1ldRFzc2wtaW1hZ2VzLWFtYXpvbgNjb20AABwAAQAAKRAAAAAAAABEAAwAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Referer=", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/41KBYOkTjIL._RC%7C71x73qye4hL.css,21-QxUt197L.css,313Ydl5aIRL.css,21MKjoYL8wL.css,41OiMQkB+EL.css,01yCq3WXEcL.css,11kO7yAgiQL.css,31OvHRW+XiL.css,01XHMOHpK1L.css,01ucgi+I44L.css,41yKpEQVJkL.css_.css?AUIClients/NavDesktopUberAsset&oKUVd2KU", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/11EIQ5IGqaL._RC%7C01ZTHTZObnL.css,418YjvsUB+L.css,31qGOnSAToL.css,013z33uKh2L.css,017DsKjNQJL.css,0131vqwP5UL.css,41EWOOlBJ9L.css,11TIuySqr6L.css,01ElnPiDxWL.css,11bGSgD5pDL.css,01Dm5eKVxwL.css,01IdKcBuAdL.css,01y-XAlI+2L.css,21N4kUH7pxL.css,01oDR3IULNL.css,31MKqadzl-L.css,21j0IlW7xKL.css,01XPHJk60-L.css,014OeDQisGL.css,21aPhFy+riL.css,11gneA3MtJL.css,21fecG8pUzL.css,01RddH8vm-L.css,01CFUgsA-YL.css,31C80IiXalL.css,11qour3ND0L.css,11tRp6+0HHL.css" +
		",11MrdqKlKnL.css,11oHt2HYxnL.css,013RDhw9hoL.css,11JQtnL-6eL.css,11RKoGSb-gL.css,11jtXRmppwL.css,01QrWuRrZ-L.css,21pIv-yKhaL.css,11QyqG8yiqL.css,01890+Vwk8L.css,11kwKGWmBfL.css,11F2+OBzLyL.css,11Y05DTEL6L.css,01cbS3UK11L.css,21F85am0yFL.css,01giMEP+djL.css_.css?AUIClients/AmazonUI", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img20/TVs/BAU/July/MSO/desktop/1x_DCQC_TV2._SY116_CB409720252_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img20/TVs/BAU/July/MSO/desktop/1x_DCQC_TV6._SY116_CB409720255_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img21/CEPC/Clearance/May21/V238940049_IN_PC_BAU_Edit_Creation_Laptops1x._SY304_CB667377205_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img20/TVs/Kamya/D23607843_IN_HETV_BAU_QC_186x116_4._SY116_CB667347812_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img20/TVs/BAU/July/MSO/desktop/1x_DCQC_TV4._SY116_CB409720255_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img19/AmazonPay/HFC/GPRC/GPRC_Desktop_CC_379x304._SY304_CB659214458_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/S/sash/rzrQQdi0aRm6Dap.png", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/IMG15/Irfan/GATEWAY/MSO/Appliances-QC-PC-186x116--B08345R1ZW._SY116_CB667322346_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/IMG15/Irfan/GATEWAY/MSO/Appliances-QC-PC-186x116--B07G5J5FYP._SY116_CB667322346_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/IMG15/Irfan/GATEWAY/MSO/Appliances-QC-PC-186x116--B08RDL6H79._SY116_CB667322346_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/S/sash/Um6FUNyHlup8DYZ.gif", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/IMG15/Irfan/GATEWAY/MSO/186x116---wm._SY116_CB667322346_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/S/sash/ydDD9hnRfziI$y7.png", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img18/HPC/GW/Desktop-Qc-1x_3._SY116_CB431329535_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img18/HPC/GW/Desktop-Qc-1x_1._SY116_CB431329533_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img21/Fashion/Gateway/Mens_fashion/1._SY116_CB656503003_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img18/HPC/GW/Desktop-Qc-1x_4._SY116_CB431329535_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img18/HPC/GW/Desktop-Qc-1x_2._SY116_CB431329535_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img21/Fashion/Gateway/Mens_fashion/2._SY116_CB656503003_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/01/csm/showads.v2.js?adtag=csm&act=ads_", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img21/Fashion/Gateway/Mens_fashion/4._SY116_CB656503003_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img21/Fashion/Gateway/Mens_fashion/3._SY116_CB656503003_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img20/AmazonBrands/GW/QC/Home/Mixer_B07RYL7NSH_Asins_186x116._SY116_CB409842842_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img20/AmazonBrands/GWTransition/2-4_186x116._SY116_CB433910795_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img19/AmazonPay/Boson/Sid/CCBP/DesktopGateway_CategoryCard_379x304_CCBP._SY304_CB413372299_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img20/AmazonBrands/GW/QC/Home/bedsheet_B06Y5GF9SF_Asins_186x116._SY116_CB409842842_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/Symbol/2020/GatewayNK/PC/spb_186x116._SY116_CB433889053_.jpg", ENDITEM, 
		"Url=https://content-autofill.googleapis.com/v1/pages/ChNDaHJvbWUvOTEuMC40NDcyLjc3EhcJbapyILNvT78SBQ29S07hEgUNSDo_QQ==?alt=proto", "Referer=", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/61-6nKPKyWL.js?AUIClients/AmazonUIjQuery", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/01q83dUa5BL._RC%7C41qOAXcFL7L.js_.js?AUIClients/AmazonGatewayAuiAssets&/3eJPhjR", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/01/AUIClients/INRetargetingAsset-fe13df5df0c9265752c892a20feddfc5baaec718.secure.min._V2_.js?AUIClients/INRetargetingAsset", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/01rGP6HIADL.js?AUIClients/GenericObservableJS", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/31SljjL-V4L.js?AUIClients/AmazonGatewayHerotatorJS", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/11VbV%2B%2BKhQL.js?AUIClients/RetailWebsiteOverlayAUIAssets", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/41cyy9szMwL._RC%7C714xw+8HbKL.js,61ACKXDdUsL.js,41RJ26y-U+L.js,11b3Y4WYB6L.js,21qd6OezMHL.js,11k47yUMOjL.js,41SZNgvX4oL.js,51pktuVkksL.js,31pymwzQBWL.js,01KW1GJCT1L.js,317Qj7+l3FL.js_.js?AUIClients/NavDesktopUberAsset&eRSuagD1", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/11Y+5x+kkTL._RC%7C51106gSDnJL.js,11-zXBZR6KL.js,11giXtZCwVL.js,01+z+uIeJ-L.js,01VRMV3FBdL.js,015pD3CNeFL.js,21NNXfMitSL.js,11rRjDLdAVL.js,51X-X0x2aRL.js,11kWu3cNjYL.js,11UNQpqeowL.js,11OREnu1epL.js,11KbZymw5ZL.js,21r53SJg7LL.js,0190vxtlzcL.js,51GBHgW1KPL.js,31KrK+dcMcL.js,01Gf12ogmOL.js,01ezj5Rkz1L.js,11VS-C+YWGL.js,31VpWkbgc1L.js,01rpauTep4L.js,01+b9cewx1L.js_.js?AUIClients/AmazonUI&Vk3JzNs/", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/51xLtn9VfzL.js?AUIClients/CardJsRuntimeBuzzCopyBuild", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/S/apesafeframe/ape/sf/desktop/DAsf-1.50.34e0302.js?csm_attribution=APE-SafeFrame", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img20/Events/GW/Covid/shovler/1x/Shoveler_covid_payment_1x._CB671053910_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/411Hz-n0bBS._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/51xgfOlhsrL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41ikHG0J+HL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41BzNL2R+KL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41llebwF1-L._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31Yl6bw97FL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41+00qVNcOL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31FbqrlqReL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/51ZyGSIVbFL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41k4M7eFliL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31qbPbEA3cL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41W18s9QXmS._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41gzrE212SL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31l7-41KpUL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31CzDvrbvwL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41MnMDU4tTS._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41dk2+SASqL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31ZBLC08LLL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31nykwpPDoL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41U4O3Ew1EL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41E3ejzmCPL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41t3kuMrnBL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41CqaA4KDzL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41LFdROYICL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41Aii85Bg-L._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41XXjVSLyGL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31gW9YJMzJL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41STmPt8viL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31OCZqdW2RL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31zfkzrLT+L._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41MtYO4LrtL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/51BbgpfYIPL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41kcDbjR5sL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/416fIBkDMpL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41m9SIZOsmL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41omosireUL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img19/AmazonPay/Avatar/HeroPC_1500x600_SVA._CB667240774_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img21/Fashion/Gateway/SuperSale_Herotator_1st-3rdApr/GW_PC_BUNK_1500x600-fst._CB667381848_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/prime/Gateway/2021/desktop-1x._CB658860139_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img2020/img21/apparelGW/U599/JUNE/PC/2._CB667373073_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/Sports/Fitness_1500x600_New._CB669481512_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img20/PC/Mayactivation/Accessoriesday1/D23140543_IN_CEPC_Electronicsaccessories_underRs999_3000x12000.5x._CB669031984_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31m44i2xSfL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/417zcYBIeRL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41tIUpiBRLL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41b-Wu021yL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41PA-MuBrlL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41pSjDwnFcL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/412NpVWcToL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31ZjYkm1iZL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/414hlxYCJYL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41M-EsvD74L._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41y4Qch04dL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41+0S5uzRpS._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41g-oDug3pL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41DeekDTqGL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img21/Wireless/Samsung/SamsungM/Family/8thMay/D20729242_IN_WLME_SamsungM_Family_DesktopTallHero_1500x600_1.1._CB669478640_.jpg", ENDITEM, 
		"Url=/gp/navigation/ajax/dynamic-menu.html?primeContent=prime&metricKey=primeMetric&rid=EE9C4QZH64TKGS28S5QH&isFullWidthPrime=0&isPrime=0&dynamicRequest=1&weblabs=&isFreshRegionAndCustomer=&primeMenuWidth=310&_=1622707245521", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31XlLm4iNyL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/51cMtYDGQHS._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/4116HG2BjdL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31IC3TbExqL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41cgerDTmcL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41PkH-NAC6L._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41b4GwiXqXS._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31n6fcADpLL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/31GuXZ0Q6rL._AC_SY200_.jpg", ENDITEM, 
		"Url=/gp/aq-feedback/lazyLoad/handler/af-link-handler.html?pl=%7B%22adPlacementMetaData%22%3A%7B%22pageUrl%22%3A%22aHR0cHM6Ly93d3cuYW1hem9uLmluL3Nob3BwaW5nUG9ydGFsL2Rlc2t0b3A%3D%22%2C%22adElementId%22%3A%22ape_Gateway_right-2_desktop_placement%22%2C%22pageType%22%3A%22Gateway%22%2C%22slotName%22%3A%22right-2%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adNetwork%22%3A%22cs%22%7D%7D", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41rT1lO5FfS._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41OKoIL6lLS._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41y68O7lW4L._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41fouTu8nuL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/411Rl8nkdkS._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41RcyKeY+PS._AC_SY200_.jpg", ENDITEM, 
		"Url=/gp/aq-feedback/lazyLoad/handler/af-link-handler.html?pl=%7B%22adPlacementMetaData%22%3A%7B%22pageUrl%22%3A%22aHR0cHM6Ly93d3cuYW1hem9uLmluL3Nob3BwaW5nUG9ydGFsL2Rlc2t0b3A%3D%22%2C%22adElementId%22%3A%22ape_Gateway_desktop-ad-center-1_desktop_placement%22%2C%22pageType%22%3A%22Gateway%22%2C%22slotName%22%3A%22desktop-ad-center-1%22%7D%2C%22adCreativeMetaData%22%3A%7B%22adNetwork%22%3A%22cs%22%7D%7D", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41YRuJRHybL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41hNNYzJQHL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/21NEvC6MQQL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41tFu62YWfL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41RvbGU+KhS._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/51+6-y5cw6L._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/410vmwQSZaL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/51b7WWmtjIL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/51PaXiUEq2L._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41hq33o0E7L._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/410WdORhcZL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/41JE8eLJR6L._AC_SY200_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/I/413a5br02EL._AC_SY200_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/11EIQ5IGqaL._RC%7C012LjolmrML.css,418YjvsUB+L.css,21qPwhPKAAL.css,01Vctty9pOL.css,017DsKjNQJL.css,0131vqwP5UL.css,41EWOOlBJ9L.css,11TIuySqr6L.css,01ElnPiDxWL.css,11bGSgD5pDL.css,01Dm5eKVxwL.css,01IdKcBuAdL.css,01y-XAlI+2L.css,01ZfXnjPmmL.css,01oDR3IULNL.css,31MKqadzl-L.css,01XPHJk60-L.css,01R0k0yxPXL.css,21xVR0NtxzL.css,11gneA3MtJL.css,21fecG8pUzL.css,01RddH8vm-L.css,01CFUgsA-YL.css,21AmhU6t0sL.css,11zGrJZ9D2L.css,11tRp6+0HHL.css,11MrdqKlKnL.css" +
		",11oHt2HYxnL.css,01-fWz3sOQL.css,11ocrgKoE-L.css,11RKoGSb-gL.css,11g1xm90ZvL.css,01QrWuRrZ-L.css,21pIv-yKhaL.css,01Wiow6micL.css,01gAR5pB+IL.css,119dKrtBoVL.css,11Y05DTEL6L.css,01cbS3UK11L.css,21F85am0yFL.css,01giMEP+djL.css_.css?AUIClients/AmazonUI", ENDITEM, 
		"Url=https://fls-eu.amazon.in/1/batch/1/OP/A21TJRUUN4KGV_260-7871994-7522166_EE9C4QZH64TKGS28S5QH$uedata=" +
		"s_%2Frd%2Fuedata%3Ful%26v%3D0.217347.0%26id%3DEE9C4QZH64TKGS28S5QH%26m%3D1%26sc%3DEE9C4QZH64TKGS28S5QH%26ue%3D5%26bb%3D1981%26ns%3D2035%26ne%3D2383%26cf%3D2385%26be%3D2557%26fp%3D2126%26fcp%3D2126%26af%3D3999%26fn%3D3999%26pc%3D21961%26tc%3D-12220%26na_%3D-12220%26ul_%3D-1622707213241%26_ul%3D-1622707213241%26rd_%3D-1622707213241%26_rd%3D-1622707213241%26fe_%3D-11989%26lk_%3D-8123%26_lk%3D-7884%26co_%3D-7884%26_co%3D-653%26sc_%3D-3267%26rq_%3D-652%26rs_%3D-179%26_rs%3D419%26dl_%3D-136%26di_%3D2930" +
		"%26de_%3D2930%26_de%3D2930%26_dc%3D-1622707213241%26ld_%3D-1622707213241%26_ld%3D-1622707213241%26ntd%3D0%26ty%3D0%26rc%3D0%26hob%3D3%26hoe%3D5%26ul%3D21961%26t%3D1622707235202%26ctb%3D1%26rt%3Dcf%3A7-0-3-4-1-0-1_af%3A43-0-3-36-2-0-0_%26csmtags%3Daui%7Caui%3Aaui_build_date%3A3.21.4-2021-05-27%7Cnavbar%7CgwCFImgNoCache%7Cfls-eu-amazon-in%7Cadblk_no%7Ccsm-feature-touch-enabled%3Afalse%7CfourColumn%7CfourColumnRevised%7CflexLayout%7CcssGridLayout%7CABPStatusUnknown%3AGateway%3Aright-2%3Adesktop%7CABP" +
		"StatusUnknown%3AGateway%3Adesktop-ad-center-1%3Adesktop%7Ciss-on-time%26viz%3Dvisible%3A5%26pty%3DGateway%26spty%3Ddesktop%26pti%3Ddesktop%26tid%3DEE9C4QZH64TKGS28S5QH%26aftb%3D1%26ui%3D2_21968", ENDITEM, 
		"Url=https://fls-eu.amazon.in/1/batch/1/OP/A21TJRUUN4KGV_260-7871994-7522166_EE9C4QZH64TKGS28S5QH$uedata=" +
		"s_%2Frd%2Fuedata%3Ful%26v%3D0.217347.0%26id%3DEE9C4QZH64TKGS28S5QH%26sc0%3Dportal-bb%26pc0%3D36%26ld0%3D36%26t0%3Dundefined%26sc1%3Diss-init-pc%26bb1%3D2109%26cf1%3D17076%26be1%3D17076%26pc1%3D17076%26ld1%3D17076%26t1%3Dundefined%26sc2%3Dh1Af%26cf2%3D2195%26pc2%3D2195%26ld2%3D2203%26t2%3Dundefined%26sc3%3Ddesktop-grid-1-D1-visible%26cf3%3D2243%26pc3%3D2243%26ld3%3D2243%26t3%3Dundefined%26sc4%3DnavCF%26cf4%3D2446%26pc4%3D2446%26ld4%3D2446%26t4%3Dundefined%26sc5%3DcsmCELLSframework%26bb5%3D2561%26pc" +
		"5%3D2561%26ld5%3D2561%26t5%3Dundefined%26sc6%3DcsmCELLSpdm%26bb6%3D2562%26pc6%3D2630%26ld6%3D2630%26t6%3Dundefined%26sc7%3DcsmCELLSvpm%26bb7%3D2630%26pc7%3D2630%26ld7%3D2630%26t7%3Dundefined%26sc8%3DcsmCELLSfem%26bb8%3D2631%26pc8%3D2631%26ld8%3D2631%26t8%3Dundefined%26sc9%3Due_sushi_v1%26bb9%3D2631%26pc9%3D2632%26ld9%3D2632%26t9%3Dundefined%26sc10%3Ddesktop-grid-1-visible%26cf10%3D3431%26pc10%3D3431%26ld10%3D3431%26t10%3Dundefined%26sc11%3Ddesktop-grid-2-visible%26cf11%3D3458%26pc11%3D3458%26ld11%" +
		"3D3458%26t11%3Dundefined%26sc12%3Ddesktop-grid-3-visible%26cf12%3D3458%26pc12%3D3458%26ld12%3D3458%26t12%3Dundefined%26sc13%3Ddesktop-grid-4-visible%26cf13%3D3641%26pc13%3D3641%26ld13%3D3641%26t13%3Dundefined%26sc14%3Ddesktop-grid-5-visible%26cf14%3D3822%26pc14%3D3822%26ld14%3D3822%26t14%3Dundefined%26sc15%3Ddesktop-2-visible%26cf15%3D3828%26pc15%3D3828%26ld15%3D3828%26t15%3Dundefined%26sc16%3Ddesktop-grid-6-visible%26cf16%3D3956%26pc16%3D3956%26ld16%3D3956%26t16%3Dundefined%26sc17%3Ddesktop-grid-" +
		"7-visible%26cf17%3D3999%26pc17%3D3999%26ld17%3D3999%26t17%3Dundefined%26sc18%3DspLoadJs%26cf18%3D4001%26pc18%3D4001%26ld18%3D4001%26t18%3Dundefined%26sc19%3Ddesktop-1-visible%26cf19%3D4170%26pc19%3D4170%26ld19%3D4170%26t19%3Dundefined%26sc20%3Ddesktop-3-visible%26cf20%3D4526%26pc20%3D4526%26ld20%3D4526%26t20%3Dundefined%26sc21%3Ddesktop-btf-grid-1-visible%26cf21%3D4557%26pc21%3D4557%26ld21%3D4557%26t21%3Dundefined%26sc22%3Ddesktop-btf-grid-3-visible%26cf22%3D4799%26pc22%3D4799%26ld22%3D4799%26t22%" +
		"3Dundefined%26sc23%3Ddesktop-btf-grid-4-visible%26cf23%3D4803%26pc23%3D4803%26ld23%3D4803%26t23%3Dundefined%26sc24%3Ddesktop-btf-grid-2-visible%26cf24%3D4804%26pc24%3D4804%26ld24%3D4804%26t24%3Dundefined%26sc25%3Ddesktop-4-visible%26cf25%3D4804%26pc25%3D4804%26ld25%3D4804%26t25%3Dundefined%26sc26%3Ddesktop-btf-grid-6-visible%26cf26%3D4928%26pc26%3D4928%26ld26%3D4928%26t26%3Dundefined%26sc27%3Ddesktop-btf-grid-5-visible%26cf27%3D4946%26pc27%3D4946%26ld27%3D4946%26t27%3Dundefined%26sc28%3Ddesktop-bt" +
		"f-grid-8-visible%26cf28%3D5041%26pc28%3D5041%26ld28%3D5041%26t28%3Dundefined%26sc29%3Ddesktop-5-visible%26cf29%3D5191%26pc29%3D5191%26ld29%3D5191%26t29%3Dundefined%26sc30%3Ddesktop-btf-grid-7-visible%26cf30%3D5192%26pc30%3D5192%26ld30%3D5192%26t30%3Dundefined%26sc31%3Ddesktop-btf-grid-9-visible%26cf31%3D10218%26pc31%3D10218%26ld31%3D10218%26t31%3Dundefined%26sc32%3Ddesktop-6-visible%26cf32%3D10247%26pc32%3D10247%26ld32%3D10247%26t32%3Dundefined%26sc33%3Ddesktop-btf-grid-10-visible%26cf33%3D10450%2" +
		"6pc33%3D10450%26ld33%3D10450%26t33%3Dundefined%26sc34%3Ddesktop-btf-grid-11-visible%26cf34%3D10607%26pc34%3D10607%26ld34%3D10607%26t34%3Dundefined%26sc35%3Ddesktop-btf-grid-12-visible%26cf35%3D10607%26pc35%3D10607%26ld35%3D10607%26t35%3Dundefined%26sc36%3Ddesktop-7-visible%26cf36%3D10607%26pc36%3D10607%26ld36%3D10607%26t36%3Dundefined%26sc37%3Ddesktop-7-active%26cf37%3D10607%26pc37%3D10607%26ld37%3D10607%26t37%3Dundefined%26sc38%3Dgateway-asset-load%26cf38%3D15626%26pc38%3D15626%26ld38%3D15626%26t" +
		"38%3Dundefined%26sc39%3Dhero-first-image%26cf39%3D15660%26pc39%3D15660%26ld39%3D15660%26t39%3Dundefined%26sc40%3DjQueryReady%26cf40%3D15660%26pc40%3D15660%26ld40%3D15660%26t40%3Dundefined%26sc41%3DgwGridInit%26cf41%3D15662%26pc41%3D15662%26ld41%3D15662%26t41%3Dundefined%26sc42%3DgwBTFGridInit%26cf42%3D15666%26pc42%3D15666%26ld42%3D15666%26t42%3Dundefined%26sc43%3DgwLayoutReady%26cf43%3D16387%26pc43%3D16387%26ld43%3D16387%26t43%3Dundefined%26sc44%3DgwAUIReady%26cf44%3D16392%26pc44%3D16392%26ld44%3D" +
		"16392%26t44%3Dundefined%26sc45%3Dgw-hero-btf-populate%26cf45%3D17037%26pc45%3D17037%26ld45%3D17037%26t45%3Dundefined%26sc46%3DgwHerotatorActive%26cf46%3D17213%26pc46%3D17213%26ld46%3D17213%26t46%3Dundefined%26ctb%3D1_21968", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/V_Day_Flip/Header/V1Eng/header_acs_02.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img18/AmazonPay/LPA/January19/Sunrise/CTA_PC1.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/0152SLDk8CL.js?AUIClients/OctopusBrowsePageAssets", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img2020/fashion/WA_2020/Stylebazaar_june/SB_Juneingress._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Stores/AFpage/spotlight/labels_to_know_new._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Luggage/May/ART/Handbags/Handbags_Scroll._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img2020/img21/SS21/TOTB/Updated/1/Kids-clothing-2._CB667371753_.gif", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img2021/Sportswear_21/June/Stay_Fit_store_2021/Stay-Fit-1400-x-800-June2021._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/PostMayArt/Essentials/BuymoreSavemore/Buymore-savemore-1400x800._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Watches/Bfit/FC_launch/FC-R7-LAUNCH-1400x800._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Jewellery/co-op/May/1-zaveri._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFWardrobemusthaves/Wardrobe-must-haves_01._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Apparel-Events/BOTW/AKS/BOTW-1400x8002._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/11Y+5x+kkTL._RC%7C51106gSDnJL.js,11-zXBZR6KL.js,11giXtZCwVL.js,01+z+uIeJ-L.js,01VRMV3FBdL.js,01O9dYORveL.js,21NNXfMitSL.js,11rRjDLdAVL.js,51X-X0x2aRL.js,11kWu3cNjYL.js,11UNQpqeowL.js,11OREnu1epL.js,11KbZymw5ZL.js,21r53SJg7LL.js,0190vxtlzcL.js,51GBHgW1KPL.js,3109-RXWZcL.js,015c-6CIP9L.js,01ezj5Rkz1L.js,11VS-C+YWGL.js,31VpWkbgc1L.js,01rpauTep4L.js,01+b9cewx1L.js_.js?AUIClients/AmazonUI&qa9N+d93", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/MA2021/co-op/Arrow-65._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Jewellery/co-op/May/2-GIVA._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFWardrobemusthaves/Wardrobe-must-haves_03._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFWardrobemusthaves/Wardrobe-must-haves_04._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFWardrobemusthaves/Wardrobe-must-haves_07._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFWardrobemusthaves/Wardrobe-must-haves_06._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFWardrobemusthaves/Wardrobe-must-haves_05._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFWardrobemusthaves/Wardrobe-must-haves_02._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFWardrobemusthaves/Wardrobe-must-haves_08._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCMens/watcjes._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFWardrobemusthaves/Wardrobe-must-haves_09._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Backpacks--more._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCMens/Footwear._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCMens/Clothing._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCMens/sportswear._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCMens/sunglasses._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCWomens/Fashion-jewellery._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCWomens/Beauty._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCWomens/watches._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCWomens/Footwear._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCWomens/Clothing._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/javascripts/lib/popover/images/snake._CB485935600_.gif", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCKids/Boys-clothing._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCKids/Footwear._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCKids/Girls-clothing._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCKids/Baby-clothing._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCWomens/Handbags._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCKids/School-bags._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/SBCKids/Watches._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFExploremore/Womens-sportswear._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Plus-size/may/post-art/Plussize-new._CB669056021_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFExploremore/gold-and-diamond-jewellery._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFExploremore/Luxury-beauty._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFExploremore/Accessories._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Egress_Deals/QC/Footwear._CB670193627_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFExploremore/Travel-luggage._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Egress_Deals/QC/Beauty._CB670193627_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Egress_Deals/QC/Clothing._CB670193627_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/EventPage/TopBrands/Slot1/Slot2/Slot3/Top-brand-brand-tile-AF3_01._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/EventPage/TopBrands/Slot1/Slot2/Slot3/Top-brand-brand-tile-AF3_04._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/EventPage/TopBrands/Slot1/Slot2/Slot3/Top-brand-brand-tile-AF3_02._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/EventPage/TopBrands/Slot1/Slot2/Slot3/Top-brand-brand-tile-AF3_03._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/PostMayArt/LuggageWatchesmore_1._CB668020431_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/EventPage/TopBrands/Slot1/Slot2/Slot3/Top-brand-brand-tile-AF3_05._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/EventPage/TopBrands/Slot1/Slot2/Slot3/Top-brand-brand-tile-AF3_07._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/EventPage/TopBrands/Slot1/Slot2/Slot3/Top-brand-brand-tile-AF3_06._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/EventPage/TopBrands/Slot1/Slot2/Slot3/Top-brand-brand-tile-AF3_09._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/EventPage/TopBrands/Slot1/Slot2/Slot3/Top-brand-brand-tile-AF3_08._SS400_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends1Final/pastel-polos._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends1Final/Dainty-prints._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends1Final/90s-crop-tops._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends1Final/super-wide-jeans._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends1Final/nautical-stripes._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends1Final/midwash--light-denim._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends1Final/pop--block._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Barmuda._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends1Final/feminine-frills._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends1Final/cutesy-prints._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends1Final/bamd--camp-collar-shirts._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFPocketfriendly/Sarees._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFPocketfriendly/T-shirts--logos._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFPocketfriendly/footwear._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends1Final/designer-westernwear._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFPocketfriendly/Handbags._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFPocketfriendly/Makeup._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFPocketfriendly/View-the-store._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFPocketfriendly/Jewellery._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFPocketfriendly/Watches._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/AFPocketfriendly/Accessories._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/EventPage/In_the_Spotlight/QC/V1/Coupons._SS680_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Symbol/2021/MFA_PC/MFA-Mens-fashion-PC_Slide-01_01._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/QCFnl/V1/Spotlight-QC_03._SS680_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/QCFnl/V1/V2/V3/qc-2_01_04._SS680_QL85_.jpg", ENDITEM, 
		"Url=https://completion.amazon.co.uk/api/2017/suggestions?session-id=260-7871994-7522166&customer-id=&request-id=AXERV8EH5V8NQ9CRG46P&page-type=Landing&lop=en_IN&site-variant=desktop&client-info=amazon-search-ui&mid=A21TJRUUN4KGV&alias=fashion&searchTerm=a&suggestion-type=KEYWORD&suggestion-type=WIDGET&_=1622707267108", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/QCFnl/V1/V2/V3/qc2_012121._SS680_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Symbol/2021/MFA_PC/MFA-Mens-fashion-PC_EDITING-Recovered-Recovered_02_01._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Symbol/2021/MFA_PC/MFA-WOMens-fashion_14._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Symbol/2021/MFA_PC/10_MFA_PC_flipflops_Eng._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Symbol/2021/BTF_PC/Women_Fashion/BTF_PC_17._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Symbol/2021/BTF_PC/Women_Fashion/BTF_PC_51._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Symbol/2021/BTF_PC/Kids_Clothing/kids._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Symbol/2021/MFA_PC/MFA-Mens-fashion-PC_Slide-01_02._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Symbol/2021/MFA_PC/MFA_PC_FashionShoes-_40._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Symbol/2021/BTF_PC/Men_Fashion/BTF_PC_02._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Symbol/2021/BTF_PC/Men_Fashion/MFA2_06._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/PostMayArt/Essentials/AmazonSpecial/PC_AS._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/Symbol/2021/MFA_PC/MFA-Mens-fashion-PC_10._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/SL_StrategicPartners/VMart/Amazon-Specials-PC-AF._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Amazonspecial/Amazon-special_01._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Mar30Header/AS/Amzon-Spl-AF_05._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Amazonspecial/Amazon-special_03._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Amazonspecial/Amazon-special_05._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Amazonspecial/Amazon-special_04._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Amazonspecial/Amazon-special_06._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Amazonspecial/Amazon-special-2_03._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Amazonspecial/Amazon-special-2_04._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Amazonspecial/Amazon-special-2_01._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends2Final/multi-strap-leather-sandals._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends2Final/low-block-heels._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends2Final/stwar-bags._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/G/31/img16/wayfinding/json/subnavmay18.json?_=1622707270374", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends2Final/beowbar-frames._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends2Final/colour-blocked-backpacks._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends2Final/the-aerodynamic-runner._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends2Final/oversized-yet-minimal._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends2Final/sculpted--layered-chunky-solepeop--block._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends2Final/beach-vibes._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends2Final/retro-revival._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/DesignerBoutique/june/river-ingresses/ingress3._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/CuratedStoreFinal/The-vault._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/DesignerBoutique/may/post-art/dba1._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img18/Fashion/September18/Flyouts/Women.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Trends2Final/long-necklackes._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/Bright-coloured-luggage._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Jew/Feb/380-500.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Fashion/WA19/MAX/FLY_OUT/Sub-Nav-Women-2._CB439603748_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img18/Fashion/September18/Flyouts/Men.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/CuratedStoreFinal/amazon-karigar._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/CuratedStoreFinal/the-mask-store._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Fashion/WA19/MAX/FLY_OUT/Sub-Nav-men-2._CB439603748_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/CuratedStoreFinal/wanderlust-store._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/31/img21/Fashion/Event/SS21Flip/PC_Changes/CuratedStoreFinal/yoga-store._SY530_QL85_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img18/Fashion/September18/Flyouts/Running-Shoes.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Apparel/KA/GW/Sub-Nav/2._CB469401627_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Fashion/WA19/MAX/FLY_OUT/Sub-Nav-Kids._CB1198675309_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Apparel/KA/GW/Sub-Nav/girls._CB469401626_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Fashion/DesktopSubnav/Updated/HB.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img18/Fashion/September18/Flyouts/Sports_M._CB483839267_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Fashion/DesktopSubnav/Updated/BWL.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img18/Fashion/September18/Flyouts/Sports_W._CB483839267_.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Fashion/DesktopSubnav/Updated/BP.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Fashion/DesktopSubnav/Updated/CL.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Fashion/DesktopSubnav/Updated/SH.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Fashion/DesktopSubnav/Updated/JW.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Fashion/DesktopSubnav/Updated/SG.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Fashion/DesktopSubnav/Updated/LG.jpg", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/Fashion/DesktopSubnav/Updated/W.jpg", ENDITEM, 
		"Url=https://images-eu.ssl-images-amazon.com/images/I/31YXrY93hfL.js", ENDITEM, 
		"Url=https://fls-eu.amazon.in/1/batch/1/OP/A21TJRUUN4KGV_260-7871994-7522166_AXERV8EH5V8NQ9CRG46P$uedata=" +
		"s_%2Frd%2Fuedata%3Fld%26v%3D0.217347.0%26id%3DAXERV8EH5V8NQ9CRG46P%26sw%3D1366%26sh%3D768%26vw%3D1349%26vh%3D657%26m%3D1%26sc%3DAXERV8EH5V8NQ9CRG46P%26ue%3D5%26bb%3D9130%26ns%3D9180%26ne%3D9299%26be%3D10154%26fp%3D9226%26fcp%3D9226%26af%3D15419%26pc%3D20959%26tc%3D-15572%26na_%3D-15572%26ul_%3D-71%26_ul%3D-71%26rd_%3D-1622707250795%26_rd%3D-1622707250795%26fe_%3D-15570%26lk_%3D-971%26_lk%3D-971%26co_%3D-971%26_co%3D-864%26sc_%3D-971%26rq_%3D-851%26rs_%3D-170%26_rs%3D3385%26dl_%3D-27%26di_%3D14874%" +
		"26de_%3D14875%26_de%3D14875%26_dc%3D20959%26ld_%3D20959%26_ld%3D-1622707250795%26ntd%3D-1%26ty%3D0%26rc%3D0%26hob%3D3%26hoe%3D5%26ld%3D20961%26t%3D1622707271756%26ctb%3D1%26rt%3D_af%3A24-4-4-13-3-3-1_ld%3A169-5-4-151-7-3-1%26ec%3D1%26ecf%3D0%26csmtags%3Daui%7Caui%3Aaui_build_date%3A3.21.4-2021-05-27%7Cewc%3Aunpersist%7Cewc%3Aunpersist%3Aemptycart%7Cewc%3Abview%7Cewc%7Cewc%3Aunrec%7Cewc%3Acartsize%3A0%7Cewc%3Aaui%7Cnavbar%7Cfls-eu-amazon-in%7Cadblk_no%7Ciss-on-time%7Ccsm-feature-touch-enabled%3Afal" +
		"se%26viz%3Dvisible%3A4%26pty%3DLanding%26spty%3DCat-M%26pti%3D6648217031%26tid%3DEE9C4QZH64TKGS28S5QH%26aftb%3D1%26ui%3D2_20969", ENDITEM, 
		"Url=https://fls-eu.amazon.in/1/batch/1/OP/A21TJRUUN4KGV_260-7871994-7522166_AXERV8EH5V8NQ9CRG46P$uedata=" +
		"s_%2Frd%2Fuedata%3Fld%26v%3D0.217347.0%26id%3DAXERV8EH5V8NQ9CRG46P%26sc0%3Dportal-bb%26pc0%3D40%26ld0%3D40%26t0%3D1622707259966%26sc1%3Diss-init-pc%26bb1%3D9289%26cf1%3D16295%26be1%3D16295%26pc1%3D16295%26ld1%3D16295%26t1%3D1622707267090%26sc2%3Dsobe_horizontale_d_b_%26bb2%3D9796%26cf2%3D9824%26pc2%3D9825%26ld2%3D9825%26t2%3D1622707260620%26sc3%3Dsobe_categ_d_b_%26bb3%3D10050%26cf3%3D10103%26pc3%3D10103%26ld3%3D10103%26t3%3D1622707260898%26sc4%3Dsobe_quade_d_b_%26bb4%3D9892%26cf4%3D9894%26pc4%3D98" +
		"94%26ld4%3D9895%26t4%3D1622707260690%26sc5%3DcsmCELLSframework%26bb5%3D14845%26pc5%3D14845%26ld5%3D14845%26t5%3D1622707265640%26sc6%3DcsmCELLSpdm%26bb6%3D14845%26pc6%3D14847%26ld6%3D14847%26t6%3D1622707265642%26sc7%3DcsmCELLSvpm%26bb7%3D14847%26pc7%3D14847%26ld7%3D14847%26t7%3D1622707265642%26sc8%3DcsmCELLSfem%26bb8%3D14848%26pc8%3D14848%26ld8%3D14848%26t8%3D1622707265643%26sc9%3Due_sushi_v1%26bb9%3D14850%26pc9%3D14851%26ld9%3D14851%26t9%3D1622707265646%26sc10%3Diss-warmup%3Afailure%26bb10%3D16312" +
		"%26cf10%3D18327%26be10%3D18327%26pc10%3D18327%26ld10%3D18327%26t10%3D1622707269122%26ctb%3D1_20969", ENDITEM, 
		"Url=https://c.amazon-adsystem.com/bao-csm/forensics/a9-tq-forensics-incremental.min.js", ENDITEM, 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_cookie("gnar_containerId=qxnPSxWqSwxE; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("_gcl_au=1.1.158826989.1619417052; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("ga_clientId=2019783442.1619417053; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("_hjid=ab5478c6-b271-487f-aad0-e8df8f0ddc68; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("_ga=GA1.1.2019783442.1619417053; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("tdi=asems1ohualrti4u8; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("_ga_CBK9K2ZWWE=GS1.1.1619417052.1.1.1619417213.0; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("grauth=AABJVjMK6nVkMtRJPv-iBEKuSwxWFeYpgvMqIAHum4YNW8lMKl12IZlwoAWmEeAu6sH4LXMyR16youqY; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("csrf-token=AABJVmhvHWx69iKfqJmQAB0RLq2CRv2txQEyaA; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("experiment_groups=fsrw_in_sidebar_allusers_enabled|extension_assistant_bundles_all_consumers_enabled|denali_capi_all_enabled|fsrw_in_assistant_all_consumers_enabled|truecaser_enabled|extension_new_rich_text_fields_enabled|gdocs_for_chrome_enabled|officeaddin_outcomes_ui_exp5_enabled1|premium_ungating_renewal_notification_enabled|quarantine_messages_enabled|small_hover_menus_existing_enabled|emogenie_filter_no_tone_sentences_enabled|officeaddin_upgrade_state_exp2_enabled1|" +
		"gb_analytics_mvp_phase_one_enabled|apply_formatting_all_consumers_enabled|ipm_extension_release_test_1|extension_assistant_experiment_all_consumers_enabled|extension_assistant_bundles_all_enabled|officeaddin_proofit_exp3_enabled|gdocs_sidebar_allusers_enabled|gb_in_editor_free_Test1|gdocs_for_all_firefox_enabled|gb_analytics_mvp_phase_one_30_day_enabled|auto_complete_correct_safari_enabled|fluid_gdocs_rollout_enabled|officeaddin_ue_exp3_enabled|officeaddin_upgrade_state_exp1_enabled1|" +
		"safari_migration_inline_disabled_enabled|refresh_experiments_test_enabled|completions_release_enabled1|ipm_gb_member_activation_v2_test_2|optimized_gdocs_gate_2_enabled|extension_assistant_all_consumers_enabled|fsrw_in_assistant_all_enabled|apollo_rollout_gate_enabled_1|autocorrect_new_ui_v3|emogenie_token_length_filter_enabled|emogenie_beta_enabled|apply_formatting_all_enabled|shadow_dom_chrome_enabled|denali_link_to_kaza_enabled|extension_assistant_experiment_all_enabled|" +
		"gdocs_for_all_safari_enabled|extension_assistant_all_enabled|safari_migration_backup_notif1_enabled|auto_complete_correct_edge_enabled|safari_migration_popup_editor_disabled_enabled|extension_check_manakin_v2_experiment_enabled|safari_migration_inline_warning_enabled|denali_capi_all_consumers_enabled|clarity_ai_free_v03_alert_email_1|gdocs_new_mapping_enabled|ipm_mass_promotions_test_2|officeaddin_muted_alerts_exp2_enabled1|officeaddin_perf_exp3_enabled; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("8KDGXLZlVH=8KDGXLZlVH; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("tJkCbg8XH7=tJkCbg8XH7; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("IXU7BcPBzO=IXU7BcPBzO; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("GmjYPN3eYH=GmjYPN3eYH; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("pbZI1TnzX2=pbZI1TnzX2; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("3MMydHtHgv=3MMydHtHgv; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_cookie("ELwbT8uQDd=ELwbT8uQDd; DOMAIN=auth.grammarly.com");

	_webresult = lrapi.web.add_auto_header("Accept", 
		"*/*");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"cors");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Dest", 
		"empty");

	_webresult = lrapi.web.add_header("Origin", 
		"chrome-extension://kbfnbcaeplbcioakkpcpgfkobkghlhen");

	_webresult = lrapi.web.add_header("X-CSRF-Token", 
		"AABJVmhvHWx69iKfqJmQAB0RLq2CRv2txQEyaA");

	_webresult = lrapi.web.add_header("X-Client-Type", 
		"extension-chrome");

	_webresult = lrapi.web.add_header("X-Client-Version", 
		"14.1012.0");

	_webresult = lrapi.web.add_header("X-Container-Id", 
		"qxnPSxWqSwxE");

	_webresult = lrapi.web.custom_request("oranonymous", 
		"URL=https://auth.grammarly.com/v3/user/oranonymous?app=chromeExt&field=frontend_primaryLanguage&field=frontend_soundFluent&field=frontend_role&containerId=qxnPSxWqSwxE", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t7.inf", 
		"Mode=HTML", 
		"EncType=", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-site");

	_webresult = lrapi.web.add_auto_header("Origin", 
		"https://www.amazon.in");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"no-cors");

	_webresult = lrapi.web.custom_request("OE", 
		"URL=https://fls-eu.amazon.in/1/batch/1/OE/", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=text/plain", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t8.inf", 
		"Mode=HTML", 
		"EncType=text/plain;charset=UTF-8", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={\"rid\":\"EE9C4QZH64TKGS28S5QH\",\"sid\":\"260-7871994-7522166\",\"mid\":\"A21TJRUUN4KGV\",\"sn\":\"www.amazon.in\",\"reqs\":[{\"csmcount\":{\"counter\":\"baselineCounter2\",\"value\":1,\"t\":4}},{\"csmcount\":{\"counter\":\"nexusBaselineCounter\",\"value\":1,\"t\":4}},{\"csmcount\":{\"counter\":\"CSMLibrarySize\",\"value\":9670,\"t\":5}},{\"csmcount\":{\"counter\":\"aui:hiResDesktop\",\"value\":0,\"t\":1635}},{\"csmcount\":{\"counter\":\"aui:pagejs:pkgExecTime\",\"value\":9.699999988079071," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"t\":1639}},{\"csmcount\":{\"counter\":\"aui:resource_count\",\"value\":1,\"t\":1639}},{\"csmcount\":{\"counter\":\"aui:resource_count\",\"value\":2,\"t\":1689}},{\"csmcount\":{\"counter\":\"aui:resource_count\",\"value\":3,\"t\":1689}},{\"csmcount\":{\"counter\":\"gw-preload-img\",\"value\":1,\"t\":1691}},{\"csmcount\":{\"counter\":\"csm.cookieSize\",\"value\":75,\"t\":1977}},{\"csmcount\":{\"counter\":\"CSMLibrarySize\",\"value\":2729,\"t\":1980}},{\"csmcount\":{\"counter\":\"CSMLibrarySize\"," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"value\":12585,\"t\":2025}},{\"csmcount\":{\"counter\":\"aui:resource_count\",\"value\":4,\"t\":2239}},{\"csmcount\":{\"counter\":\"adplacements:htmlviewed:Gateway:right-2:desktop\",\"value\":1,\"t\":2330}},{\"csmcount\":{\"counter\":\"adplacements:htmlviewed:589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":1,\"t\":2330}},{\"csmcount\":{\"counter\":\"gatewayCardInstrumentationFail\",\"value\":1,\"t\":2438}},{\"csmcount\":{\"counter\":\"aui:resource_count\",\"value\":5,\"t\":2445}},{\"csmcount\":" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"{\"counter\":\"aui:resource_count\",\"value\":6,\"t\":2446}},{\"csmcount\":{\"counter\":\"aui:resource_count\",\"value\":7,\"t\":2550}},{\"csmcount\":{\"counter\":\"totalImages\",\"value\":114,\"t\":2558}},{\"cel\":{\"k\":\"mrg\",\"n\":\"page module\",\"t\":2561}},{\"cel\":{\"k\":\"pmd\",\"o\":\"https://www.amazon.in\",\"p\":\"/\",\"t\":2561}},{\"cel\":{\"w\":1366,\"aw\":1366,\"h\":768,\"ah\":728,\"cd\":24,\"pd\":24,\"t\":2561,\"k\":\"sci\"}},{\"cel\":{\"w\":1349,\"h\":5572,\"t\":2629,\"k\":\"doi" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"}},{\"cel\":{\"k\":\"mso\",\"n\":\"page module\",\"t\":2629}},{\"cel\":{\"k\":\"mrg\",\"n\":\"viewport module\",\"t\":2629}},{\"cel\":{\"w\":1366,\"h\":657,\"x\":0,\"y\":0,\"t\":2629,\"k\":\"vpi\"}},{\"cel\":{\"k\":\"mso\",\"n\":\"viewport module\",\"t\":2629}},{\"cel\":{\"k\":\"mrg\",\"n\":\"features module\",\"t\":2630}},{\"cel\":{\"k\":\"mso\",\"n\":\"features module\",\"t\":2630}},{\"cel\":{\"k\":\"mrg\",\"n\":\"mouse click module\",\"t\":2630}},{\"cel\":{\"k\":\"mso\",\"n\":\"mouse click " +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"module\",\"t\":2630}},{\"cel\":{\"k\":\"mrg\",\"n\":\"mouse move module\",\"t\":2630}},{\"cel\":{\"k\":\"mso\",\"n\":\"mouse move module\",\"t\":2630}},{\"csmcount\":{\"counter\":\"Event:csm.CSMBaselineEvent.4\",\"value\":1,\"t\":2631}},{\"csmcount\":{\"counter\":\"CSMLibrarySize\",\"value\":53651,\"t\":2928}},{\"csmcount\":{\"counter\":\"aui:resource_count\",\"value\":8,\"t\":4001}},{\"csmcount\":{\"counter\":\"aui:resource_count\",\"value\":9,\"t\":4002}},{\"cel\":{\"k\":\"hrt\",\"t\":5564}},{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"csm\":{\"k\":\"chk\",\"f\":1,\"l\":{\"csmcount\":24,\"cel\":15,\"csm\":1},\"s\":\"inln\"}}]}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"cross-site");

	_webresult = lrapi.web.custom_request("com.amazon.csm.nexusclient.prod", 
		"URL=https://unagi-eu.amazon.com/1/events/com.amazon.csm.nexusclient.prod", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t9.inf", 
		"Mode=HTML", 
		"EncType=text/plain;charset=UTF-8", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={\"cs\":{\"dct\":{\"#0\":\"requestId\",\"#1\":\"EE9C4QZH64TKGS28S5QH\",\"#2\":\"server\",\"#3\":\"www.amazon.in\",\"#4\":\"obfuscatedMarketplaceId\",\"#5\":\"A21TJRUUN4KGV\",\"#6\":\"producerId\",\"#7\":\"csm\",\"#8\":\"schemaId\",\"#9\":\"csm.CSMBaselineEvent.4\",\"#10\":\"timestamp\",\"#11\":\"messageId\",\"#12\":\"sessionId\",\"#13\":\"260-7871994-7522166\"}},\"events\":[{\"data\":{\"#0\":\"#1\",\"#2\":\"#3\",\"#4\":\"#5\",\"#6\":\"#7\",\"#8\":\"#9\",\"#10\":\"2021-06-03T08:00:15.873Z\",\"" +
		"#11\":\"EE9C4QZH64TKGS28S5QH-1622707215873-8365504136\",\"#12\":\"#13\"}}]}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_cookie("csm-hit=tb:s-EE9C4QZH64TKGS28S5QH|1622707215220&t:1622707217047&adb:adblk_no; DOMAIN=www.amazon.in");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"cors");

	_webresult = lrapi.web.add_header("X-Requested-With", 
		"XMLHttpRequest");

	_webresult = lrapi.web.add_header("downlink", 
		"2.9");

	_webresult = lrapi.web.add_header("ect", 
		"4g");

	_webresult = lrapi.web.add_header("rtt", 
		"150");

	_webresult = lrapi.web.custom_request("counter", 
		"URL=https://www.amazon.in/ah/ajax/counter?ctr=desktop_ajax_atf&exp=1622707335304&rId=EE9C4QZH64TKGS28S5QH&mkId=A21TJRUUN4KGV&h=13909394b077f0624d9979eba3bc2fb8bb5d9241b8b6c0ab5791e48cbb56d827", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t10.inf", 
		"Mode=HTML", 
		"EncType=", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.revert_auto_header("Origin");

	_webresult = lrapi.web.add_auto_header("Accept", 
		"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Dest", 
		"iframe");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"cross-site");

	_webresult = lrapi.web.add_auto_header("Upgrade-Insecure-Requests", 
		"1");

	_webresult = lrapi.web.url("sf-1.50.34e0302.html", 
		"URL=https://images-eu.ssl-images-amazon.com/images/S/apesafeframe/ape/sf/whitelisted/desktop/sf-1.50.34e0302.html", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t11.inf", 
		"Mode=HTML", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.url("sf-1.50.34e0302.html_2", 
		"URL=https://images-eu.ssl-images-amazon.com/images/S/apesafeframe/ape/sf/whitelisted/desktop/sf-1.50.34e0302.html", new String[]{ 
		"Resource=0", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t12.inf", 
		"Mode=HTML", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_cookie("gnar_containerId=qxnPSxWqSwxE; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("_gcl_au=1.1.158826989.1619417052; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("ga_clientId=2019783442.1619417053; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("_hjid=ab5478c6-b271-487f-aad0-e8df8f0ddc68; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("_ga=GA1.1.2019783442.1619417053; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("tdi=asems1ohualrti4u8; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("_ga_CBK9K2ZWWE=GS1.1.1619417052.1.1.1619417213.0; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("grauth=AABJVjMK6nVkMtRJPv-iBEKuSwxWFeYpgvMqIAHum4YNW8lMKl12IZlwoAWmEeAu6sH4LXMyR16youqY; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("csrf-token=AABJVmhvHWx69iKfqJmQAB0RLq2CRv2txQEyaA; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("experiment_groups=fsrw_in_sidebar_allusers_enabled|extension_assistant_bundles_all_consumers_enabled|denali_capi_all_enabled|fsrw_in_assistant_all_consumers_enabled|truecaser_enabled|extension_new_rich_text_fields_enabled|gdocs_for_chrome_enabled|officeaddin_outcomes_ui_exp5_enabled1|premium_ungating_renewal_notification_enabled|quarantine_messages_enabled|small_hover_menus_existing_enabled|emogenie_filter_no_tone_sentences_enabled|officeaddin_upgrade_state_exp2_enabled1|" +
		"gb_analytics_mvp_phase_one_enabled|apply_formatting_all_consumers_enabled|ipm_extension_release_test_1|extension_assistant_experiment_all_consumers_enabled|extension_assistant_bundles_all_enabled|officeaddin_proofit_exp3_enabled|gdocs_sidebar_allusers_enabled|gb_in_editor_free_Test1|gdocs_for_all_firefox_enabled|gb_analytics_mvp_phase_one_30_day_enabled|auto_complete_correct_safari_enabled|fluid_gdocs_rollout_enabled|officeaddin_ue_exp3_enabled|officeaddin_upgrade_state_exp1_enabled1|" +
		"safari_migration_inline_disabled_enabled|refresh_experiments_test_enabled|completions_release_enabled1|ipm_gb_member_activation_v2_test_2|optimized_gdocs_gate_2_enabled|extension_assistant_all_consumers_enabled|fsrw_in_assistant_all_enabled|apollo_rollout_gate_enabled_1|autocorrect_new_ui_v3|emogenie_token_length_filter_enabled|emogenie_beta_enabled|apply_formatting_all_enabled|shadow_dom_chrome_enabled|denali_link_to_kaza_enabled|extension_assistant_experiment_all_enabled|" +
		"gdocs_for_all_safari_enabled|extension_assistant_all_enabled|safari_migration_backup_notif1_enabled|auto_complete_correct_edge_enabled|safari_migration_popup_editor_disabled_enabled|extension_check_manakin_v2_experiment_enabled|safari_migration_inline_warning_enabled|denali_capi_all_consumers_enabled|clarity_ai_free_v03_alert_email_1|gdocs_new_mapping_enabled|ipm_mass_promotions_test_2|officeaddin_muted_alerts_exp2_enabled1|officeaddin_perf_exp3_enabled; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("8KDGXLZlVH=8KDGXLZlVH; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("tJkCbg8XH7=tJkCbg8XH7; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("IXU7BcPBzO=IXU7BcPBzO; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("GmjYPN3eYH=GmjYPN3eYH; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("pbZI1TnzX2=pbZI1TnzX2; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("3MMydHtHgv=3MMydHtHgv; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("ELwbT8uQDd=ELwbT8uQDd; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_cookie("tqYjMgQIx5=tqYjMgQIx5; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.revert_auto_header("Upgrade-Insecure-Requests");

	_webresult = lrapi.web.add_auto_header("Accept", 
		"*/*");

	_webresult = lrapi.web.add_header("Origin", 
		"chrome-extension://kbfnbcaeplbcioakkpcpgfkobkghlhen");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"none");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Dest", 
		"empty");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"cors");

	_webresult = lrapi.web.add_header("X-CSRF-Token", 
		"AABJVmhvHWx69iKfqJmQAB0RLq2CRv2txQEyaA");

	_webresult = lrapi.web.add_header("X-Client-Type", 
		"extension-chrome");

	_webresult = lrapi.web.add_header("X-Client-Version", 
		"14.1012.0");

	_webresult = lrapi.web.add_header("X-Container-Id", 
		"qxnPSxWqSwxE");

	_webresult = lrapi.web.custom_request("mimic", 
		"URL=https://data.grammarly.com/api/mimic", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t13.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={\"originalUri\":\"\",\"newUser\":false,\"containerId\":\"qxnPSxWqSwxE\"}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_auto_header("Accept", 
		"text/html,*/*");

	_webresult = lrapi.web.add_header("Origin", 
		"https://www.amazon.in");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.add_header("X-Requested-With", 
		"XMLHttpRequest");

	_webresult = lrapi.web.add_header("downlink", 
		"2.9");

	_webresult = lrapi.web.add_header("ect", 
		"4g");

	_webresult = lrapi.web.add_header("rtt", 
		"150");

	_webresult = lrapi.web.submit_data("display.html", 
		"Action=https://www.amazon.in/gp/overlay/display.html", new String[]{ 
		"Method=POST", 
		"RecContentType=text/html", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t14.inf", 
		"Mode=HTML", 
		}, new String[]{ // ITEM DATA 
		"Name=origSessionId", "Value=260-7871994-7522166", ENDITEM, 
		"Name=subPageType", "Value=desktop", ENDITEM, 
		"Name=pageType", "Value=Gateway", ENDITEM, 
		"Name=ASIN", "Value=null", ENDITEM, 
		"Name=path", "Value=/", ENDITEM, 
		"Name=isAUI", "Value=1", ENDITEM, 
		"Name=referrer", "Value=", ENDITEM, 
		"Name=queryString", "Value=", ENDITEM, 
		EXTRARES, 
		"Url=https://m.media-amazon.com/images/G/31/AMS/IN/970X250-_desktop_banner.jpg", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		"Url=https://m.media-amazon.com/images/G/31/img19/AMS/Houseads/Laptops-Sept2019._CB436595915_.jpg", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		LAST});

	_webresult = lrapi.web.add_auto_header("Accept", 
		"*/*");

	_webresult = lrapi.web.add_header("Cache-Control", 
		"max-age=0");

	_webresult = lrapi.web.add_auto_header("Origin", 
		"chrome-extension://kbfnbcaeplbcioakkpcpgfkobkghlhen");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"none");

	_webresult = lrapi.web.custom_request("logv2", 
		"URL=https://f-log-extension.grammarly.io/logv2", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t15.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={\"logger\":\"bg.user.mimic.fail\",\"level\":\"WARN\",\"extra\":{\"json\":\"{}\"},\"application\":\"extensionChrome\",\"version\":\"14.1012.0\",\"env\":\"prod\",\"containerId\":\"qxnPSxWqSwxE\"}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_cookie("7FUEItUAwx=7FUEItUAwx; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_header("X-CSRF-Token", 
		"AABJVmhvHWx69iKfqJmQAB0RLq2CRv2txQEyaA");

	_webresult = lrapi.web.add_header("X-Client-Type", 
		"extension-chrome");

	_webresult = lrapi.web.add_header("X-Client-Version", 
		"14.1012.0");

	_webresult = lrapi.web.add_header("X-Container-Id", 
		"qxnPSxWqSwxE");

	_webresult = lrapi.web.custom_request("find", 
		"URL=https://data.grammarly.com/api/props/v2/find", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t16.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={}", 
		EXTRARES, 
		"Url=https://m.media-amazon.com/images/S/sash/pDxWAF1pBB0dzGB.woff2", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.revert_auto_header("Origin");

	_webresult = lrapi.web.add_auto_header("Accept", 
		"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Dest", 
		"document");

	_webresult = lrapi.web.add_header("Sec-Fetch-User", 
		"?1");

	_webresult = lrapi.web.add_header("Upgrade-Insecure-Requests", 
		"1");

	_webresult = lrapi.web.add_header("downlink", 
		"3.1");

	_webresult = lrapi.web.add_header("ect", 
		"4g");

	_webresult = lrapi.web.add_header("rtt", 
		"150");

	_webresult = lrapi.web.url("browse.html", 
		"URL=https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t17.inf", 
		"Mode=HTML", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_auto_header("Accept", 
		"*/*");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"none");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"cors");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Dest", 
		"empty");

	_webresult = lrapi.web.add_header("Origin", 
		"chrome-extension://kbfnbcaeplbcioakkpcpgfkobkghlhen");

	_webresult = lrapi.web.add_header("X-CSRF-Token", 
		"AABJVmhvHWx69iKfqJmQAB0RLq2CRv2txQEyaA");

	_webresult = lrapi.web.add_header("X-Client-Type", 
		"extension-chrome");

	_webresult = lrapi.web.add_header("X-Client-Version", 
		"14.1012.0");

	_webresult = lrapi.web.add_header("X-Container-Id", 
		"qxnPSxWqSwxE");

	_webresult = lrapi.web.custom_request("isLlamaInstalled", 
		"URL=https://data.grammarly.com/api/props/v2/isLlamaInstalled", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t18.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_cookie("visitCount=1; DOMAIN=fls-eu.amazon.in");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-site");

	_webresult = lrapi.web.add_header("Origin", 
		"https://www.amazon.in");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"no-cors");

	_webresult = lrapi.web.custom_request("OE_2", 
		"URL=https://fls-eu.amazon.in/1/batch/1/OE/", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=text/plain", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t19.inf", 
		"Mode=HTML", 
		"EncType=text/plain;charset=UTF-8", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={\"rid\":\"EE9C4QZH64TKGS28S5QH\",\"sid\":\"260-7871994-7522166\",\"mid\":\"A21TJRUUN4KGV\",\"sn\":\"www.amazon.in\",\"reqs\":[{\"cel\":{\"k\":\"mmm1\",\"e\":[{\"x\":813,\"y\":478,\"t\":7986},{\"x\":782,\"y\":362,\"t\":8076},{\"x\":760,\"y\":310,\"t\":8110},{\"x\":742,\"y\":287,\"t\":8142},{\"x\":721,\"y\":275,\"t\":8176},{\"x\":690,\"y\":277,\"t\":8210},{\"x\":641,\"y\":313,\"t\":8276},{\"x\":602,\"y\":365,\"t\":8446}],\"min\":200,\"max\":200,\"avg\":200}},{\"cel\":{\"k\":\"hrt\",\"t\":10069" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"}},{\"cel\":{\"k\":\"mmm1\",\"e\":[{\"x\":591,\"y\":355,\"t\":8991},{\"x\":474,\"y\":234,\"t\":9126},{\"x\":427,\"y\":222,\"t\":9226},{\"x\":380,\"y\":236,\"t\":9359}],\"min\":100,\"max\":200,\"avg\":150}},{\"csmcount\":{\"counter\":\"gwAjaxCall\",\"value\":1,\"t\":15667}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":1,\"t\":15682}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":2,\"t\":15693}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":3,\"t\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":15701}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":4,\"t\":15713}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":5,\"t\":15737}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":6,\"t\":15744}},{\"csmcount\":{\"counter\":\"gw-lazy-load-all\",\"value\":1,\"t\":15749}},{\"csmcount\":{\"counter\":\"gw-lazy-load-non-empty\",\"value\":1,\"t\":15751}},{\"csmcount\":{\"counter\":\"gw-lazy-load-all\",\"value\":2,\"t\":15751}},{\"csmcount\":{\"counter\":" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"gw-lazy-load-non-empty\",\"value\":2,\"t\":15753}},{\"csmcount\":{\"counter\":\"gw-lazy-load-all\",\"value\":3,\"t\":15753}},{\"csmcount\":{\"counter\":\"gw-lazy-load-non-empty\",\"value\":3,\"t\":15755}},{\"csmcount\":{\"counter\":\"gw-lazy-load-all\",\"value\":4,\"t\":15755}},{\"csmcount\":{\"counter\":\"gw-lazy-load-non-empty\",\"value\":4,\"t\":15756}},{\"csmcount\":{\"counter\":\"gw-lazy-load-all\",\"value\":5,\"t\":15756}},{\"csmcount\":{\"counter\":\"gw-lazy-load-non-empty\",\"value\":5," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"t\":15757}},{\"csmcount\":{\"counter\":\"gw-lazy-load-all\",\"value\":6,\"t\":15757}},{\"csmcount\":{\"counter\":\"gw-lazy-load-non-empty\",\"value\":6,\"t\":15760}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":7,\"t\":15761}},{\"csmcount\":{\"counter\":\"gw-desktop-1-lazy-cards\",\"value\":1,\"t\":15765}},{\"csmcount\":{\"counter\":\"gw-desktop-1-lazy\",\"value\":1,\"t\":15766}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":8,\"t\":15771}},{\"csmcount\":{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"counter\":\"gw-desktop-2-lazy-cards\",\"value\":18,\"t\":15773}},{\"csmcount\":{\"counter\":\"gw-desktop-2-lazy\",\"value\":1,\"t\":15773}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":9,\"t\":15780}},{\"csmcount\":{\"counter\":\"gw-desktop-3-lazy-cards\",\"value\":23,\"t\":15782}},{\"csmcount\":{\"counter\":\"gw-desktop-3-lazy\",\"value\":1,\"t\":15782}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":10,\"t\":15855}},{\"csmcount\":{\"counter\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"shovelerNotEnoughItem\",\"value\":11,\"t\":15859}},{\"csmcount\":{\"counter\":\"gw-desktop-4-lazy-cards\",\"value\":11,\"t\":15863}},{\"csmcount\":{\"counter\":\"gw-desktop-4-lazy\",\"value\":1,\"t\":15863}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":12,\"t\":15865}},{\"csmcount\":{\"counter\":\"gw-desktop-5-lazy-cards\",\"value\":13,\"t\":15867}},{\"csmcount\":{\"counter\":\"gw-desktop-5-lazy\",\"value\":1,\"t\":15867}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"value\":13,\"t\":15870}},{\"csmcount\":{\"counter\":\"gw-desktop-6-lazy-cards\",\"value\":23,\"t\":15871}},{\"csmcount\":{\"counter\":\"gw-desktop-6-lazy\",\"value\":1,\"t\":15871}},{\"cel\":{\"w\":1349,\"h\":5532,\"t\":15891,\"k\":\"doi\"}},{\"csmcount\":{\"counter\":\"adplacements:sfversion:1.50.34e0302\",\"value\":1,\"t\":16412}},{\"csmcount\":{\"counter\":\"adplacements:abpstatus:notenabled:Gateway:right-2:desktop\",\"value\":0,\"t\":16427}},{\"csmcount\":{\"counter\":\"adplacements:abpstatus" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":notenabled:589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":0,\"t\":16427}},{\"csmcount\":{\"counter\":\"adplacements:abpstatus:enabled:Gateway:right-2:desktop\",\"value\":0,\"t\":16427}},{\"csmcount\":{\"counter\":\"adplacements:abpstatus:enabled:589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":0,\"t\":16427}},{\"csmcount\":{\"counter\":\"adplacements:abpstatus:unknown:Gateway:right-2:desktop\",\"value\":1,\"t\":16427}},{\"csmcount\":{\"counter\":\"adplacements:abpstatus:unknown" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":1,\"t\":16427}},{\"csmcount\":{\"counter\":\"adplacements:adload:start:Gateway:right-2:desktop\",\"value\":1,\"t\":16427}},{\"csmcount\":{\"counter\":\"adplacements:adload:start:589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":1,\"t\":16427}},{\"csmcount\":{\"counter\":\"d16g_postMessageSupported\",\"value\":1,\"t\":16427}},{\"csmcount\":{\"counter\":\"adplacements:abpstatus:notenabled:Gateway:desktop-ad-center-1:desktop\",\"value\":0,\"t\":16429}}" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		",{\"csmcount\":{\"counter\":\"adplacements:abpstatus:notenabled:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"value\":0,\"t\":16429}},{\"csmcount\":{\"counter\":\"adplacements:abpstatus:enabled:Gateway:desktop-ad-center-1:desktop\",\"value\":0,\"t\":16429}},{\"csmcount\":{\"counter\":\"adplacements:abpstatus:enabled:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"value\":0,\"t\":16429}},{\"csmcount\":{\"counter\":\"adplacements:abpstatus:unknown:Gateway:desktop-ad-center-1:desktop\",\"value\":1,\"t\":16430}}," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"{\"csmcount\":{\"counter\":\"adplacements:abpstatus:unknown:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"value\":1,\"t\":16430}},{\"csmcount\":{\"counter\":\"adplacements:adload:start:Gateway:desktop-ad-center-1:desktop\",\"value\":1,\"t\":16430}},{\"csmcount\":{\"counter\":\"adplacements:adload:start:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"value\":1,\"t\":16430}},{\"csmcount\":{\"counter\":\"d16g_postMessageSupported\",\"value\":1,\"t\":16430}},{\"csmcount\":{\"counter\":\"adplacements:adload" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":delayloadcallback:Gateway:right-2:desktop\",\"value\":1,\"t\":16501}},{\"csmcount\":{\"counter\":\"adplacements:adload:delayloadcallback:589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":1,\"t\":16501}},{\"csmcount\":{\"counter\":\"adplacements:adload:iframecreated:Gateway:right-2:desktop\",\"value\":1,\"t\":16514}},{\"csmcount\":{\"counter\":\"adplacements:adload:iframecreated:589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":1,\"t\":16521}},{\"csmcount\":{\"counter\":\"adplacements:adload" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":delayloadcallback:Gateway:desktop-ad-center-1:desktop\",\"value\":1,\"t\":16521}},{\"csmcount\":{\"counter\":\"adplacements:adload:delayloadcallback:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"value\":1,\"t\":16521}},{\"csmcount\":{\"counter\":\"adplacements:adload:iframecreated:Gateway:desktop-ad-center-1:desktop\",\"value\":1,\"t\":16549}},{\"csmcount\":{\"counter\":\"adplacements:adload:iframecreated:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"value\":1,\"t\":16549}},{\"csmcount\":{\"counter\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"NavJS:CSM:Latency:PreloadSprite:desktop\",\"value\":2032,\"t\":16593}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":14,\"t\":16609}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":15,\"t\":16820}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":16,\"t\":16829}},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":17,\"t\":16851}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"value\":1,\"t\":16919}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7\",\"value\":1,\"t\":16919}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_primelink_nonmember_2860122b63884a8688052dc445e46bd9\",\"value\":1,\"t\":16919}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"value\":1,\"t\":16919}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":nav_cs_electronics_c5b70a82461a484189e700166599ce9f\",\"value\":1,\"t\":16920}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45\",\"value\":1,\"t\":16920}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_help_79404a52982a4d9d973cf256c713999e\",\"value\":1,\"t\":16920}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84\",\"value\":1,\"t\":16920}},{\"csmcount\":{\"counter\":\"Nav:Xshop" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":Impression:nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f\",\"value\":1,\"t\":16921}},{\"navigation\":{\"quirks\":0}},{\"csmcount\":{\"counter\":\"nav-flyout-prime-attach-latency\",\"value\":14848,\"t\":16961}},{\"csmcount\":{\"counter\":\"nav-flyout-accountList-attach-latency\",\"value\":14853,\"t\":16965}},{\"csmcount\":{\"counter\":\"adplacements:adload:iframeinitialized:Gateway:right-2:desktop\",\"value\":1,\"t\":16991}},{\"csmcount\":{\"counter\":\"adplacements:adload:iframeinitialized" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":1,\"t\":16992}},{\"csmcount\":{\"counter\":\"adplacements:adfetch:request:Gateway:right-2:desktop\",\"value\":1,\"t\":16992}},{\"csmcount\":{\"counter\":\"adplacements:adfetch:request:589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":1,\"t\":16992}},{\"cel\":{\"k\":\"hrt\",\"t\":16996}},{\"csmcount\":{\"counter\":\"adplacements:adload:iframeinitialized:Gateway:desktop-ad-center-1:desktop\",\"value\":1,\"t\":16999}},{\"csmcount\":{\"counter\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"adplacements:adload:iframeinitialized:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"value\":1,\"t\":16999}},{\"csmcount\":{\"counter\":\"adplacements:adfetch:request:Gateway:desktop-ad-center-1:desktop\",\"value\":1,\"t\":16999}},{\"csmcount\":{\"counter\":\"adplacements:adfetch:request:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"value\":1,\"t\":16999}},{\"csmcount\":{\"counter\":\"nav-flyout-groceries-attach-latency\",\"value\":14938,\"t\":17050}},{\"csmcount\":{\"counter\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"nav-flyout-transientFlyout-attach-latency\",\"value\":14941,\"t\":17053}},{\"csmcount\":{\"counter\":\"nav-flyout-fresh-attach-latency\",\"value\":14942,\"t\":17054}},{\"csmcount\":{\"counter\":\"nav-flyout-abAcquisition-attach-latency\",\"value\":14943,\"t\":17055}},{\"csmcount\":{\"counter\":\"nav-flyout-abActivation-attach-latency\",\"value\":14944,\"t\":17056}},{\"csmcount\":{\"counter\":\"nav-flyout-abAccountLink-attach-latency\",\"value\":14946,\"t\":17058}},{\"csmcount\":{\"counter\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"iss-warmup:init\",\"value\":1,\"t\":17084}},{\"csmcount\":{\"counter\":\"iss-warmup:ajax:init\",\"value\":1,\"t\":17087}},{\"csmcount\":{\"counter\":\"iss-api-v2:init\",\"value\":1,\"t\":17095}},{\"csmcount\":{\"counter\":\"nav-flyout-signinTT-show\",\"value\":1,\"t\":17355}},{\"csmcount\":{\"counter\":\"nav-flyout-signinTT-gateway-show\",\"value\":1,\"t\":17355}},{\"cel\":{\"k\":\"mmm1\",\"e\":[{\"x\":318,\"y\":45,\"t\":16750},{\"x\":314,\"y\":8,\"t\":16862},{\"x\":300,\"y\":24,\"t\":16979},{\"x" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\":286,\"y\":50,\"t\":17110},{\"x\":283,\"y\":70,\"t\":17284},{\"x\":303,\"y\":86,\"t\":17480},{\"x\":308,\"y\":93,\"t\":17628}],\"min\":100,\"max\":200,\"avg\":133}},{\"cel\":{\"k\":\"mcm\",\"w\":1349,\"h\":5532,\"t\":21892,\"x\":328,\"y\":83,\"p\":\"//*[@id='nav-xshop']/A[4]\",\"n\":\"A\",\"dt\":1448.7,\"r\":\"https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"c\":[\"nav-a\",\"\"]}},{\"csmcount\":{\"counter\":\"postbackImageSize\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"value\":917,\"t\":21968}},{\"cel\":{\"k\":\"hrt\",\"t\":21978}},{\"csmcount\":{\"counter\":\"cel.PDM.TotalExecutions\",\"value\":31,\"t\":21979}},{\"csmcount\":{\"counter\":\"cel.VPI.TotalExecutions\",\"value\":1,\"t\":21979}},{\"csmcount\":{\"counter\":\"cel.VPI.TotalExecutionTime\",\"value\":0,\"t\":21979}},{\"csmcount\":{\"counter\":\"cel.VPI.AverageExecutionTime\",\"value\":0,\"t\":21979}},{\"csmcount\":{\"counter\":\"cel.widgets.batchesProcessed\",\"value\":0,\"t\":21979}},{\"cel\":{\"k\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"mmm1\",\"e\":[{\"x\":309,\"y\":93,\"t\":17660},{\"x\":328,\"y\":83,\"t\":18334},{\"x\":328,\"y\":83,\"t\":21979}],\"min\":100,\"max\":200,\"avg\":125}},{\"cel\":{\"k\":\"hrt\",\"t\":21979}},{\"cel\":{\"k\":\"eod\",\"t0\":1622707213241,\"t\":21979}},{\"csmcount\":{\"counter\":\"armored-cxguardrails.unresponsive-clicks.violations\",\"value\":0,\"t\":21979}},{\"csmcount\":{\"counter\":\"armored-cxguardrails.unresponsive-clicks.violationRate\",\"value\":0,\"t\":21979}},{\"csm\":{\"k\":\"chk\",\"f\":2," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"l\":{\"csmcount\":132,\"cel\":26,\"csm\":2,\"navigation\":1},\"s\":\"inln\"}}]}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.add_header("Cache-Control", 
		"max-age=0");

	_webresult = lrapi.web.add_header("downlink", 
		"2.9");

	_webresult = lrapi.web.add_header("ect", 
		"4g");

	_webresult = lrapi.web.add_header("rtt", 
		"150");

	_webresult = lrapi.web.url("uedata", 
		"URL=https://www.amazon.in/rd/uedata?ul&v=0.217347.0&id=EE9C4QZH64TKGS28S5QH&m=1&sc=EE9C4QZH64TKGS28S5QH&ue=5&bb=1981&ns=2035&ne=2383&cf=2385&be=2557&fp=2126&fcp=2126&af=3999&fn=3999&pc=21961&tc=-12220&na_=-12220&ul_=-1622707213241&_ul=-1622707213241&rd_=-1622707213241&_rd=-1622707213241&fe_=-11989&lk_=-8123&_lk=-7884&co_=-7884&_co=-653&sc_=-3267&rq_=-652&rs_=-179&_rs=419&dl_=-136&di_=2930&de_=2930&_de=2930&_dc=-1622707213241&ld_=-1622707213241&_ld=-1622707213241&ntd=0&ty=0&rc=0&hob=3&hoe=5&ul=" +		"21961&t=1622707235202&ctb=1&rt=cf:7-0-3-4-1-0-1_af:43-0-3-36-2-0-0_&csmtags=aui|aui:aui_build_date:3.21.4-2021-05-27|navbar|gwCFImgNoCache|fls-eu-amazon-in|adblk_no|csm-feature-touch-enabled:false|fourColumn|fourColumnRevised|flexLayout|cssGridLayout|ABPStatusUnknown:Gateway:right-2:desktop|ABPStatusUnknown:Gateway:desktop-ad-center-1:desktop|iss-on-time&viz=visible:5&pty=Gateway&spty=desktop&pti=desktop&tid=EE9C4QZH64TKGS28S5QH&aftb=1&ui=2", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t20.inf", 
		"Mode=HTML", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_cookie("L1O10AaDBe=L1O10AaDBe; DOMAIN=data.grammarly.com");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"none");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"cors");

	_webresult = lrapi.web.add_header("Origin", 
		"chrome-extension://kbfnbcaeplbcioakkpcpgfkobkghlhen");

	_webresult = lrapi.web.add_header("X-CSRF-Token", 
		"AABJVmhvHWx69iKfqJmQAB0RLq2CRv2txQEyaA");

	_webresult = lrapi.web.add_header("X-Client-Type", 
		"extension-chrome");

	_webresult = lrapi.web.add_header("X-Client-Version", 
		"14.1012.0");

	_webresult = lrapi.web.add_header("X-Container-Id", 
		"qxnPSxWqSwxE");

	_webresult = lrapi.web.custom_request("showDesktopIntegrationExtensionToggle", 
		"URL=https://data.grammarly.com/api/props/v2/showDesktopIntegrationExtensionToggle", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t21.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-site");

	_webresult = lrapi.web.add_header("Origin", 
		"https://www.amazon.in");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"no-cors");

	_webresult = lrapi.web.custom_request("OE_3", 
		"URL=https://fls-eu.amazon.in/1/batch/1/OE/", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=text/plain", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t22.inf", 
		"Mode=HTML", 
		"EncType=text/plain;charset=UTF-8", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={\"rid\":\"EE9C4QZH64TKGS28S5QH\",\"sid\":\"260-7871994-7522166\",\"mid\":\"A21TJRUUN4KGV\",\"sn\":\"www.amazon.in\",\"reqs\":[{\"csmcount\":{\"counter\":\"QF-N:SN:QN:TN\",\"value\":1,\"t\":21981}},{\"csmcount\":{\"counter\":\"iss-warmup:ajax:error\",\"value\":1,\"t\":22020}},{\"csmcount\":{\"counter\":\"iss-warmup:ajax:errortimeout\",\"value\":1,\"t\":22020}},{\"csmcount\":{\"counter\":\"postbackImageSize\",\"value\":198,\"t\":31969}},{\"csmcount\":{\"counter\":\"adplacements:adfetch" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":httperror:Gateway:right-2:desktop\",\"value\":1,\"t\":36809}},{\"csmcount\":{\"counter\":\"adplacements:adfetch:httperror:589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":1,\"t\":36809}},{\"csmcount\":{\"counter\":\"adplacements:safeFrameError\",\"value\":1,\"t\":36810}},{\"csmcount\":{\"counter\":\"adplacements:adfeedback:request:Gateway:right-2:desktop\",\"value\":1,\"t\":36812}},{\"csmcount\":{\"counter\":\"adplacements:adfeedback:request:589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":1,\"t" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\":36812}},{\"csmcount\":{\"counter\":\"adplacements:adfetch:httperror:Gateway:desktop-ad-center-1:desktop\",\"value\":1,\"t\":36813}},{\"csmcount\":{\"counter\":\"adplacements:adfetch:httperror:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"value\":1,\"t\":36813}},{\"csmcount\":{\"counter\":\"adplacements:safeFrameError\",\"value\":1,\"t\":36813}},{\"csmcount\":{\"counter\":\"adplacements:adfeedback:request:Gateway:desktop-ad-center-1:desktop\",\"value\":1,\"t\":36814}},{\"csmcount\":{\"counter\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"adplacements:adfeedback:request:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"value\":1,\"t\":36814}},{\"csmcount\":{\"counter\":\"primeMetric-AjaxCallCount\",\"value\":1,\"t\":37042}},{\"csmcount\":{\"counter\":\"primeMetric-AjaxLatency\",\"value\":19772,\"t\":37043}},{\"csmcount\":{\"counter\":\"adplacements:cache:sflibrary:cached:Gateway:desktop-ad-center-1:desktop\",\"value\":1,\"t\":37063}},{\"csmcount\":{\"counter\":\"adplacements:cache:sflibrary:cached:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"value\":1,\"t\":37063}},{\"csmcount\":{\"counter\":\"adplacements:cache:sfhtml:cached:Gateway:desktop-ad-center-1:desktop\",\"value\":1,\"t\":37063}},{\"csmcount\":{\"counter\":\"adplacements:cache:sfhtml:cached:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"value\":1,\"t\":37063}},{\"csmcount\":{\"counter\":\"adplacements:cache:sflibrary:cached:Gateway:right-2:desktop\",\"value\":1,\"t\":37064}},{\"csmcount\":{\"counter\":\"adplacements:cache:sflibrary:cached:589e332a-17d0-4382-b320-05e6f4ddc521\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"value\":1,\"t\":37064}},{\"csmcount\":{\"counter\":\"adplacements:cache:sfhtml:cached:Gateway:right-2:desktop\",\"value\":1,\"t\":37064}},{\"csmcount\":{\"counter\":\"adplacements:cache:sfhtml:cached:589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":1,\"t\":37064}},{\"csmcount\":{\"counter\":\"adplacements:adfeedback:success:Gateway:right-2:desktop\",\"value\":1,\"t\":37163}},{\"csmcount\":{\"counter\":\"adplacements:adfeedback:success:589e332a-17d0-4382-b320-05e6f4ddc521\",\"value\":1,\"t\":37163}" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"},{\"csmcount\":{\"counter\":\"shovelerNotEnoughItem\",\"value\":18,\"t\":37373}},{\"csmcount\":{\"counter\":\"adplacements:adfeedback:success:Gateway:desktop-ad-center-1:desktop\",\"value\":1,\"t\":37450}},{\"csmcount\":{\"counter\":\"adplacements:adfeedback:success:e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"value\":1,\"t\":37451}},{\"csm\":{\"k\":\"chk\",\"f\":3,\"l\":{\"csmcount\":161,\"cel\":26,\"csm\":3,\"navigation\":1},\"s\":\"inln\"}}]}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_header("Origin", 
		"chrome-extension://kbfnbcaeplbcioakkpcpgfkobkghlhen");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"none");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"cors");

	_webresult = lrapi.web.add_header("Cache-Control", 
		"max-age=0");

	_webresult = lrapi.web.custom_request("logv2_2", 
		"URL=https://f-log-extension.grammarly.io/logv2", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t23.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={\"logger\":\"bg.state.user.update.exceeded\",\"level\":\"WARN\",\"extra\":{\"json\":\"{\\\"updateTime\\\":44517}\"},\"application\":\"extensionChrome\",\"version\":\"14.1012.0\",\"env\":\"prod\",\"userId\":\"1035883401\",\"containerId\":\"qxnPSxWqSwxE\"}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_cookie("visitCount=1; DOMAIN=unagi.amazon.in");

	_webresult = lrapi.web.add_header("Origin", 
		"https://www.amazon.in");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-site");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"no-cors");

	_webresult = lrapi.web.custom_request("com.amazon.csm.csa.prod", 
		"URL=https://unagi.amazon.in/1/events/com.amazon.csm.csa.prod", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t24.inf", 
		"Mode=HTML", 
		"EncType=text/plain;charset=UTF-8", 
		"Body={\"events\":[{\"data\":{\"markers\":{\"pageVisible\":0,\"cumulativeLayoutShiftLastTimestamp\":14454,\"functional:aui-da-a-button-group:click\":28709,\"functional:aui-da-a-tabs:click\":29121,\"functional:aui-da-a-tabs:keydown\":28715,\"functional:aui-da-a-switch:mousedown\":28717,\"functional:aui-da-a-switch-input:change\":28717,\"functional:aui-da-a-switch-label:click\":28717,\"functional:aui-da-a-popover-floating-close:click\":28721,\"functional:aui-da-a-accordion:click\":28912,\"functional" +
		":aui-da-a-accordion:keypress\":28912,\"functional:aui-da-a-expander-toggle:click\":28913,\"functional:aui-da-a-popover-close:click\":29114,\"functional:aui-da-a-popover-close:pointerup\":29115,\"functional:aui-da-a-popover-a11y:focusout\":29115,\"functional:aui-da-a-popover-a11y:focusin\":29115,\"functional:aui-da-a-popover-a11y:keydown\":29115,\"functional:aui-da-a-modal:click\":29122,\"functional:aui-da-a-popover:click\":29122,\"functional:aui-da-a-popover:keydown\":29122,\"functional" +
		":aui-da-a-popover:mouseenter\":29122,\"functional:aui-da-a-popover:mousemove\":29122,\"functional:aui-da-a-popover:mouseleave\":29123,\"functional:aui-da-a-popover-container:mouseenter\":29123,\"functional:aui-da-a-popover-container:mouseleave\":29123,\"functional:aui-da-a-tooltip:click\":29123,\"functional:aui-da-a-tooltip:mouseenter\":29123,\"functional:aui-da-a-tooltip:mouseleave\":29123,\"functional:aui-da-a-tooltip:focus\":29123,\"functional:aui-da-a-tooltip:focusin\":29123,\"functional" +
		":aui-da-a-tooltip:blur\":29123,\"functional:aui-da-a-tooltip:focusout\":29123,\"functional:aui-da-a-splitdropdown-button:click\":29131,\"functional:aui-da-a-splitdropdown-main:click\":29131,\"functional:aui-da-a-splitdropdown-button:keydown\":29131,\"functional:aui-da-p13n-sc-atl:click\":29132,\"functional:aui-da-a-dropdown-button:click\":29137,\"ue\":12225,\"bodyBegin\":14201,\"ns\":14255,\"ne\":14603,\"criticalFeature\":14605,\"bodyEnd\":14777,\"firstPaint\":14346,\"firstContentfulPaint\":14346," +
		"\"aboveTheFold\":16219,\"functional\":16219,\"pc\":34181,\"tc\":0,\"na_\":0,\"ul_\":34189,\"_ul\":34189,\"rd_\":34189,\"_rd\":34189,\"fe_\":231,\"lk_\":4097,\"_lk\":4336,\"co_\":4336,\"_co\":11567,\"sc_\":8953,\"rq_\":11568,\"rs_\":12041,\"_rs\":12639,\"dl_\":12084,\"di_\":15150,\"de_\":15150,\"_de\":15150,\"_dc\":34189,\"ld_\":34189,\"_ld\":34189,\"ntd\":12220,\"ty\":12220,\"rc\":12220,\"hob\":12223,\"hoe\":12225,\"ul\":34181,\"navigationStart\":0,\"fetchStart\":231,\"domainLookupStart\":4097,\"" +
		"domainLookupEnd\":4336,\"connectStart\":4336,\"connectEnd\":11567,\"secureConnectionStart\":8953,\"requestStart\":11568,\"responseStart\":12041,\"responseEnd\":12639,\"domLoading\":12084,\"domInteractive\":15150,\"domContentLoadedEventStart\":15150,\"domContentLoadedEventEnd\":15150,\"visuallyLoaded10\":14459,\"visuallyLoaded20\":14504,\"visuallyLoaded30\":14504,\"visuallyLoaded40\":14504,\"visuallyLoaded50\":14504,\"visuallyLoaded60\":14504,\"visuallyLoaded70\":14504,\"visuallyLoaded80\":14504,\"" +
		"visuallyLoaded90\":15611,\"visuallyLoaded100\":15629,\"speedIndex\":14766,\"visuallyLoaded0\":0,\"atfSpeedIndex\":14766,\"largestContentfulPaint\":14746,\"largestContentfulPaint.render\":14746,\"largestContentfulPaint.load\":14584},\"markerTimestamps\":{\"pageVisible\":1622707201021,\"cumulativeLayoutShiftLastTimestamp\":1622707215475,\"functional:aui-da-a-button-group:click\":1622707229730,\"functional:aui-da-a-tabs:click\":1622707230142,\"functional:aui-da-a-tabs:keydown\":1622707229736,\"" +
		"functional:aui-da-a-switch:mousedown\":1622707229738,\"functional:aui-da-a-switch-input:change\":1622707229738,\"functional:aui-da-a-switch-label:click\":1622707229738,\"functional:aui-da-a-popover-floating-close:click\":1622707229742,\"functional:aui-da-a-accordion:click\":1622707229933,\"functional:aui-da-a-accordion:keypress\":1622707229933,\"functional:aui-da-a-expander-toggle:click\":1622707229934,\"functional:aui-da-a-popover-close:click\":1622707230135,\"functional:aui-da-a-popover-close" +
		":pointerup\":1622707230136,\"functional:aui-da-a-popover-a11y:focusout\":1622707230136,\"functional:aui-da-a-popover-a11y:focusin\":1622707230136,\"functional:aui-da-a-popover-a11y:keydown\":1622707230136,\"functional:aui-da-a-modal:click\":1622707230143,\"functional:aui-da-a-popover:click\":1622707230143,\"functional:aui-da-a-popover:keydown\":1622707230143,\"functional:aui-da-a-popover:mouseenter\":1622707230143,\"functional:aui-da-a-popover:mousemove\":1622707230143,\"functional" +
		":aui-da-a-popover:mouseleave\":1622707230144,\"functional:aui-da-a-popover-container:mouseenter\":1622707230144,\"functional:aui-da-a-popover-container:mouseleave\":1622707230144,\"functional:aui-da-a-tooltip:click\":1622707230144,\"functional:aui-da-a-tooltip:mouseenter\":1622707230144,\"functional:aui-da-a-tooltip:mouseleave\":1622707230144,\"functional:aui-da-a-tooltip:focus\":1622707230144,\"functional:aui-da-a-tooltip:focusin\":1622707230144,\"functional:aui-da-a-tooltip:blur\":1622707230144," +
		"\"functional:aui-da-a-tooltip:focusout\":1622707230144,\"functional:aui-da-a-splitdropdown-button:click\":1622707230152,\"functional:aui-da-a-splitdropdown-main:click\":1622707230152,\"functional:aui-da-a-splitdropdown-button:keydown\":1622707230152,\"functional:aui-da-p13n-sc-atl:click\":1622707230153,\"functional:aui-da-a-dropdown-button:click\":1622707230158,\"ue\":1622707213246,\"bodyBegin\":1622707215222,\"ns\":1622707215276,\"ne\":1622707215624,\"criticalFeature\":1622707215626,\"bodyEnd\"" +
		":1622707215798,\"firstPaint\":1622707215367,\"firstContentfulPaint\":1622707215367,\"aboveTheFold\":1622707217240,\"functional\":1622707217240,\"pc\":1622707235202,\"tc\":1622707201021,\"na_\":1622707201021,\"ul_\":1622707235210,\"_ul\":1622707235210,\"rd_\":1622707235210,\"_rd\":1622707235210,\"fe_\":1622707201252,\"lk_\":1622707205118,\"_lk\":1622707205357,\"co_\":1622707205357,\"_co\":1622707212588,\"sc_\":1622707209974,\"rq_\":1622707212589,\"rs_\":1622707213062,\"_rs\":1622707213660,\"dl_\"" +
		":1622707213105,\"di_\":1622707216171,\"de_\":1622707216171,\"_de\":1622707216171,\"_dc\":1622707235210,\"ld_\":1622707235210,\"_ld\":1622707235210,\"ntd\":1622707213241,\"ty\":1622707213241,\"rc\":1622707213241,\"hob\":1622707213244,\"hoe\":1622707213246,\"ul\":1622707235202,\"navigationStart\":1622707201021,\"fetchStart\":1622707201252,\"domainLookupStart\":1622707205118,\"domainLookupEnd\":1622707205357,\"connectStart\":1622707205357,\"connectEnd\":1622707212588,\"secureConnectionStart\"" +
		":1622707209974,\"requestStart\":1622707212589,\"responseStart\":1622707213062,\"responseEnd\":1622707213660,\"domLoading\":1622707213105,\"domInteractive\":1622707216171,\"domContentLoadedEventStart\":1622707216171,\"domContentLoadedEventEnd\":1622707216171,\"visuallyLoaded10\":1622707215480,\"visuallyLoaded20\":1622707215525,\"visuallyLoaded30\":1622707215525,\"visuallyLoaded40\":1622707215525,\"visuallyLoaded50\":1622707215525,\"visuallyLoaded60\":1622707215525,\"visuallyLoaded70\":1622707215525" +
		",\"visuallyLoaded80\":1622707215525,\"visuallyLoaded90\":1622707216632,\"visuallyLoaded100\":1622707216650,\"speedIndex\":1622707215787,\"visuallyLoaded0\":1622707201021,\"atfSpeedIndex\":1622707215787,\"largestContentfulPaint\":1622707215767,\"largestContentfulPaint.render\":1622707215767,\"largestContentfulPaint.load\":1622707215605},\"navigationStartTimestamp\":\"2021-06-03T08:00:01.021Z\",\"schemaId\":\"csa.PageLatency.5\",\"timestamp\":\"2021-06-03T08:00:35.274Z\",\"messageId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"583t0y-c39k42-gtl9fv-5nktmh\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"schemaId\":\"csa.Metric.3\",\"metrics\":{\"totalBlockingTime\":502,\"totalBlockingTimeInclLCP\":1570,\"maxBlockingTime\":114},\"dimensions\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":{},\"timestamp\":\"2021-06-03T08:00:38.219Z\",\"messageId\":\"wgvni3-xjf31w-ta027s-ryx0j0\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"schemaId\":\"csa.Metric.3\",\"metrics\":{\"firstInputDelay\":1448},\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"dimensions\":{},\"timestamp\":\"2021-06-03T08:00:38.288Z\",\"messageId\":\"i5uro8-hxw2t3-p08x1j-vivajt\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}}]}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_header("Origin", 
		"chrome-extension://kbfnbcaeplbcioakkpcpgfkobkghlhen");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"none");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"cors");

	_webresult = lrapi.web.add_header("Cache-Control", 
		"max-age=0");

	_webresult = lrapi.web.custom_request("logv2_3", 
		"URL=https://f-log-extension.grammarly.io/logv2", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t25.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={\"logger\":\"bg.state.start.timeout\",\"level\":\"WARN\",\"extra\":{\"json\":\"{\\\"initTime\\\":53370}\"},\"application\":\"extensionChrome\",\"version\":\"14.1012.0\",\"env\":\"prod\",\"userId\":\"1035883401\",\"containerId\":\"qxnPSxWqSwxE\"}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-site");

	_webresult = lrapi.web.add_header("Origin", 
		"https://www.amazon.in");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"no-cors");

	_webresult = lrapi.web.custom_request("com.amazon.csm.csa.prod_2", 
		"URL=https://unagi.amazon.in/1/events/com.amazon.csm.csa.prod", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t26.inf", 
		"Mode=HTML", 
		"EncType=text/plain;charset=UTF-8", 
		"Body={\"events\":[{\"data\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"producerId\":\"csa\",\"schemaId\":\"csa.PageEntity.1\",\"version\":1,\"attributes\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"meaningful\":\"interactive\",\"url\":\"https://www.amazon.in/\",\"server\":\"www.amazon.in\",\"path\":\"/\",\"referrer\":\"\",\"title\":\"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\",\"transitionType\":\"hard\"}" +
		",\"timestamp\":\"2021-06-03T08:00:15.264Z\",\"messageId\":\"r4h123-ly7euz-v8zg72-gvvqbs\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\"}},{\"data\":{\"transitionType\":\"hard\",\"schemaId\":\"csa.PageRender.3\",\"timestamp\":\"2021-06-03T08:00:15.265Z\",\"messageId\":\"3mlmdg-8zwy79-j0707l-1erd4v\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"meaningful\":\"interactive\",\"url\":\"https://www.amazon.in/\",\"server\":\"www.amazon.in\",\"path\":\"/\",\"referrer\":\"\",\"title\":\"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\",\"transitionType\":\"hard\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"renderedToMeaningful\":906,\"renderedToViewed\":906,\"renderedToImpressed\":1906,\"schemaId\":\"" +
		"csa.PageImpressed.2\",\"timestamp\":\"2021-06-03T08:00:17.171Z\",\"messageId\":\"s752gb-byt5kx-ui67ns-srsuri\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"meaningful\":\"interactive\",\"url\":\"https://www.amazon.in/\",\"server\":\"www.amazon.in\",\"path\":\"/\",\"referrer\":\"\",\"title\":\"Online Shopping site in India: " +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\",\"transitionType\":\"hard\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":57,\"pageFirstPaintToElementViewed\":15201,\"timestamp\":\"2021-06-03T08:00:16.222Z\",\"messageId\":\"f72q9m-dypwhy-801cy9-davvni\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"83108m-3iasvh-hptkym-tite8d\",\"type\":\"link\",\"slotId\":\"nav-link-accountList\",\"contentId\":\"nav_ya_signin\",\"href\":\"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&" +
		"openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\",\"class\":\"nav-a nav-a-2   nav-progressive-attribute\",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":58,\"pageFirstPaintToElementViewed\":15202,\"timestamp\":\"2021-06-03T08:00:16.223Z\",\"messageId\":\"mkgyug-fcenl9-hoifg3-l38b5j\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"7w5yzi-ldb2ma-kb7h9s-adnoea\",\"type\":\"widget\",\"slotId\":\"HamburgerMenuDesktop\",\"interactionEvents\":\"click\",\"href\":\"javascript: void(0)\",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":58,\"pageFirstPaintToElementViewed\":15202,\"timestamp\":\"2021-06-03T08:00:16.223Z\",\"messageId\":\"b7j4nc-oaqyl5-f30uwe-7jb1tj\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"ky466n-p9jlat-35cx57-ouiynh\",\"" +
		"type\":\"link\",\"slotId\":\"nav_cs_0\",\"contentId\":\"nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98\",\"href\":\"/gp/bestsellers/?ref_=nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":58,\"pageFirstPaintToElementViewed\":15202,\"timestamp\":\"2021-06-03T08:00:16.223Z\",\"messageId\":\"yuw2w3-rdmbrb-akyhzj-l5dk34\",\"application\":\"Retail:Prod" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"dddf47-7wx622-j1uaep-ci1wyd\",\"type\":\"link\",\"slotId\":\"nav_cs_1\",\"contentId\":\"nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7\",\"href\":\"/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7\"," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":58,\"pageFirstPaintToElementViewed\":15202,\"timestamp\":\"2021-06-03T08:00:16.223Z\",\"messageId\":\"exfz5t-et05g9-4gkhy6-wwczhj\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\"},\"session\":{\"id" +
		"\":\"260-7871994-7522166\"},\"element\":{\"id\":\"qq504r-z4v4h3-e0ca56-bifrxy\",\"type\":\"link\",\"slotId\":\"nav-link-prime\",\"contentId\":\"nav_cs_primelink_nonmember_2860122b63884a8688052dc445e46bd9\",\"href\":\"/prime?ref_=nav_cs_primelink_nonmember_2860122b63884a8688052dc445e46bd9\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":58,\"pageFirstPaintToElementViewed\":15202,\"timestamp\":\"2021-06-03T08:00" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":16.223Z\",\"messageId\":\"mgqsto-4wpjsf-tf6n9y-g1cf44\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"6kzlzv-4t6c81-kqv5aw-57wz8v\",\"type\":\"link\",\"slotId\":\"nav_cs_3\",\"contentId\":\"nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"href\":\"/gp/" +
		"browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":58,\"pageFirstPaintToElementViewed\":15202,\"timestamp\":\"2021-06-03T08:00:16.223Z\",\"messageId\":\"muxo1u-wf9zcw-liy0o-reja5k\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"z99ju9-6klhqj-b1q7q6-lgohyx\",\"type\":\"link\",\"slotId\":\"nav_cs_4\",\"contentId\":\"nav_cs_electronics_c5b70a82461a484189e700166599ce9f\",\"href\":\"/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics_c5b70a82461a484189e700166599ce9f\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"csa.ContentView.3\",\"timeToViewed\":58,\"pageFirstPaintToElementViewed\":15202,\"timestamp\":\"2021-06-03T08:00:16.223Z\",\"messageId\":\"mlqm58-7vp0m9-8c5paz-d0f1p4\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"upvnyg-ok15o8-ngzepo-h1oxgk\",\"type\":\"link\"," +
		"\"slotId\":\"nav_cs_5\",\"contentId\":\"nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45\",\"href\":\"/gp/new-releases/?ref_=nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":58,\"pageFirstPaintToElementViewed\":15202,\"timestamp\":\"2021-06-03T08:00:16.223Z\",\"messageId\":\"6q5q5s-6z957l-nu7ew-drr1p3\",\"application\":\"Retail:Prod:www.amazon.in\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"go1aqz-eemzz0-74z6xf-hujw31\",\"type\":\"link\",\"slotId\":\"nav_cs_6\",\"contentId\":\"nav_cs_help_79404a52982a4d9d973cf256c713999e\",\"href\":\"/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help_79404a52982a4d9d973cf256c713999e\",\"class\":\"nav-a  " +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":58,\"pageFirstPaintToElementViewed\":15202,\"timestamp\":\"2021-06-03T08:00:16.223Z\",\"messageId\":\"ig5v4z-7r1e7j-r78bcm-kj5bhd\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\"},\"session\":{\"id\":\"" +
		"260-7871994-7522166\"},\"element\":{\"id\":\"gs8yly-g1xj7x-21k1z9-igjoy1\",\"type\":\"link\",\"slotId\":\"nav_cs_7\",\"contentId\":\"nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84\",\"href\":\"/gp/goldbox?ref_=nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":58,\"pageFirstPaintToElementViewed\":15202,\"timestamp\":\"2021-06-03T08:00:16.223Z\",\"messageId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"xrrr6l-cmgo56-w7745c-sw41b0\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"jj1ibc-n1gd3l-fid8e4-o24r52\",\"type\":\"link\",\"slotId\":\"nav_cs_8\",\"contentId\":\"nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f\",\"href\":\"/gp/sva/dashboard?ref_=" +
		"nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"producerId\":\"csa\",\"schemaId\":\"csa.PageEntity.1\",\"version\":2,\"attributes\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"meaningful\":\"interactive\",\"url\":\"https://www.amazon.in/\",\"server\":\"www.amazon.in\",\"path\":\"/\",\"referrer\":\"\",\"title\":\"Online Shopping site in India" +
		": Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\",\"transitionType\":\"hard\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\",\"pageTypeId\":\"desktop\"},\"timestamp\":\"2021-06-03T08:00:15.875Z\",\"messageId\":\"2jqbit-xoix4g-6z5fis-ttszxm\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\"}},{\"data\":{\"navigation\":{\"type\":\"new-tab\",\"toTabId\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"toPageId\":\"k73g5z-ry4yg6-46dgee-1fxxk4\"," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"transitTime\":null},\"schemaId\":\"csa.TabbedBrowsing.2\",\"timestamp\":\"2021-06-03T08:00:16.168Z\",\"messageId\":\"ifzo81-yv8hg6-je1bzo-e3hvdi\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"renderedToMeaningful" +
		"\":906,\"renderedToViewed\":906,\"schemaId\":\"csa.PageView.4\",\"timestamp\":\"2021-06-03T08:00:16.171Z\",\"messageId\":\"23lli6-79384-u9urbp-qwjw84\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"meaningful\":\"interactive\",\"url\":\"https://www.amazon.in/\",\"server\":\"www.amazon.in\",\"path\":\"/\",\"referrer\":\"\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"title\":\"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\",\"transitionType\":\"hard\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\",\"pageTypeId\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"markers\":{\"bodyBegin\":19327},\"schemaId\":\"csa.ContentLatency.1\",\"timestamp\":\"2021-06-03T08:00:23.357Z\",\"messageId\":\"glmb9x-53pshb-afqp08-iug9p5\",\"application\":\"Retail:Prod:www.amazon.in\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"83rwrl-c5nrr9-pk0r3d-pnkp7u\",\"type\":\"widget\",\"slotId\":\"adplacements:Gateway:desktop-ad-center-1:desktop\",\"contentId\":\"e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"class\":\"copilot-secure-display " +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"celwidget  text/x-dacx-safeframe\",\"parentId\":\"6deamr-8m0a6o-onqm3h-tpfzh7\"}}}},{\"data\":{\"schemaId\":\"csa.Metric.3\",\"metrics\":{\"documentCumulativeLayoutShift\":0.02256176576257472},\"dimensions\":{},\"timestamp\":\"2021-06-03T08:00:24.215Z\",\"messageId\":\"s8zgfu-b5pd7h-t5jn0p-t59969\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"schemaId\":\"csa.ContentInteraction.1\",\"interaction\":\"click\",\"interactionData\":{\"interactionX\":\"328\",\"interactionY\":\"83\",\"parentChain\":\"HTML/BODY/DIV/HEADER/DIV/DIV/DIV/DIV/DIV/A\",\"href\":\"https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\"},\"messageId\":\"ze4iw-ndlush-qlvxk5-w7i4xo\"," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"attribution\":\"//*[@id='nav-xshop']/A[4]\",\"timestamp\":\"2021-06-03T08:00:35.184Z\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"6kzlzv-4t6c81-kqv5aw-57wz8v\",\"type\":\"link\",\"slotId\":\"nav_cs_3\",\"" +
		"contentId\":\"nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"href\":\"/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":42,\"pageFirstPaintToElementViewed\":15186,\"timestamp\":\"2021-06-03T08:00:16.207Z\",\"messageId\":\"t727b9-cqm8v5-hkuv3q-devpdz\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"n7i8nd-85mgnk-ke8owg-kyocam\",\"class\":\"nav-sprite-v1 celwidget nav-bluebeacon nav-a11y-t1 bold-focus-hover layout2 nav-flex layout3 layout3-alt nav-packard-glow hamburger nav-progressive-attribute\",\"slotId\":\"" +
		"Navigation-desktop-navbar\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":42,\"pageFirstPaintToElementViewed\":15186,\"timestamp\":\"2021-06-03T08:00:16.207Z\",\"messageId\":\"948yao-cqkf45-nl3esy-ob3yci\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"q5kg1z-cjccc1-ib8db8-fo0zaj\",\"class\":\"csm-placement-id-06725049-ee20-4289-9482-4d2b5eeeda38 desktop-gateway-atf_6e62dc40-d5f9-461c-81de-5be0390a5389 celwidget pd_rd_wg-GWxb3 pd_rd_w-8vcry pd_rd_r-b16bca62-74b1-42ca-828f-720200c1885c\",\"slotId\":\"desktop-hero-order\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":42,\"pageFirstPaintToElementViewed\":15186,\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"timestamp\":\"2021-06-03T08:00:16.207Z\",\"messageId\":\"q1oou8-5yb70g-n29vzt-ekqoyt\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"da23px-ui7egm-tc2ziu-b0j5q1\",\"class\":\"gw-ftGr-desktop-hero " +
		"gw-critical-content celwidget csm-placement-id-bebdfdb6-133f-4a3c-914c-d4378adec166\",\"slotId\":\"gw-ftGr-desktop-tall-hero-D\",\"type\":\"widget\",\"parentId\":\"q5kg1z-cjccc1-ib8db8-fo0zaj\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":43,\"pageFirstPaintToElementViewed\":15187,\"timestamp\":\"2021-06-03T08:00:16.208Z\",\"messageId\":\"gkjm87-7izdpm-gk913f-qxqu82\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"mpmb7j-fxhnv4-tkzith-mff4zr\",\"class\":\"gw-col csm-placement-id-c1a80c12-9881-4275-927e-85769c03ed07 desktop-gateway-atf_342ce7bc-e89c-43a7-b222-dd61e072ff09 celwidget pd_rd_wg-GWxb3 pd_rd_w-JHQl1 pd_rd_r-b16bca62-74b1-42ca-828f-720200c1885c\",\"slotId\":\"" +
		"desktop-grid-1\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1043,\"pageFirstPaintToElementImpressed\":16187,\"timestamp\":\"2021-06-03T08:00:17.208Z\",\"messageId\":\"7vnoms-ksmr9s-e34it5-a9ig5i\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"n7i8nd-85mgnk-ke8owg-kyocam\",\"class\":\"nav-sprite-v1 celwidget nav-bluebeacon nav-a11y-t1 bold-focus-hover layout2 nav-flex layout3 layout3-alt nav-packard-glow hamburger nav-progressive-attribute\",\"slotId\":\"Navigation-desktop-navbar\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1043,\"pageFirstPaintToElementImpressed\":16187,\"timestamp\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"2021-06-03T08:00:17.208Z\",\"messageId\":\"xu3w2p-l79hwc-cy2mdl-mqe8vc\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"q5kg1z-cjccc1-ib8db8-fo0zaj\",\"class\":\"" +
		"csm-placement-id-06725049-ee20-4289-9482-4d2b5eeeda38 desktop-gateway-atf_6e62dc40-d5f9-461c-81de-5be0390a5389 celwidget pd_rd_wg-GWxb3 pd_rd_w-8vcry pd_rd_r-b16bca62-74b1-42ca-828f-720200c1885c\",\"slotId\":\"desktop-hero-order\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1043,\"pageFirstPaintToElementImpressed\":16187,\"timestamp\":\"2021-06-03T08:00:17.208Z\",\"messageId\":\"snjo3z-2csebo-52rg91-ugrwgf\",\"application\":\"Retail:Prod" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"da23px-ui7egm-tc2ziu-b0j5q1\",\"class\":\"gw-ftGr-desktop-hero gw-critical-content celwidget csm-placement-id-bebdfdb6-133f-4a3c-914c-d4378adec166\",\"slotId\":\"gw-ftGr-desktop-tall-hero-D\"," +
		"\"type\":\"widget\",\"parentId\":\"q5kg1z-cjccc1-ib8db8-fo0zaj\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1044,\"pageFirstPaintToElementImpressed\":16188,\"timestamp\":\"2021-06-03T08:00:17.209Z\",\"messageId\":\"abbf79-zifsz3-v7vmp8-jv99qp\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"mpmb7j-fxhnv4-tkzith-mff4zr\",\"class\":\"gw-col csm-placement-id-c1a80c12-9881-4275-927e-85769c03ed07 desktop-gateway-atf_342ce7bc-e89c-43a7-b222-dd61e072ff09 celwidget pd_rd_wg-GWxb3 pd_rd_w-JHQl1 pd_rd_r-b16bca62-74b1-42ca-828f-720200c1885c\",\"slotId\":\"desktop-grid-1\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1044,\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"pageFirstPaintToElementImpressed\":16188,\"timestamp\":\"2021-06-03T08:00:17.209Z\",\"messageId\":\"kq0u86-ochkr0-smb7j-thwepv\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"44ez49-28s72z-bhnlwi-8ukkfx\",\"" +
		"class\":\"gw-col csm-placement-id-1996f603-1a83-4e8a-b594-9d2d1fd66987 desktop-gateway-atf_e6fc9e24-d689-44ae-ae61-491c97348ee8 celwidget pd_rd_wg-GWxb3 pd_rd_w-2N3xK pd_rd_r-b16bca62-74b1-42ca-828f-720200c1885c\",\"slotId\":\"desktop-grid-2\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1044,\"pageFirstPaintToElementImpressed\":16188,\"timestamp\":\"2021-06-03T08:00:17.209Z\",\"messageId\":\"dnk8c-2ybi9o-77sdgl-wmml9x\",\"application\":\"Retail" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"kflukj-tomsg6-uxy89z-6ji9ju\",\"class\":\"gw-col csm-placement-id-9f4de424-d9ab-4963-9919-04afbc744634 desktop-gateway-atf_2e594f0d-f588-4d98-a30b-e70ac31d7acf celwidget pd_rd_wg-GWxb3 " +
		"pd_rd_w-0HIA6 pd_rd_r-b16bca62-74b1-42ca-828f-720200c1885c\",\"slotId\":\"desktop-grid-3\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1044,\"pageFirstPaintToElementImpressed\":16188,\"timestamp\":\"2021-06-03T08:00:17.209Z\",\"messageId\":\"jxggc1-vt06f3-cting8-1fi3ed\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\"," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"g9jypm-18pu1g-p3oi7s-4drwkj\",\"class\":\"gw-row csm-placement-id-6d0dbd88-a256-4684-81a8-e1f9ad39e674 desktop-gateway-atf_539fbf69-d5ff-4252-ae81-8db7d87b0562 celwidget pd_rd_wg-GWxb3 pd_rd_w-yuAUP pd_rd_r-b16bca62-74b1-42ca-828f-720200c1885c\",\"slotId\":\"desktop-grid-1-D1\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"csa.ContentImpressed.2\",\"timeToImpressed\":1044,\"pageFirstPaintToElementImpressed\":16188,\"timestamp\":\"2021-06-03T08:00:17.209Z\",\"messageId\":\"n6h81e-q1wnx4-ezhz02-z4o370\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"" +
		"element\":{\"id\":\"ttjxxe-yshut1-g9zv4-mkj25g\",\"class\":\"gw-row csm-placement-id-6bde3fcc-f5a1-4e18-8374-1540acf84859 desktop-gateway-atf_640ba273-94d1-448d-81e7-72f8eb2e3222 celwidget pd_rd_wg-GWxb3 pd_rd_w-NeX5P pd_rd_r-b16bca62-74b1-42ca-828f-720200c1885c\",\"slotId\":\"desktop-grid-1-D2\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1044,\"pageFirstPaintToElementImpressed\":16188,\"timestamp\":\"2021-06-03T08:00:17.209Z\",\"messageId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"u196x4-83z9i8-hdyc-t0hw5w\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"qf6yox-foxy8h-537bx0-a6pmvy\",\"type\":\"widget\",\"slotId\":\"adplacements:Gateway:right-2:desktop\",\"contentId\":\"" +
		"589e332a-17d0-4382-b320-05e6f4ddc521\",\"class\":\"copilot-secure-display celwidget  text/x-dacx-safeframe\",\"parentId\":\"ttjxxe-yshut1-g9zv4-mkj25g\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1058,\"pageFirstPaintToElementImpressed\":16202,\"timestamp\":\"2021-06-03T08:00:17.223Z\",\"messageId\":\"mqpor0-5f4aqd-njq23w-5m2ox4\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"83108m-3iasvh-hptkym-tite8d\",\"type\":\"link\",\"slotId\":\"nav-link-accountList\",\"contentId\":\"nav_ya_signin\",\"href\":\"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=" +
		"http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\",\"class\":\"nav-a nav-a-2   nav-progressive-attribute\",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1058,\"pageFirstPaintToElementImpressed\":16202,\"timestamp\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"2021-06-03T08:00:17.223Z\",\"messageId\":\"azoenk-laklq9-bijamd-i4o6rs\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"7w5yzi-ldb2ma-kb7h9s-adnoea\",\"type\":\"widget\",\"slotId\":\"HamburgerMenuDesktop\",\"" +
		"interactionEvents\":\"click\",\"href\":\"javascript: void(0)\",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1058,\"pageFirstPaintToElementImpressed\":16202,\"timestamp\":\"2021-06-03T08:00:17.223Z\",\"messageId\":\"vdf6lx-5itcca-925uzi-5nfarz\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"ky466n-p9jlat-35cx57-ouiynh\",\"type\":\"link\",\"slotId\":\"nav_cs_0\",\"contentId\":\"nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98\",\"href\":\"/gp/bestsellers/?ref_=nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"csa.ContentImpressed.2\",\"timeToImpressed\":1058,\"pageFirstPaintToElementImpressed\":16202,\"timestamp\":\"2021-06-03T08:00:17.223Z\",\"messageId\":\"ny1ooq-s14m2b-odqtyw-7ajp75\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"" +
		"element\":{\"id\":\"dddf47-7wx622-j1uaep-ci1wyd\",\"type\":\"link\",\"slotId\":\"nav_cs_1\",\"contentId\":\"nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7\",\"href\":\"/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1058,\"pageFirstPaintToElementImpressed\":16202,\"timestamp\":\"2021-06-03T08:00:17.223Z\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"messageId\":\"bv2xwz-fz650v-o29nrf-28hnht\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"qq504r-z4v4h3-e0ca56-bifrxy\",\"type\":\"link\",\"slotId\":\"nav-link-prime\",\"contentId\":\"" +
		"nav_cs_primelink_nonmember_2860122b63884a8688052dc445e46bd9\",\"href\":\"/prime?ref_=nav_cs_primelink_nonmember_2860122b63884a8688052dc445e46bd9\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1058,\"pageFirstPaintToElementImpressed\":16202,\"timestamp\":\"2021-06-03T08:00:17.223Z\",\"messageId\":\"k6o7xn-g53lkn-sesc0n-ujnotg\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"6kzlzv-4t6c81-kqv5aw-57wz8v\",\"type\":\"link\",\"slotId\":\"nav_cs_3\",\"contentId\":\"nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"href\":\"/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"" +
		"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1058,\"pageFirstPaintToElementImpressed\":16202,\"timestamp\":\"2021-06-03T08:00:17.223Z\",\"messageId\":\"grtevt-f6wka-6myzx2-eg45s6\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"z99ju9-6klhqj-b1q7q6-lgohyx\",\"type\":\"link\",\"slotId\":\"nav_cs_4\",\"contentId\":\"nav_cs_electronics_c5b70a82461a484189e700166599ce9f\",\"href\":\"/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics_c5b70a82461a484189e700166599ce9f\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"timeToImpressed\":1058,\"pageFirstPaintToElementImpressed\":16202,\"timestamp\":\"2021-06-03T08:00:17.223Z\",\"messageId\":\"kju6s3-mg071f-f33wdk-ep3a1y\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"" +
		"upvnyg-ok15o8-ngzepo-h1oxgk\",\"type\":\"link\",\"slotId\":\"nav_cs_5\",\"contentId\":\"nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45\",\"href\":\"/gp/new-releases/?ref_=nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1058,\"pageFirstPaintToElementImpressed\":16202,\"timestamp\":\"2021-06-03T08:00:17.223Z\",\"messageId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"5k1wdr-dju49u-8ma3jt-yvgjae\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"go1aqz-eemzz0-74z6xf-hujw31\",\"type\":\"link\",\"slotId\":\"nav_cs_6\",\"contentId\":\"nav_cs_help_79404a52982a4d9d973cf256c713999e\"" +
		",\"href\":\"/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help_79404a52982a4d9d973cf256c713999e\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1058,\"pageFirstPaintToElementImpressed\":16202,\"timestamp\":\"2021-06-03T08:00:17.223Z\",\"messageId\":\"yex3jw-jo3u5t-wf4vbx-i8t53r\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"gs8yly-g1xj7x-21k1z9-igjoy1\",\"type\":\"link\",\"slotId\":\"nav_cs_7\",\"contentId\":\"nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84\",\"href\":\"/gp/goldbox?ref_=nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1058,\"pageFirstPaintToElementImpressed\":16202,\"timestamp\":\"2021-06-03T08:00:17.223Z\",\"messageId\":\"8pdtwt-s8r8g8-exqogx-bqzg8k\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":\"260-7871994-7522166\"},\"element\":{\"id\":\"jj1ibc-n1gd3l-fid8e4-o24r52\",\"type\":\"link\",\"slotId\":\"nav_cs_8\",\"contentId\":\"nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f\",\"href\":\"/gp/sva/dashboard?ref_=nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f\",\"class\":\"nav-a  \",\"parentId\":\"n7i8nd-85mgnk-ke8owg-kyocam\"}}}},{\"data\":{\"schemaId\":\"csa.Metric.3\",\"metrics\":{\"baselineMetricEvent\":1},\"dimensions\":{},\"timestamp\":\"2021-06-03T08:00:18.883Z\",\"messageId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"akhe9f-r9xa71-2ypxeq-6ye1wb\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"markers\":{\"viewablelatency:bodyBegin\":15202,\"bodyBegin\":15202},\"schemaId\":\"csa.ContentLatency.1\",\"timestamp\":\"2021-06-03T08:00" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":19.224Z\",\"messageId\":\"4usmpx-vsf9bp-8wim4p-45ln48\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"qf6yox-foxy8h-537bx0-a6pmvy\",\"type\":\"widget\",\"slotId\":\"adplacements:Gateway:right-2:desktop\",\"" +
		"contentId\":\"589e332a-17d0-4382-b320-05e6f4ddc521\",\"class\":\"copilot-secure-display celwidget  text/x-dacx-safeframe\",\"parentId\":\"ttjxxe-yshut1-g9zv4-mkj25g\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":43,\"pageFirstPaintToElementViewed\":15187,\"timestamp\":\"2021-06-03T08:00:16.208Z\",\"messageId\":\"4948qt-hua3yb-77ofh0-exfga0\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"44ez49-28s72z-bhnlwi-8ukkfx\",\"class\":\"gw-col csm-placement-id-1996f603-1a83-4e8a-b594-9d2d1fd66987 desktop-gateway-atf_e6fc9e24-d689-44ae-ae61-491c97348ee8 celwidget pd_rd_wg-GWxb3 pd_rd_w-2N3xK pd_rd_r-b16bca62-74b1-42ca-828f-720200c1885c\",\"slotId\":\"desktop-grid-2\",\"type\":\"widget\"}}}}" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		",{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":43,\"pageFirstPaintToElementViewed\":15187,\"timestamp\":\"2021-06-03T08:00:16.208Z\",\"messageId\":\"j07v0y-18d5gr-efpyqh-97ey8v\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"" +
		"260-7871994-7522166\"},\"element\":{\"id\":\"kflukj-tomsg6-uxy89z-6ji9ju\",\"class\":\"gw-col csm-placement-id-9f4de424-d9ab-4963-9919-04afbc744634 desktop-gateway-atf_2e594f0d-f588-4d98-a30b-e70ac31d7acf celwidget pd_rd_wg-GWxb3 pd_rd_w-0HIA6 pd_rd_r-b16bca62-74b1-42ca-828f-720200c1885c\",\"slotId\":\"desktop-grid-3\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":43,\"pageFirstPaintToElementViewed\":15187,\"timestamp\":\"2021-06-03T08:00:16.208Z\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"messageId\":\"pz1bbn-5pb4ya-432w7l-u0t33h\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"g9jypm-18pu1g-p3oi7s-4drwkj\",\"class\":\"gw-row csm-placement-id-6d0dbd88-a256-4684-81a8-e1f9ad39e674 " +
		"desktop-gateway-atf_539fbf69-d5ff-4252-ae81-8db7d87b0562 celwidget pd_rd_wg-GWxb3 pd_rd_w-yuAUP pd_rd_r-b16bca62-74b1-42ca-828f-720200c1885c\",\"slotId\":\"desktop-grid-1-D1\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":43,\"pageFirstPaintToElementViewed\":15187,\"timestamp\":\"2021-06-03T08:00:16.208Z\",\"messageId\":\"wr0mqw-7xybjo-7vof0y-gm35or\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"ttjxxe-yshut1-g9zv4-mkj25g\",\"class\":\"gw-row csm-placement-id-6bde3fcc-f5a1-4e18-8374-1540acf84859 desktop-gateway-atf_640ba273-94d1-448d-81e7-72f8eb2e3222 celwidget pd_rd_wg-GWxb3 pd_rd_w-NeX5P pd_rd_r-b16bca62-74b1-42ca-828f-720200c1885c\",\"slotId\":\"" +
		"desktop-grid-1-D2\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":43,\"pageFirstPaintToElementViewed\":15187,\"timestamp\":\"2021-06-03T08:00:16.208Z\",\"messageId\":\"pozcax-pgwe4m-86a7ue-qkcfkd\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"qf6yox-foxy8h-537bx0-a6pmvy\",\"type\":\"widget\",\"slotId\":\"adplacements:Gateway:right-2:desktop\",\"contentId\":\"589e332a-17d0-4382-b320-05e6f4ddc521\",\"class\":\"copilot-secure-display celwidget  text/x-dacx-safeframe\",\"parentId\":\"ttjxxe-yshut1-g9zv4-mkj25g\"}}}},{\"data\":{\"markers\":{\"clickToATF\":28648},\"schemaId\":\"csa.ContentLatency.1\",\"timestamp\":\"2021-06-03T08:00:35.217Z\",\"messageId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"6rlyyy-5xxm05-1hvk7f-r5a5u8\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"qf6yox-foxy8h-537bx0-a6pmvy\",\"type\":\"widget\",\"slotId\":\"adplacements:Gateway:right-2:desktop\",\"contentId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"589e332a-17d0-4382-b320-05e6f4ddc521\",\"class\":\"copilot-secure-display celwidget  text/x-dacx-safeframe\",\"parentId\":\"ttjxxe-yshut1-g9zv4-mkj25g\"}}}},{\"data\":{\"markers\":{\"clickToATF\":28651,\"criticalFeature\":28770,\"bodyEnd\":29073},\"schemaId\":\"csa.ContentLatency.1\",\"timestamp\":\"2021-06-03T08:00:35.217Z\",\"messageId\":\"q5cdqk-s7iz06-itmprk-9b3s33\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"83rwrl-c5nrr9-pk0r3d-pnkp7u\",\"type\":\"widget\",\"slotId\":\"adplacements:Gateway:desktop-ad-center-1:desktop\",\"contentId\":\"e44985f6-46f4-4231-90aa-f5c16f7c50aa\",\"class\":\"copilot-secure-display celwidget  text/x-dacx-safeframe\",\"parentId\":\"6deamr-8m0a6o-onqm3h-tpfzh7\"}}}},{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"data\":{\"schemaId\":\"csa.Metric.3\",\"metrics\":{\"documentCumulativeLayoutShiftToFirstInput\":0.02256176576257472},\"dimensions\":{},\"timestamp\":\"2021-06-03T08:00:35.217Z\",\"messageId\":\"s1t53i-vyrypa-jsg59e-ftk36k\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"requestId\":\"EE9C4QZH64TKGS28S5QH\",\"pageType\":\"Gateway\",\"subPageType\":\"desktop\"},\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"session\":{\"id\":\"260-7871994-7522166\"}}}}]}", 
		EXTRARES, 
		"Url=https://dns.google/dns-query?dns=AAABAAABAAAAAAABDmNsaWVudHNlcnZpY2VzCmdvb2dsZWFwaXMDY29tAAABAAEAACkQAAAAAAAARgAMAEIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Referer=", ENDITEM, 
		"Url=https://dns.google/dns-query?dns=AAABAAABAAAAAAABDmNsaWVudHNlcnZpY2VzCmdvb2dsZWFwaXMDY29tAAAcAAEAACkQAAAAAAAARgAMAEIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Referer=", ENDITEM, 
		"Url=https://dns.google/dns-query?dns=AAABAAABAAAAAAABBnVwZGF0ZQpnb29nbGVhcGlzA2NvbQAAAQABAAApEAAAAAAAAE4ADABKAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Referer=", ENDITEM, 
		"Url=https://dns.google/dns-query?dns=AAABAAABAAAAAAABBnVwZGF0ZQpnb29nbGVhcGlzA2NvbQAAHAABAAApEAAAAAAAAE4ADABKAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Referer=", ENDITEM, 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.revert_auto_header("Accept");

	_webresult = lrapi.web.revert_auto_header("Accept-Language");

	_webresult = lrapi.web.revert_auto_header("sec-ch-ua");

	_webresult = lrapi.web.revert_auto_header("sec-ch-ua-mobile");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"none");

	_webresult = lrapi.web.add_header("X-Chrome-UMA-Log-HMAC-SHA256", 
		"If4ReBjOeCh1JKK0Y3699c7QVS3mGeyj7+omPrTdM1k=");

	_webresult = lrapi.web.add_header("X-Chrome-UMA-Log-SHA1", 
		"D7DF160D9E2F4C810D54AF944016384A90DF72A3");

	_webresult = lrapi.web.add_header("X-Chrome-UMA-ReportingInfo", 
		"CAE=");

	_webresult = lrapi.web.add_header("content-encoding", 
		"gzip");

	_webresult = lrapi.web.custom_request("v2", 
		"URL=https://clientservices.googleapis.com/uma/v2", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=text/plain", 
		"Referer=", 
		"Snapshot=t27.inf", 
		"ContentEncoding=gzip", 
		"Mode=HTML", 
		"EncType=application/vnd.chrome.uma", 
		"BodyBinary=\t\\xD9\\xD5yx\\\\~i~\\x10\\x95\\x06\\x1A\\xAF\\x16\\x08\\xF2\\xCC\\xAA\\x85\\x06\\x12\\x0F91.0.4472.77-64\\x18\\x80\\xCE\\x9D\\xE4\\x05\"\\x05en-US*\\x18\n\nWindows NT\\x12\n10.0.190422\\xDE\\x01\n\\x06x86_64\\x10\\xDA}\\x18\\x80\\x80\\xF8\\xD1\\xF7\\xFF\\x1F\"\\x00(\\x010\\xD6\n8\\x80\\x06B\\x84\\x01\\x08\\x86\\x81\\x02\\x10\\x962\\x1A\\x0E26.20.100.81422\\x13Google Inc. (Intel):VANGLE (Intel, Intel(R) HD Graphics 520 Direct3D11 vs_5_0 ps_5_0, D3D11-26.20.100.8142)" +
		"M'\\xB9\\xC9BU\\xAC%\\xCABe\\x00\\x00\\x80?j\\x16\n\\x0CGenuineIntel\\x10\\xE3\\x8D\\x10\\x18\\x04 \\x00\\x82\\x01\\x02\\x08\\x01\\x8A\\x01\\x02\\x08\\x01\\xAA\\x01\\x06x86_64:;\n\\x11Chrome PDF Viewer\\x12 mhjfbmdgcfjbbpaeojofohoefgiehjai\\x1A\\x00 \\x00(\\x00:+\n\rNative Client\\x12\\x14internal-nacl-plugin\\x1A\\x00 \\x00(\\x01:.\n\\x11Chrome PDF Plugin\\x12\\x13internal-pdf-viewer\\x1A\\x00 \\x00(\\x01B\\x00J\n\r]s\\x81\\xAF\\x15\\xBD\\xE7\\x19TJ\n\r[\\x07\\xA7\\x90\\x15\\x80\\x8D}\\xCAJ\n\r" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\\x87Q\\xF7\\xB0\\x15Z\\xE5{7J\n\r\\xF3\\xB2\\xA5\\x1F\\x15\\x80\\x8D}\\xCAJ\n\r\\x12\\xF4\\xB6Y\\x15\\x80\\x8D}\\xCAJ\n\rR\\xB3\\xD4`\\x15\\x01\\xB7\\xFC\\x00J\n\r\\x8C\\x1EV\\xD7\\x15\\x80\\x8D}\\xCAJ\n\r\\xC4\\x9E$\\xB3\\x15\\xDF\\x17J?J\n\r<Q\\xEF\\xA9\\x15\\x80\\x8D}\\xCAJ\n\rb\\xE9\\xB5l\\x15\\x80\\x8D}\\xCAJ\n\rY\\xD0\\xA8?\\x15Z\\xE5{7J\n\r\\xBF$\\xE4\\x8A\\x15\\xA5\\x06\\xF4CJ\n\rR\\xD9\\x16\\x88\\x15Z\\xE5{7J\n\r\\x95\\xAA\\x950\\x15\\xDF\\x17J?J\n\r1\\xEC\\x7F\\xC2\\x15/QtjJ\n\rS\\xC6;," +
		"\\x15\\x80\\x8D}\\xCAJ\n\r1\\xC88v\\x15\\xA2\\xE6\\xED\\x12J\n\r]\\x88\\xB98\\x15|Y\\x00JJ\n\r\\xA9\\x8E\\xB5\\xED\\x15\\x80\\x8D}\\xCAJ\n\ri\\x94b\\xA2\\x15\\x80\\x8D}\\xCAJ\n\r\\x12\\xCB\\xB1\\xDE\\x15\\x01v\\x88zJ\n\r\\xB5j}\\xD9\\x15Ye\\xDD\\xD8J\n\rR\\xB0Az\\x15\\xBF\\x9E\\xB4jJ\n\r\\xDE\\xABD\\x8E\\x15Z\\xE5{7J\n\rP\\xF3\\xB5G\\x15Z\\xE5{7J\n\rzi\\x83\\x8F\\x15\\x85\\x0E\\xE7\\x00J\n\r\\x1F\\xB6,\\x0F\\x15\\xC7\\x92\\xDCnJ\n\r\\xAE\\xB3+\\xDC\\x15Z\\xE5{7J\n\r" +
		"L8\\xFD\\xA2\\x15\\xAA\\x03\\x0C\\\\J\n\r\\xCD\\xA7\n\\xF9\\x15\\x80\\x8D}\\xCAJ\n\r\\xDA\\xF2\\xBA\\xA6\\x154r\\xE5\\xCEJ\n\r\\x1A\\x14r\\xC5\\x15\\x80\\x8D}\\xCAJ\n\r\\xFE)@\\xBF\\x15\\x80\\x8D}\\xCAJ\n\rp\\xEA\\xC8\\xF6\\x15\\x80\\x8D}\\xCAJ\n\r\\x06\\x08We\\x15\\xF1\\x07\\xBElJ\n\r~\\xD6\\xD8\r\\x15\\x80\\x8D}\\xCAJ\n\r\\x8Ai\\xFF,\\x15e\\xB9\\xD8bJ\n\r\\xB8\\xA1\\x82\\xA5\\x15\\x17\\xCEu\\xADJ\n\r1\\x85-\\xDA\\x15\\x80\\x8D}\\xCAJ\n\r-h;\\x8E\\x15\\x80\\x8D}\\xCAJ\n\r" +
		"\\x8Cb\\xB6\\xB9\\x15\\x80\\x8D}\\xCAJ\n\r\\xB5k`\\x1D\\x15\\x80\\x8D}\\xCAJ\n\r\\xB1\\xAA\\x9F\\xD8\\x15\\x80\\x8D}\\xCAJ\n\rK\\xADB0\\x15\\x80\\x8D}\\xCAJ\n\r\\xE9W\\xA3\\xE4\\x15\\x80\\x8D}\\xCAJ\n\rM\\xDF\\xDAS\\x15\\x80\\x8D}\\xCAJ\n\ru5u.\\x15\\x80\\x8D}\\xCAJ\n\r\\x83\\xDEbb\\x15\\x80\\x8D}\\xCAJ\n\r\\xDA\\xAD\\xB7\\x07\\x15\\x80\\x8D}\\xCAJ\n\r\\x82\\x12\\xA1\\x83\\x15\\x95R\\x0C\\xCDJ\n\r8>\\xA5\\x05\\x15\\x80\\x8D}\\xCAJ\n\ro\\x1B\\xA8.\\x15\\x80\\x8D}\\xCAJ\n\r" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\\xBF\\xB7\\x14\\x99\\x15\\x80\\x8D}\\xCAJ\n\rm#:^\\x15\\xD0\\x86\\xE2YJ\n\rl\\xE5\\x9D\\xE7\\x15\\x80\\x8D}\\xCAJ\n\r\\xDEdz5\\x15\\x80\\x8D}\\xCAJ\n\r\\xF1u\\\\\\x9E\\x15^\\xB4@{J\n\r\\xD7>\\xFE\\x9B\\x15\\x80\\x8D}\\xCAJ\n\r\\x82$i\\xD8\\x15\\xFFj\\xC4\\x82J\n\rq\\xB5 \\xA1\\x15\\x9F\\x8Dq\\xF2J\n\r\\x9F\\x1E\\x91z\\x15\\x80\\x8D}\\xCAJ\n\r\\xA8\\xFE]%\\x15\\xA2\\xE6\\xED\\x12J\n\r\\x14\\x96\\xEC}\\x15Z\\xE5{7J\n\rS)Z\\xCA\\x15\\xA2\\xE6\\xED\\x12J\n\r\\xB7\\xD2cH\\x15\\x80\\x8D}\\xCAJ\n\r" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\\x87p\\x03j\\x15\\x80\\x8D}\\xCAJ\n\r\\x8Ed@\\xAB\\x15\\x80\\x8D}\\xCAJ\n\rq\\xAA\\x874\\x15\\x80\\x8D}\\xCAJ\n\r`g6\\x12\\x15Z\\xE5{7J\n\r+\\x7F\\x94\\xF8\\x15Z\\xE5{7J\n\r\\xDFG\\xE2_\\x15\\x80\\x8D}\\xCAJ\n\rn\\x90F\\xAD\\x15\\x80\\x8D}\\xCAJ\n\r\\xBDoV\\xD3\\x15\\xA2\\xE6\\xED\\x12J\n\r\\xF41\\x98\\xCB\\x15Z\\xE5{7J\n\r\\xA6\\x03\\xA3N\\x15\\xDF\\x17J?J\n\r6\\xEE\\x8A\\xF4\\x15Z\\xE5{7J\n\r\\xA5m\\xA4z\\x15P\\xB1F\\xC9J\n\rl\\x07\\xF4\\xD6\\x15\\x80\\x8D}\\xCAJ\n\r" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"l\\x9D\\x8F\\x8C\\x15\\x80\\x8D}\\xCAJ\n\r\\xF0\\xA9 \\xD5\\x15Z\\xE5{7J\n\rt8\\x06x\\x15dy\\x7F\\xA6J\n\r\\xD7dG\\xEF\\x15B\\xCC\\xB6/J\n\r\\xD4F\\xCF\\x7F\\x15\\x80\\x8D}\\xCAJ\n\r\rH\\x1B\\xF3\\x15\\x80\\x8D}\\xCAJ\n\rWU\\x9Dj\\x15Z\\xE5{7J\n\r\\xB2\\xB5`w\\x15\\xA2\\xE6\\xED\\x12J\n\r?_\\x16V\\x15\\x80\\x8D}\\xCAJ\n\r\\x85\\xDAT\\x13\\x15\\xA7\\x94\\x12xJ\n\rr_\\x1C\\x93\\x15HA90J\n\r`\\x87MI\\x15C]2RJ\n\r*\\xE8z\\xF4\\x15\\xE5.\\xF2\\x86J\n\rU\\x08\\xC6:\\x15\\x9C*nHJ\n\r" +
		"\\xA3\\xB6\\xDCc\\x15\\xA74\\x89\\xF0J\n\rF\\xE7\\x06\\xE7\\x155\\xD5\\xE5\\xFAJ\n\r\\x0C\\x19\\x96\\xF2\\x15\\x923.\\xB5J\n\r\\xE2\\xAABD\\x15\\x14\\x0F\\xCC\\xE1J\n\rd\\xCF\\x90\\xF6\\x15c(\\x82\\xA5J\n\rw\\xD3\\xD1\\x0E\\x15\\x14\\x0F\\xCC\\xE1J\n\r\\xA0\\xF0\\xF0u\\x15\\x14\\x0F\\xCC\\xE1J\n\r\\x81\\x84\\xB1\\xE2\\x15\\x06\\xFBduJ\n\r\\x89\\x18\\xE7\\xE7\\x15\\x14\\x0F\\xCC\\xE1J\n\r\\x96\\x846\\xE1\\x15\\x80\\x8D}\\xCAJ\n\r\\xF0&i\\xA4\\x15\\x80\\x8D}\\xCAJ\n\ru&" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\\xA9\\xDB\\x15\\xA2\\xE6\\xED\\x12J\n\r\\x13\\xAB\\xD8\\x16\\x15\\xA2\\xE6\\xED\\x12J\n\r\\xE0\\xC3\\x075\\x15`G\\x9C\\xCAJ\n\rD\\xAD{I\\x15\\x80\\x8D}\\xCAJ\n\rOIP\\xFB\\x15b\\xC0\\xCArJ\n\r\\x1Av~T\\x15\\xDF\\x17J?J\n\r\\xCAC\\xF8\\x89\\x15\\x80\\x8D}\\xCAJ\n\rH\\xBB1^\\x15f<QuJ\n\rW\\x94\\xB3\\xAB\\x15\\xFD\\x04\\x98\\x13J\n\r\\xF7\\xEA\\xDE\\xA9\\x15\\x8E_[\\xE3J\n\rp\\xB1a\\xA4\\x15\\x80\\x8D}\\xCAJ\n\rvw\\xF2\\xDE\\x15\\x80\\x8D}\\xCAJ\n\r\\xF9>?\\xB5\\x15\\x80\\x8D}" +
		"\\xCAP\\x04ZE\\x08\\x01\\x10\\x8E\\x8D\\xE2\\x85\\x06\\x18\\xD6\\xFB\\xE1\\x85\\x06\"\\x17\n\t1.3.36.82\\x10\\xD6\\xFB\\xE1\\x85\\x06\\x18\\x00 \\x00(\\x00*\\x1C\n\\x0C91.0.4472.77\\x10\\xD6\\xFB\\xE1\\x85\\x06\\x18\\x00 \\x1E(\\x81\\x80\\x0Cb\\x04CHBDj\\x0C\\x08\\x00\\x10\\x00\\x18\\x00 \\x058\\x06@\\x06\\x80\\x01\\xA0\\xC3\\xAA\\xF5\\x05\\x90\\x01\\x16\\x90\\x01=" +
		"\\x90\\x01\\x96\\x01\\x90\\x01\\xB3\\x01\\x90\\x01\\x80\\x02\\x90\\x01\\x95\\x02\\x90\\x01\\xB3\\x02\\x90\\x01\\x8B\\x03\\x90\\x01\\xBA\\x03\\x90\\x01\\xE9\\x03\\x90\\x01\\x91\\x04\\x90\\x01\\xE5\\x04\\x90\\x01\\xF6\\x04\\x90\\x01\\x97\\x05\\x90\\x01\\x89\\x06\\x90\\x01\\xA2\\x06\\x90\\x01\\xD9\\x06\\x90\\x01\\xDE\\x06\\x98\\x01\\x01\\xB0\\x01\\x01\\xBA\\x01\\x0C\\x15i\\x04u~%\\x00\\x00\\x00\\x00(\\x00\\xC2\\x01\\x0F\\x08\\x0B\\x12\\x069.27.0\\x1Dv\\xCF\\x02C\\xC2\\x01\n" +
		"\\x08\\x08\\x12\\x017\\x1D\\xC0^Q\\xFD\\xC2\\x01\\x13\\x08\\x0C\\x12\n90.262.200\\x1D\\x9A\\xCD\\xB7H\\xC2\\x01\r\\x08\n\\x12\\x046644\\x1D\nNs\\xE0\\xC2\\x01\\x15\\x08\\x06\\x12\\x0C0.57.44.2492\\x1D=\\xC9ko\\xC2\\x01\\x0B\\x08\\x02\\x12\\x0243\\x1D\\xD7\\xD2\\xD1\\xFF\\xC2\\x01\\x10\\x08\\x03\\x12\\x071.0.0.8\\x1D\\xED\\xBD1'\\xC2\\x01\\x0C\\x08\\x12\\x12\\x03282\\x1D'f\\x8FA\\xC2\\x01\\x14\\x08\r\\x12\\x0B4.10.2209.0\\x1D\\x00\\x00\\x00\\x00\\xC2\\x01\n" +
		"\\x08\\x1B\\x12\\x011\\x1D\\x15\\xA9\\x8AG\\xCA\\x01\\x1F\\x08\\x05\\x10\\x01\\x18\\x02 \\x00(\\x000\\x008\\x01@\\x01H\\x00P\\x00X\\x01`\\x00h\\x00x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x04\\x10\\x05\\x18\\x01 \\x00(\\x000\\x008\\x00@\\x00H\\x00P\\x00X\\x00`\\x00h\\x00x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x05\\x10\\x01\\x18\\x02 \\x00(\\x000\\x008\\x01@\\x01H\\x00P\\x00X\\x01`\\x00h\\x00x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x04\\x10\\x01\\x18\\x02 \\x00" +
		"(\\x000\\x008\\x01@\\x01H\\x00P\\x00X\\x01`\\x00h\\x00x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x04\\x10\\x01\\x18\\x02 \\x00(\\x000\\x008\\x01@\\x01H\\x00P\\x00X\\x01`\\x00h\\x00x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x05\\x10\\x01\\x18\\x02 \\x00(\\x000\\x008\\x01@\\x01H\\x00P\\x00X\\x01`\\x00h\\x00x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x06\\x10\\x05\\x18\\x02 \\x00(\\x000\\x008\\x00@\\x00H\\x00P\\x00X\\x00`\\x00h\\x02x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x01\\x10\\x06\\x18\\x02 " +
		"\\x00(\\x000\\x008\\x01@\\x01H\\x00P\\x00X\\x01`\\x00h\\x02x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x06\\x10\\x01\\x18\\x02 \\x00(\\x000\\x008\\x01@\\x01H\\x00P\\x00X\\x00`\\x00h\\x02x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x01\\x10\\x01\\x18\\x02 \\x01(\\x000\\x008\\x01@\\x01H\\x00P\\x00X\\x00`\\x00h\\x01x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x01\\x10\\x05\\x18\\x02 \\x00" +
		"(\\x000\\x008\\x00@\\x00H\\x00P\\x00X\\x00`\\x00h\\x02x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x01\\x10\\x01\\x18\\x02 \\x01(\\x000\\x008\\x01@\\x01H\\x00P\\x00X\\x00`\\x00h\\x01x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x01\\x10\\x05\\x18\\x02 \\x00(\\x000\\x008\\x00@\\x00H\\x00P\\x00X\\x00`\\x00h\\x00x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x01\\x10\\x05\\x18\\x02 \\x00(\\x000\\x008\\x00@\\x00H\\x00P\\x00X\\x00`\\x00h\\x02x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x01\\x10\\x05\\x18\\x02 " +
		"\\x00(\\x000\\x008\\x00@\\x00H\\x00P\\x00X\\x00`\\x00h\\x02x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x06\\x10\n\\x18\\x02 \\x00(\\x000\\x008\\x01@\\x01H\\x00P\\x00X\\x01`\\x00h\\x02x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x04\\x10\\x01\\x18\\x02 \\x00(\\x000\\x008\\x01@\\x01H\\x00P\\x00X\\x01`\\x00h\\x00x\\x00\\x80\\x01\\x00\\xCA\\x01\\x1F\\x08\\x01\\x10\n\\x18\\x02 \\x00" +
		"(\\x000\\x008\\x01@\\x01H\\x00P\\x00X\\x01`\\x00h\\x02x\\x00\\x80\\x01\\x00\\xE2\\x01\\x1620210603-044038.313895\\xF8\\x01\\xFE\\x02\\x80\\x02\\xFF\\xFF\\xFF\\xFF\\xFF\\xFF\\xFF\\xFF\\xFF\\x01\\x88\\x02\\x01\\xA8\\x02\\x87\\x162\\x0F\t\\x17\\xF9\\xCB\\xEA\\x16s\\xCD\\x8C\\x10d\\x1A\\x02\\x10e", 
		EXTRARES, 
		"Url=https://images-na.ssl-images-amazon.com/images/G/01/blank/1x1_b._V192262818_.gif", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-site");

	_webresult = lrapi.web.add_header("Accept", 
		"*/*");

	_webresult = lrapi.web.add_header("Accept-Language", 
		"en-US,en;q=0.9");

	_webresult = lrapi.web.add_header("Origin", 
		"https://www.amazon.in");

	_webresult = lrapi.web.add_header("sec-ch-ua", 
		"\" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"");

	_webresult = lrapi.web.add_header("sec-ch-ua-mobile", 
		"?0");

	_webresult = lrapi.web.custom_request("OE_4", 
		"URL=https://fls-eu.amazon.in/1/batch/1/OE/", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=text/plain", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t28.inf", 
		"Mode=HTML", 
		"EncType=text/plain;charset=UTF-8", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={\"rid\":\"AXERV8EH5V8NQ9CRG46P\",\"sid\":\"260-7871994-7522166\",\"mid\":\"A21TJRUUN4KGV\",\"sn\":\"www.amazon.in\",\"reqs\":[{\"csmcount\":{\"counter\":\"baselineCounter2\",\"value\":1,\"t\":5}},{\"csmcount\":{\"counter\":\"nexusBaselineCounter\",\"value\":1,\"t\":5}},{\"csmcount\":{\"counter\":\"CSMLibrarySize\",\"value\":9701,\"t\":5}},{\"csmcount\":{\"counter\":\"aui:hiResDesktop\",\"value\":0,\"t\":8604}},{\"csmcount\":{\"counter\":\"aui:pagejs:pkgExecTime\",\"value\":8.300000011920929," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"t\":8607}},{\"csmcount\":{\"counter\":\"aui:resource_count\",\"value\":1,\"t\":8630}},{\"csmcount\":{\"counter\":\"csm.cookieSize\",\"value\":492,\"t\":9125}},{\"csmcount\":{\"counter\":\"CSMLibrarySize\",\"value\":2729,\"t\":9131}},{\"csmcount\":{\"counter\":\"CSMLibrarySize\",\"value\":12306,\"t\":9177}},{\"csmcount\":{\"counter\":\"aui:resource_count\",\"value\":2,\"t\":9227}},{\"csmcount\":{\"counter\":\"aui:resource_count\",\"value\":3,\"t\":9228}},{\"csmcount\":{\"counter\":\"aui" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":resource_count\",\"value\":4,\"t\":9235}},{\"csmcount\":{\"counter\":\"sobe_horizontale_d_b_-display\",\"value\":1,\"t\":9681}},{\"csmcount\":{\"counter\":\"sobe_horizontale_d_b_-display\",\"value\":2,\"t\":9693}},{\"csmcount\":{\"counter\":\"sobe_horizontale_d_b_-display\",\"value\":3,\"t\":9696}},{\"csmcount\":{\"counter\":\"sobe_categ_d_b_-display\",\"value\":1,\"t\":9724}},{\"csmcount\":{\"counter\":\"sobe_categ_d_b_-display\",\"value\":2,\"t\":9753}},{\"csmcount\":{\"counter\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"sobe_categ_d_b_-display\",\"value\":3,\"t\":9758}},{\"csmcount\":{\"counter\":\"sobe_categ_d_b_-display\",\"value\":4,\"t\":9762}},{\"csmcount\":{\"counter\":\"sobe_quade_d_b_-display\",\"value\":1,\"t\":9764}},{\"csmcount\":{\"counter\":\"sobe_horizontale_d_b_-display\",\"value\":4,\"t\":9796}},{\"csmcount\":{\"counter\":\"sobe_categ_d_b_-display\",\"value\":5,\"t\":9825}},{\"csmcount\":{\"counter\":\"sobe_categ_d_b_-display\",\"value\":6,\"t\":9887}},{\"csmcount\":{\"counter\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"sobe_quade_d_b_-display\",\"value\":2,\"t\":9891}},{\"csmcount\":{\"counter\":\"sobe_categ_d_b_-display\",\"value\":7,\"t\":9895}},{\"csmcount\":{\"counter\":\"sobe_categ_d_b_-display\",\"value\":8,\"t\":9951}},{\"csmcount\":{\"counter\":\"sobe_categ_d_b_-display\",\"value\":9,\"t\":10004}},{\"csmcount\":{\"counter\":\"sobe_categ_d_b_-display\",\"value\":10,\"t\":10050}},{\"csmcount\":{\"counter\":\"totalImages\",\"value\":131,\"t\":10155}},{\"cel\":{\"k\":\"mrg\",\"n\":\"page module\",\"t\":14846" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"}},{\"cel\":{\"k\":\"pmd\",\"o\":\"https://www.amazon.in\",\"p\":\"/gp/browse.html\",\"t\":14846}},{\"cel\":{\"w\":1366,\"aw\":1366,\"h\":768,\"ah\":728,\"cd\":24,\"pd\":24,\"t\":14847,\"k\":\"sci\"}},{\"cel\":{\"w\":1349,\"h\":7014,\"t\":14847,\"k\":\"doi\"}},{\"cel\":{\"k\":\"mso\",\"n\":\"page module\",\"t\":14847}},{\"cel\":{\"k\":\"mrg\",\"n\":\"viewport module\",\"t\":14847}},{\"cel\":{\"w\":1366,\"h\":657,\"x\":0,\"y\":0,\"t\":14847,\"k\":\"vpi\"}},{\"cel\":{\"k\":\"mso\",\"n\":\"viewport " +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"module\",\"t\":14847}},{\"cel\":{\"k\":\"mrg\",\"n\":\"features module\",\"t\":14848}},{\"cel\":{\"k\":\"mso\",\"n\":\"features module\",\"t\":14848}},{\"cel\":{\"k\":\"mrg\",\"n\":\"mouse click module\",\"t\":14848}},{\"cel\":{\"k\":\"mso\",\"n\":\"mouse click module\",\"t\":14849}},{\"cel\":{\"k\":\"mrg\",\"n\":\"mouse move module\",\"t\":14849}},{\"cel\":{\"k\":\"mso\",\"n\":\"mouse move module\",\"t\":14849}},{\"csmcount\":{\"counter\":\"Event:csm.CSMBaselineEvent.4\",\"value\":1,\"t\":14850}}" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		",{\"csmcount\":{\"counter\":\"aui:resource_count\",\"value\":5,\"t\":14872}},{\"csmcount\":{\"counter\":\"CSMLibrarySize\",\"value\":54601,\"t\":14874}},{\"csm\":{\"k\":\"chk\",\"f\":1,\"l\":{\"csmcount\":32,\"cel\":14,\"csm\":1},\"s\":\"inln\"}}]}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"none");

	_webresult = lrapi.web.add_header("X-Goog-Update-AppId", 
		"ihnlcenocehgdaegdmhbidjhnhdchfmm,oimompecagnajdejgnnjijobebaeigek,hnimpnehoodheedghdeeijklkeaacbdc,gcmjkmgdlgnkkcocmoeiminaijmmjnii,cmahhnpholdijhjokonmfdjbfmklppij,lmelglejhemejginpboagddgdfbepgmp,obedbbhbpmojnkanicioggnmelmoomoc,kiabhabjdbkjdpjbpigfodbdjmbglcoo,giekcmmlnklenlaomppkphknjmnnpneh,khaoiebndkojlmppeemjhbpbandiljpe,hfnkpimlhhgieaddgfemjhofmfblmnib,dhlpobdgcjafebgbbhjdnapejmpkgiie,aemomkdncapdnfajjbbcbdebjljbpmpj,llkgjffcdpffmhiakmfcdcblohccpfmo,ehgidpndbllacpjalkiimkbadgjfnnmc," +
		"gkmgaooipdjhmangpemjhigmamcehddo,jflookgnkcckhobaglndicnbbgbonegd,ggkkehgbnfjpeggfpleeakpidbkibbmn,jamhcnnkihinmdlkakkaopbjbbcngflc,ojhpjlocmbogdgmfpkhlaaeamibhnphh,pdafiollngonhoadbmdoemagnfpdphbe,eeigpngbgcognadeebkilcpcaedhellh");

	_webresult = lrapi.web.add_header("X-Goog-Update-Interactivity", 
		"bg");

	_webresult = lrapi.web.add_header("X-Goog-Update-Updater", 
		"chrome-91.0.4472.77");

	_webresult = lrapi.web.custom_request("json", 
		"URL=https://update.googleapis.com/service/update2/json?cup2key=10:52730697&cup2hreq=5722aa1f00ba56999a0d8b89c83869372de0177d5a8db5c9fabc95fdcad34757", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t29.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={\"request\":{\"@os\":\"win\",\"@updater\":\"chrome\",\"acceptformat\":\"crx2,crx3\",\"app\":[{\"appid\":\"ihnlcenocehgdaegdmhbidjhnhdchfmm\",\"brand\":\"CHBD\",\"cohort\":\"1::\",\"enabled\":true,\"ping\":{\"ping_freshness\":\"{b220cb25-ec78-4279-b920-2a32211c3a54}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"0.0.0.0\"},{\"appid\":\"oimompecagnajdejgnnjijobebaeigek\",\"brand\":\"CHBD\",\"cohort\":\"1::\",\"enabled\":true,\"ping\":{\"ping_freshness\":\"{4f9629c1-721d-45b1-b0d4-be2e69bb9921" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"4.10.2209.0\"},{\"appid\":\"hnimpnehoodheedghdeeijklkeaacbdc\",\"brand\":\"CHBD\",\"cohort\":\"1::\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.6f6bc93dcd62dc251850d2ff458fda96083ceb7fbe8eeb11248b8485ef2aea23\"}]},\"ping\":{\"ping_freshness\":\"{c6401417-5c18-41b3-9625-b77d0c526bf2}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"0.57.44.2492\"},{\"appid\":\"gcmjkmgdlgnkkcocmoeiminaijmmjnii\",\"brand\":\"CHBD\",\"cohort\":\"1:bm1/zx9:" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\",\"cohorthint\":\"TenPercent_9_27\",\"cohortname\":\"TenPercent_9_27\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.4302cf764844fc6ca4cd4de8cf5e13481c4dd15b4bd8d667869f9ae2fb54f9bd\"}]},\"ping\":{\"ping_freshness\":\"{424878ad-e6b2-4674-98ea-687668f9532f}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"9.27.0\"},{\"appid\":\"cmahhnpholdijhjokonmfdjbfmklppij\",\"brand\":\"CHBD\",\"cohort\":\"1:wr3:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"package\":[{\"fp\":\"1.b4ddbdce4f8d5c080328aa34c19cb533f2eedec580b5d97dc14f74935e4756b7\"}]},\"ping\":{\"ping_freshness\":\"{70fdf2ad-4bf3-4fac-adc2-78406f960782}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"1.0.6\"},{\"appid\":\"lmelglejhemejginpboagddgdfbepgmp\",\"brand\":\"CHBD\",\"cohort\":\"1:lwl:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.418f6627139e37d2fe70c56c6c895b513c1428afc03e057e0616db650c689c74\"}]},\"ping\":{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"ping_freshness\":\"{d0554ba6-b4bc-44ac-9c05-f61519f02baa}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"282\"},{\"accept_locale\":\"ENUS\",\"appid\":\"obedbbhbpmojnkanicioggnmelmoomoc\",\"brand\":\"CHBD\",\"cohort\":\"1:s6f:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.916ec20f36b472ab481284705e00bd03e8e7d6c0cebb7c5a040c3e985c6da15c\"}]},\"ping\":{\"ping_freshness\":\"{304d6c3a-35d8-4de1-ab8c-0296348bca5e}\",\"rd\":5267},\"updatecheck" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\":{},\"version\":\"20210519.375355601\"},{\"appid\":\"kiabhabjdbkjdpjbpigfodbdjmbglcoo\",\"brand\":\"CHBD\",\"cohort\":\"1:v3l:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.4e0b9bdeebae75d67c83eabd03ae8884be7c632e8332615e53b153a90c379ce8\"}]},\"ping\":{\"ping_freshness\":\"{db436b21-db0f-49d6-94b7-ba0efb880064}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"2021.5.23.2\"},{\"appid\":\"giekcmmlnklenlaomppkphknjmnnpneh\",\"brand\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"CHBD\",\"cohort\":\"1:j5l:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.fd515ec0dc30d25a09641b8b83729234bc50f4511e35ce17d24fd996252eaace\"}]},\"ping\":{\"ping_freshness\":\"{9c90aac5-9f61-496a-a37d-ab556e0b3cb0}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"7\"},{\"appid\":\"khaoiebndkojlmppeemjhbpbandiljpe\",\"brand\":\"CHBD\",\"cohort\":\"1:cux:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"package\":[{\"fp\":\"1.ffd1d2d75a8183b0a1081bd03a7ce1d140fded7a9fb52cf3ae864cd4d408ceb4\"}]},\"ping\":{\"ping_freshness\":\"{764d8508-cce3-40d7-8722-843e104469af}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"43\"},{\"appid\":\"hfnkpimlhhgieaddgfemjhofmfblmnib\",\"brand\":\"CHBD\",\"cohort\":\"1:jcl:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.e0734e0ad0c7274e516c8bbf0dc0db8dae2200ab046229d77421fcd2d16ea80d\"}]},\"ping\":{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"ping_freshness\":\"{e0ffa1fa-274a-4af1-934f-21263e1e42a8}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"6644\"},{\"appid\":\"dhlpobdgcjafebgbbhjdnapejmpkgiie\",\"brand\":\"CHBD\",\"cohort\":\"1:z9x:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.308252f48758ca2d64b68306a87d022ab2be5aaa05afb9bbe554b3a95e409e8f\"}]},\"ping\":{\"ping_freshness\":\"{4dad6631-4821-4912-bbc8-e53ad820ad4f}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"20210524\"},{\"appid\":\"aemomkdncapdnfajjbbcbdebjljbpmpj\",\"brand\":\"CHBD\",\"cohort\":\"1::\",\"enabled\":true,\"ping\":{\"ping_freshness\":\"{09a18007-4fb9-47ed-b09b-4ec3095a4ea8}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"1.0.5.0\"},{\"appid\":\"llkgjffcdpffmhiakmfcdcblohccpfmo\",\"brand\":\"CHBD\",\"cohort\":\"1::\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.2731bdeddb1470bf2f7ae9c585e7315be52a8ce98b8af698ece8e500426e378a\"}]},\"ping\":{\"ping_freshness\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"{ca810a8d-7a80-4622-b2b4-e63757b1f51b}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"1.0.0.8\"},{\"appid\":\"ehgidpndbllacpjalkiimkbadgjfnnmc\",\"brand\":\"CHBD\",\"cohort\":\"1:ofl:\",\"cohorthint\":\"stable64\",\"cohortname\":\"stable64\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.a8a79d350c2a5e3bc36226633a8e0bed0dfab184e77f38fc8f0820ebacf8eafc\"}]},\"ping\":{\"ping_freshness\":\"{079b15d0-a7cf-4d2d-b2fa-9cc0219f4efa}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"2018.8.8.0\"}," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"{\"appid\":\"gkmgaooipdjhmangpemjhigmamcehddo\",\"brand\":\"CHBD\",\"cohort\":\"1:pw3:\",\"cohorthint\":\"Stable\",\"cohortname\":\"Stable\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.48b7cd9a9a4134d608effe24870c91e3bfc6a097c1472878a0c6d8b61f87d0fe\"}]},\"ping\":{\"ping_freshness\":\"{de8c8bad-a953-4caf-a9df-7f7425ce4b9b}\",\"rd\":5267},\"tag\":\"eset_exp_b\",\"updatecheck\":{},\"version\":\"90.262.200\"},{\"appid\":\"jflookgnkcckhobaglndicnbbgbonegd\",\"brand\":\"CHBD\",\"cohort\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"1:s7x:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.0a39024542b819ebecaefdaec8b6b01749bd16832bb6fa4872f56c1d0ffab270\"}]},\"ping\":{\"ping_freshness\":\"{7f1ca091-2d50-4913-acc2-65ae1ad473dc}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"2643\"},{\"appid\":\"ggkkehgbnfjpeggfpleeakpidbkibbmn\",\"brand\":\"CHBD\",\"cohort\":\"1:ut9:102l@0.01\",\"cohorthint\":\"M80ToM99\",\"cohortname\":\"M80ToM99\",\"enabled\":true,\"packages\":{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"package\":[{\"fp\":\"1.29b5bed2c1f5c236220375169f03d48407cd69e53266b6140c0bf2759935467e\"}]},\"ping\":{\"ping_freshness\":\"{638ebac6-b37f-428c-8527-eb1938ace047}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"2021.5.24.1143\"},{\"appid\":\"jamhcnnkihinmdlkakkaopbjbbcngflc\",\"brand\":\"CHBD\",\"cohort\":\"1:wvr:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.7b25cf1c2f41026dead968c9e3edb43c6df27039817f96e6e00bb748f5da9482\"}]},\"ping\":" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"{\"ping_freshness\":\"{6752afd7-5999-4b3c-ba4c-1f3dbe2c52de}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"93.0.4530.0\"},{\"appid\":\"ojhpjlocmbogdgmfpkhlaaeamibhnphh\",\"brand\":\"CHBD\",\"cohort\":\"1:w0x:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.478aa915e78878e332a0b4bb4d2a6fb67ff1c7f7b62fe906f47095ba5ae112d0\"}]},\"ping\":{\"ping_freshness\":\"{b235e02a-d8f1-4b6d-a706-a8fb1211b617}\",\"rd\":5267},\"updatecheck\":{},\"version\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":\"1\"},{\"appid\":\"pdafiollngonhoadbmdoemagnfpdphbe\",\"brand\":\"CHBD\",\"cohort\":\"1:vz3:\",\"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.baeb7c645c7704139756b02bf2741430d94ea3835fb1de77fef1057d8c844655\"}]},\"ping\":{\"ping_freshness\":\"{e0e45fe2-72bf-4c1f-8fb6-612d9e323f33}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"2021.2.22.1142\"},{\"appid\":\"eeigpngbgcognadeebkilcpcaedhellh\",\"brand\":\"CHBD\",\"cohort\":\"1:w59:\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"cohorthint\":\"Auto\",\"cohortname\":\"Auto\",\"enabled\":true,\"packages\":{\"package\":[{\"fp\":\"1.c64c9c1008f3ba5f6e18b3ca524bc98dcd8acfae0a2720a8f1f3ef0f8d643d05\"}]},\"ping\":{\"ping_freshness\":\"{814d30ca-0c4b-4a7d-8ae1-9114a5d7b5aa}\",\"rd\":5267},\"updatecheck\":{},\"version\":\"2020.11.2.164946\"}],\"arch\":\"x64\",\"dedup\":\"cr\",\"domainjoined\":false,\"hw\":{\"physmemory\":16},\"lang\":\"en-US\",\"nacl_arch\":\"x86-64\",\"os\":{\"arch\":\"x86_64\",\"platform\":\"Windows\",\"version" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\":\"10.0.19042.985\"},\"prodversion\":\"91.0.4472.77\",\"protocol\":\"3.1\",\"requestid\":\"{4f3831a0-3ffb-4d6f-accf-57f6f63bffff}\",\"sessionid\":\"{0118f0f9-c11e-440b-95f3-1b5125273cbb}\",\"updater\":{\"autoupdatecheckenabled\":true,\"ismachine\":true,\"lastchecked\":0,\"laststarted\":0,\"name\":\"Omaha\",\"updatepolicy\":-1,\"version\":\"1.3.36.82\"},\"updaterversion\":\"91.0.4472.77\"}}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_header("Origin", 
		"https://www.amazon.in");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"cross-site");

	_webresult = lrapi.web.add_auto_header("Accept", 
		"*/*");

	_webresult = lrapi.web.add_auto_header("Accept-Language", 
		"en-US,en;q=0.9");

	_webresult = lrapi.web.add_auto_header("sec-ch-ua", 
		"\" Not;A Brand\";v=\"99\", \"Google Chrome\";v=\"91\", \"Chromium\";v=\"91\"");

	_webresult = lrapi.web.add_auto_header("sec-ch-ua-mobile", 
		"?0");

	_webresult = lrapi.web.custom_request("com.amazon.csm.nexusclient.prod_2", 
		"URL=https://unagi-eu.amazon.com/1/events/com.amazon.csm.nexusclient.prod", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t30.inf", 
		"Mode=HTML", 
		"EncType=text/plain;charset=UTF-8", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={\"cs\":{\"dct\":{\"#0\":\"requestId\",\"#1\":\"AXERV8EH5V8NQ9CRG46P\",\"#2\":\"server\",\"#3\":\"www.amazon.in\",\"#4\":\"obfuscatedMarketplaceId\",\"#5\":\"A21TJRUUN4KGV\",\"#6\":\"producerId\",\"#7\":\"csm\",\"#8\":\"schemaId\",\"#9\":\"csm.CSMBaselineEvent.4\",\"#10\":\"timestamp\",\"#11\":\"messageId\",\"#12\":\"sessionId\",\"#13\":\"260-7871994-7522166\"}},\"events\":[{\"data\":{\"#0\":\"#1\",\"#2\":\"#3\",\"#4\":\"#5\",\"#6\":\"#7\",\"#8\":\"#9\",\"#10\":\"2021-06-03T08:01:05.645Z\",\"" +
		"#11\":\"AXERV8EH5V8NQ9CRG46P-1622707265645-3837302638\",\"#12\":\"#13\"}}]}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_cookie("gnar_containerId=qxnPSxWqSwxE; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("_gcl_au=1.1.158826989.1619417052; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("ga_clientId=2019783442.1619417053; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("_hjid=ab5478c6-b271-487f-aad0-e8df8f0ddc68; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("_ga=GA1.1.2019783442.1619417053; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("tdi=asems1ohualrti4u8; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("_ga_CBK9K2ZWWE=GS1.1.1619417052.1.1.1619417213.0; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("grauth=AABJVjMK6nVkMtRJPv-iBEKuSwxWFeYpgvMqIAHum4YNW8lMKl12IZlwoAWmEeAu6sH4LXMyR16youqY; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("csrf-token=AABJVmhvHWx69iKfqJmQAB0RLq2CRv2txQEyaA; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("8KDGXLZlVH=8KDGXLZlVH; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("tJkCbg8XH7=tJkCbg8XH7; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("IXU7BcPBzO=IXU7BcPBzO; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("GmjYPN3eYH=GmjYPN3eYH; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("pbZI1TnzX2=pbZI1TnzX2; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("3MMydHtHgv=3MMydHtHgv; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("ELwbT8uQDd=ELwbT8uQDd; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("tqYjMgQIx5=tqYjMgQIx5; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("7FUEItUAwx=7FUEItUAwx; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("L1O10AaDBe=L1O10AaDBe; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("NoAHlPQ6Lf=NoAHlPQ6Lf; DOMAIN=gnar.grammarly.com");

	_webresult = lrapi.web.add_cookie("csm-hit=tb:s-AXERV8EH5V8NQ9CRG46P|1622707259921&t:1622707260951&adb:adblk_no; DOMAIN=www.amazon.in");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"none");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"cors");

	_webresult = lrapi.web.add_header("Origin", 
		"chrome-extension://kbfnbcaeplbcioakkpcpgfkobkghlhen");

	_webresult = lrapi.web.custom_request("events", 
		"URL=https://gnar.grammarly.com/events", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t31.inf", 
		"Mode=HTML", 
		"EncType=application/json", 
		"Body={\"events\":[{\"action\":\"loaded\",\"eventName\":\"chromeExt/extension-loaded\",\"objectId\":\"extension\",\"oldVersion\":\"14.1012.0\",\"client\":\"chromeExt\",\"clientVersion\":\"14.1012.0\",\"instanceId\":\"0u0gyHkA\",\"batchId\":0,\"containerId\":\"qxnPSxWqSwxE\",\"userId\":\"1035883401\",\"isTest\":false,\"userAgent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36\",\"screenWidth\":1366,\"screenHeight\":768,\"" +
		"containerWidth\":0,\"containerHeight\":0,\"devicePixelRatio\":1}]}", 
		EXTRARES, 
		"Url=https://www.amazon.in/gp/navigation/ajax/dynamic-menu.html?wishlistItems=wishlist&alexaItems=alexa&metricKey=alexaMetric&rid=AXERV8EH5V8NQ9CRG46P&isFullWidthPrime=0&isPrime=0&dynamicRequest=1&weblabs=&isFreshRegionAndCustomer=&primeMenuWidth=310&_=1622707270989", "Referer=https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28", ENDITEM, 
		"Url=https://m.media-amazon.com/images/S/sash/KFPk-9IF4FqAqY-.woff2", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_auto_header("Accept", 
		"image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-origin");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Dest", 
		"image");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"no-cors");

	_webresult = lrapi.web.add_header("downlink", 
		"5.05");

	_webresult = lrapi.web.add_header("ect", 
		"4g");

	_webresult = lrapi.web.add_header("rtt", 
		"200");

	_webresult = lrapi.web.url("uedata_2", 
		"URL=https://www.amazon.in/rd/uedata?ld&v=0.217347.0&id=AXERV8EH5V8NQ9CRG46P&sw=1366&sh=768&vw=1349&vh=657&m=1&sc=AXERV8EH5V8NQ9CRG46P&ue=5&bb=9130&ns=9180&ne=9299&be=10154&fp=9226&fcp=9226&af=15419&pc=20959&tc=-15572&na_=-15572&ul_=-71&_ul=-71&rd_=-1622707250795&_rd=-1622707250795&fe_=-15570&lk_=-971&_lk=-971&co_=-971&_co=-864&sc_=-971&rq_=-851&rs_=-170&_rs=3385&dl_=-27&di_=14874&de_=14875&_de=14875&_dc=20959&ld_=20959&_ld=-1622707250795&ntd=-1&ty=0&rc=0&hob=3&hoe=5&ld=20961&t=1622707271756&ctb=1&" +		"rt=_af:24-4-4-13-3-3-1_ld:169-5-4-151-7-3-1&ec=1&ecf=0&csmtags=aui|aui:aui_build_date:3.21.4-2021-05-27|ewc:unpersist|ewc:unpersist:emptycart|ewc:bview|ewc|ewc:unrec|ewc:cartsize:0|ewc:aui|navbar|fls-eu-amazon-in|adblk_no|iss-on-time|csm-feature-touch-enabled:false&viz=visible:4&pty=Landing&spty=Cat-M&pti=6648217031&tid=EE9C4QZH64TKGS28S5QH&aftb=1&ui=2", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28", 
		"Snapshot=t32.inf", 
		"Mode=HTML", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.add_auto_header("Accept", 
		"*/*");

	_webresult = lrapi.web.add_auto_header("Origin", 
		"https://www.amazon.in");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Dest", 
		"empty");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"same-site");

	_webresult = lrapi.web.custom_request("com.amazon.csm.csa.prod_3", 
		"URL=https://unagi.amazon.in/1/events/com.amazon.csm.csa.prod", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t33.inf", 
		"Mode=HTML", 
		"EncType=text/plain;charset=UTF-8", 
		"Body={\"events\":[{\"data\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"producerId\":\"csa\",\"schemaId\":\"csa.PageEntity.1\",\"version\":1,\"attributes\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"meaningful\":\"interactive\",\"url\":\"https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"server\":\"www.amazon.in\",\"path\":\"/gp/browse.html\",\"referrer\":\"https://www.amazon.in/\",\"title\":\"Amazon " +
		"Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids\",\"transitionType\":\"hard\"},\"timestamp\":\"2021-06-03T08:00:59.970Z\",\"messageId\":\"akrtgg-9nlz4-5qlva5-o3k0ai\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\"}},{\"data\":{\"transitionType\":\"hard\",\"schemaId\":\"csa.PageRender.3\",\"timestamp\":\"2021-06-03T08:00:59.971Z\",\"messageId\":\"wpe5qq-kpo7xq-x0axzo-plohc1\",\"application\":\"Retail:Prod:www.amazon.in\",\"" +
		"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"meaningful\":\"interactive\",\"url\":\"https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"server\":\"www.amazon.in\",\"path\":\"/gp/browse.html\",\"referrer\":\"https://www.amazon.in/\",\"title\":\"Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women " +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"and Kids\",\"transitionType\":\"hard\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"producerId\":\"csa\",\"schemaId\":\"csa.PageEntity.1\",\"version\":2,\"attributes\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"meaningful\":\"interactive\",\"url\":\"https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"server\":\"www.amazon.in\",\"path\":\"/gp/" +
		"browse.html\",\"referrer\":\"https://www.amazon.in/\",\"title\":\"Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids\",\"transitionType\":\"hard\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\",\"pageTypeId\":\"6648217031\"},\"timestamp\":\"2021-06-03T08:01:05.651Z\",\"messageId\":\"qcr14w-adcvke-1p3sot-gvl16n\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\"}},{\"data\":{\"navigation\":{\"type\":\"normal\",\"toTabId\"" +
		":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"toPageId\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"transitTime\":49488,\"fromTabId\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"fromPageId\":\"k73g5z-ry4yg6-46dgee-1fxxk4\",\"interactionId\":\"ze4iw-ndlush-qlvxk5-w7i4xo\"},\"schemaId\":\"csa.TabbedBrowsing.2\",\"timestamp\":\"2021-06-03T08:01:05.656Z\",\"messageId\":\"ab5pud-sftc4m-4dxj8b-290wfw\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"renderedToMeaningful\":5698,\"renderedToViewed\":5698,\"schemaId\":\"csa.PageView.4\",\"timestamp\":\"2021-06-03T08:01:05.669Z\",\"messageId\":\"2rsixv-5e9yqt-w8rc9r-diqwy9\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":" +
		"{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"meaningful\":\"interactive\",\"url\":\"https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"server\":\"www.amazon.in\",\"path\":\"/gp/browse.html\",\"referrer\":\"https://www.amazon.in/\",\"title\":\"Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids\",\"transitionType\":\"hard\",\"pageType\":\"Landing\",\"subPageType\":" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"Cat-M\",\"pageTypeId\":\"6648217031\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"i13qx6-zam2hq-uqh8wv-ipht98\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\"," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"gznlkh-55mztm-a47l09-73mrmm\",\"class\":\"nav-sprite-v1 celwidget nav-bluebeacon nav-a11y-t1 bold-focus-hover layout2 nav-flex layout3 layout3-alt nav-packard-glow hamburger nav-progressive-attribute\",\"slotId\":\"Navigation-desktop-navbar\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"3yi349-5e1ad8-hvqeyt-lc3p6p\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"onrv3p-3axlsl-f9eimh-ccjr35\",\"class\":\"acswidget acswidget-content-grid " +
		"celwidget IN bxw-content-grid bxw-content-grid--ember bxc-grid--padding bxc-grid--spacing-large  bxc-grid--dark\",\"slotId\":\"acsux-widgets_content-grid_merchandised-search-2\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"ndnq6m-krugd8-8emgou-6fhgmy\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"z3qzpf-knovmz-rlrhow-c7nxtj\",\"class\":\"acswidget acswidget-content-grid celwidget IN bxw-content-grid bxw-content-grid--ember bxc-grid--padding bxc-grid--spacing-large  bxc-grid--light\",\"slotId\":\"acsux-widgets_content-grid_merchandised-search-3\",\"type\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"g5wcrf-52hytc-bqbk04-hcunsk\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"" +
		"260-7871994-7522166\"},\"element\":{\"id\":\"mgtow8-3j69s8-mptd0a-8ovkp2\",\"class\":\"sl-sobe-card-desktop celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e csm-widget-ref-QAHzEditorial_en_IN csm-pageid-6648217031 csm-widget-type-horizontaleditorial\",\"slotId\":\"sobe_d_b_4\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"x44yew-ox58m9-of1r82-cqxmef\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"2gzd6d-5xl72d-u903kw-5p0hew\",\"class\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e_1 " +
		"csm-widget-ref-QAHzEditorial_en_IN_1 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-1\",\"slotId\":\"sobe_d_b_4_1\",\"type\":\"widget\",\"parentId\":\"mgtow8-3j69s8-mptd0a-8ovkp2\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"yhszkk-tx49e4-vp897g-dbkarq\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"w6e0ie-tfwhzu-575jor-pzqs39\",\"class\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e_2 csm-widget-ref-QAHzEditorial_en_IN_2 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-2\"," +
		"\"slotId\":\"sobe_d_b_4_2\",\"type\":\"widget\",\"parentId\":\"mgtow8-3j69s8-mptd0a-8ovkp2\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"whjouo-j61zi7-x0h3m7-hj219i\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"4l8vnk-ccjmwz-dj1d7d-692zo5\",\"class\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e_3 csm-widget-ref-QAHzEditorial_en_IN_3 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-3\",\"slotId\":\"sobe_d_b_4_3\",\"type\":\"widget\",\"parentId\":\"mgtow8-3j69s8-mptd0a-8ovkp2\"}}}},{\"data\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"aavz1h-imp4fo-3pd3qh-hku7fh\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"" +
		"element\":{\"id\":\"lpy3td-66w6zm-in9r0k-wltvf\",\"class\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e_4 csm-widget-ref-QAHzEditorial_en_IN_4 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-4\",\"slotId\":\"sobe_d_b_4_4\",\"type\":\"widget\",\"parentId\":\"mgtow8-3j69s8-mptd0a-8ovkp2\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"2021-06-03T08:01:05.672Z\",\"messageId\":\"z7rq8p-wlqd7t-tcftiy-4ybun8\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"ujol7g-v54xxi-kqko60-o0w6hl\",\"class\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e_5 csm-widget-ref-QAHzEditorial_en_IN_5 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-5\",\"slotId\":\"sobe_d_b_4_5\",\"type\":\"widget\",\"parentId\":\"mgtow8-3j69s8-mptd0a-8ovkp2\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"kx91t4-em0277-59mbl1-84glfc\",\"application\":\"Retail:Prod" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"28kx0q-jcmszc-lshp8l-635vwk\",\"class\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e_6 csm-widget-ref-QAHzEditorial_en_IN_6 csm-pageid-6648217031 " +
		"csm-widget-type-horizontaleditorial-tile csm-widget-tile-6\",\"slotId\":\"sobe_d_b_4_6\",\"type\":\"widget\",\"parentId\":\"mgtow8-3j69s8-mptd0a-8ovkp2\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"bd8pf5-vadyes-4silci-b1j9d\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"e3i9t8-usioa4-4il66w-arnbg2\",\"class\":\"sl-sobe-card-desktop celwidget csm-placement-id-143a0229-3130-4c09-a944-73972faa7cdb csm-widget-ref-QAHzEditorial_en_IN csm-pageid-6648217031 csm-widget-type-horizontaleditorial\",\"slotId\":\"sobe_d_b_5\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"m0xgam-gq5ali-6q2p0r-uhclg4\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\"" +
		":\"yfhq3w-wan04d-eydz7o-tz2kpo\",\"class\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-143a0229-3130-4c09-a944-73972faa7cdb_1 csm-widget-ref-QAHzEditorial_en_IN_1 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-1\",\"slotId\":\"sobe_d_b_5_1\",\"type\":\"widget\",\"parentId\":\"e3i9t8-usioa4-4il66w-arnbg2\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		",\"messageId\":\"l8yrn6-noldef-pv0o0b-1an7jc\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"xtsypr-6oatic-abp11n-7dj9v6\",\"class\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-143a0229-3130-4c09-a944-73972faa7cdb_2 csm-widget-ref-QAHzEditorial_en_IN_2 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-2\",\"slotId\":\"sobe_d_b_5_2\",\"type\":\"widget\",\"parentId\":\"e3i9t8-usioa4-4il66w-arnbg2\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"gia6rp-8lwce6-c8p34g-lgvsak\",\"application\":\"Retail:Prod" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"p3suz1-s8aybw-f2q68i-mwgsfy\",\"class\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-143a0229-3130-4c09-a944-73972faa7cdb_3 csm-widget-ref-QAHzEditorial_en_IN_3 csm-pageid-6648217031 " +
		"csm-widget-type-horizontaleditorial-tile csm-widget-tile-3\",\"slotId\":\"sobe_d_b_5_3\",\"type\":\"widget\",\"parentId\":\"e3i9t8-usioa4-4il66w-arnbg2\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"f9yv1q-5n9fs5-xsq1mc-wnzo3z\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"9mi99u-uqkxqb-r44dye-5m1kjc\",\"class\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-143a0229-3130-4c09-a944-73972faa7cdb_4 csm-widget-ref-QAHzEditorial_en_IN_4 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-4\",\"slotId\":\"sobe_d_b_5_4\",\"type\":\"widget\",\"parentId\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":\"e3i9t8-usioa4-4il66w-arnbg2\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":18,\"pageFirstPaintToElementViewed\":30449,\"timestamp\":\"2021-06-03T08:01:05.672Z\",\"messageId\":\"l53ptu-i6b6s1-vzt5a7-a6vbxo\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"}," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"4ee5ti-kjqe1x-hr1910-v0in65\",\"class\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-143a0229-3130-4c09-a944-73972faa7cdb_5 csm-widget-ref-QAHzEditorial_en_IN_5 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-5\",\"slotId\":\"sobe_d_b_5_5\",\"type\":\"widget\",\"parentId\":\"e3i9t8-usioa4-4il66w-arnbg2\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":40,\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"pageFirstPaintToElementViewed\":30471,\"timestamp\":\"2021-06-03T08:01:05.694Z\",\"messageId\":\"e071kg-wwnv3l-6wkzw7-ex116y\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"2pdhd9-wz0rga-d2263j-xk51a7\",\"type\"" +
		":\"link\",\"slotId\":\"nav-link-accountList\",\"contentId\":\"nav_ya_signin\",\"href\":\"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=" +
		"https%3A%2F%2Fwww.amazon.in%2Fb%2F%3Fie%3DUTF8%26_encoding%3DUTF8%26browseLadder%3D6648217031%26browseLadderData%3D%255B%257B%2522storeContextName%2522%253A%2522Fashion%2522%252C%2522id%2522%253A%25226648217031%2522%252C%2522contextFreeName%2522%253A%2522Fashion%2522%257D%255D%26contextFreeName%3DFashion%26displayStyle%3D2-column-static%26node%3D6648217031%26redirect%3Dtrue%26storeContextName%3DFashion%26ref_%3Dnav_ya_signin&openid.identity=" +
		"http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\",\"class\":\"nav-a nav-a-2   nav-progressive-attribute\",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":40,\"pageFirstPaintToElementViewed\":30471,\"timestamp\":\"2021-06-03T08:01" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":05.694Z\",\"messageId\":\"k0gw8n-kc2mi1-y4wcga-vqoqyn\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"epngop-d5uuyk-bwgo0u-hdzmh7\",\"type\":\"widget\",\"slotId\":\"HamburgerMenuDesktop\",\"interactionEvents\":" +
		"\"click\",\"href\":\"javascript: void(0)\",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":40,\"pageFirstPaintToElementViewed\":30471,\"timestamp\":\"2021-06-03T08:01:05.694Z\",\"messageId\":\"590rw7-izvyob-yevfsc-asni9p\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"vro2t1-ranntp-pef14a-6h9rc2\",\"type\":\"link\",\"slotId\":\"nav_cs_0\",\"contentId\":\"nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98\",\"href\":\"/gp/bestsellers/?ref_=nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":41,\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"pageFirstPaintToElementViewed\":30472,\"timestamp\":\"2021-06-03T08:01:05.695Z\",\"messageId\":\"j59lfl-kurbn2-7a0mhl-55lit4\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"r4k1ph-9gtei0-j7aia5-trrcbe\",\"type\"" +
		":\"link\",\"slotId\":\"nav_cs_1\",\"contentId\":\"nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7\",\"href\":\"/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":41,\"pageFirstPaintToElementViewed\":30472,\"timestamp\":\"2021-06-03T08:01:05.695Z\",\"messageId\":\"f3fkas-2pml5z-83hq9x-hi50vd\",\"application\":\"Retail" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"kis2eo-mxxt7l-fam013-isa7qt\",\"type\":\"link\",\"slotId\":\"nav-link-prime\",\"contentId\":\"nav_cs_primelink_nonmember_2860122b63884a8688052dc445e46bd9\",\"href\":\"/prime?ref_=" +
		"nav_cs_primelink_nonmember_2860122b63884a8688052dc445e46bd9\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":41,\"pageFirstPaintToElementViewed\":30472,\"timestamp\":\"2021-06-03T08:01:05.695Z\",\"messageId\":\"69rr88-py2d47-r5zr8p-uh18kl\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"1ys2e0-2kl55w-kodc3v-8lkf9j\",\"type\":\"link\",\"slotId\":\"nav_cs_3\",\"contentId\":\"nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"href\":\"/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":41,\"pageFirstPaintToElementViewed\":30472,\"timestamp\":\"2021-06-03T08:01:05.695Z\",\"messageId\":\"wvdslp-9s42nn-5nhsoy-txuerp\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"" +
		"260-7871994-7522166\"},\"element\":{\"id\":\"89kiad-jjxzt6-n8rt4k-lbvzyg\",\"type\":\"link\",\"slotId\":\"nav_cs_4\",\"contentId\":\"nav_cs_electronics_c5b70a82461a484189e700166599ce9f\",\"href\":\"/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics_c5b70a82461a484189e700166599ce9f\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":41,\"pageFirstPaintToElementViewed\":30472,\"timestamp\":\"2021-06-03T08" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":01:05.695Z\",\"messageId\":\"e0xpcq-y4p550-ky57gp-s4p58q\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"5rvcwn-qsykj5-elzxq9-mx8hlb\",\"type\":\"link\",\"slotId\":\"nav_cs_5\",\"contentId\":\"" +
		"nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45\",\"href\":\"/gp/new-releases/?ref_=nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":41,\"pageFirstPaintToElementViewed\":30472,\"timestamp\":\"2021-06-03T08:01:05.695Z\",\"messageId\":\"2tlu16-pviv8b-fv721v-5qvvfn\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"m1wfjj-bsi9v3-msutn7-prf4xi\",\"type\":\"link\",\"slotId\":\"nav_cs_6\",\"contentId\":\"nav_cs_help_79404a52982a4d9d973cf256c713999e\",\"href\":\"/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help_79404a52982a4d9d973cf256c713999e\",\"class\":\"" +
		"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":41,\"pageFirstPaintToElementViewed\":30472,\"timestamp\":\"2021-06-03T08:01:05.695Z\",\"messageId\":\"nmt3ww-qhvakf-g0b887-6jzfa7\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"6q69xw-tocvqd-953o9y-qkeoml\",\"type\":\"link\",\"slotId\":\"nav_cs_7\",\"contentId\":\"nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84\",\"href\":\"/gp/goldbox?ref_=nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentView.3\",\"timeToViewed\":41,\"pageFirstPaintToElementViewed\":30472,\"timestamp\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"2021-06-03T08:01:05.695Z\",\"messageId\":\"gxl13v-pjxm27-7ry1h6-sp8hiq\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"2javvy-q0pfrs-v0gmlz-pghdxv\",\"type\":\"link\",\"slotId\":\"nav_cs_8\",\"contentId\":\"" +
		"nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f\",\"href\":\"/gp/sva/dashboard?ref_=nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"renderedToMeaningful\":5698,\"renderedToViewed\":5698,\"renderedToImpressed\":6926,\"schemaId\":\"csa.PageImpressed.2\",\"timestamp\":\"2021-06-03T08:01:06.897Z\",\"messageId\":\"lu5sav-er3cop-b4llco-dh8p5p\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"" +
		"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"meaningful\":\"interactive\",\"url\":\"https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"server\":\"www.amazon.in\",\"path\":\"/gp/browse.html\",\"referrer\":\"https://www.amazon.in/\",\"title\":\"Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids\",\"transitionType\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":\"hard\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\",\"pageTypeId\":\"6648217031\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1244,\"pageFirstPaintToElementImpressed\":31675,\"timestamp\":\"2021-06-03T08:01:06.898Z\",\"messageId\":\"6obawu-dx2si4-hv94bx-p7xc28\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"gznlkh-55mztm-a47l09-73mrmm\",\"class\":\"nav-sprite-v1 celwidget nav-bluebeacon nav-a11y-t1 bold-focus-hover layout2 nav-flex layout3 layout3-alt nav-packard-glow hamburger nav-progressive-attribute\",\"slotId\":\"Navigation-desktop-navbar\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"csa.ContentImpressed.2\",\"timeToImpressed\":1244,\"pageFirstPaintToElementImpressed\":31675,\"timestamp\":\"2021-06-03T08:01:06.898Z\",\"messageId\":\"edt6lp-oz73hi-hqlmss-zctvec\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"" +
		"element\":{\"id\":\"onrv3p-3axlsl-f9eimh-ccjr35\",\"class\":\"acswidget acswidget-content-grid celwidget IN bxw-content-grid bxw-content-grid--ember bxc-grid--padding bxc-grid--spacing-large  bxc-grid--dark\",\"slotId\":\"acsux-widgets_content-grid_merchandised-search-2\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1245,\"pageFirstPaintToElementImpressed\":31676,\"timestamp\":\"2021-06-03T08:01:06.899Z\",\"messageId\":\"hhhssg-3dh9wn-8brt-msrmil\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"z3qzpf-knovmz-rlrhow-c7nxtj\",\"class\":\"acswidget acswidget-content-grid celwidget IN bxw-content-grid bxw-content-grid--ember bxc-grid--padding " +
		"bxc-grid--spacing-large  bxc-grid--light\",\"slotId\":\"acsux-widgets_content-grid_merchandised-search-3\",\"type\":\"widget\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1245,\"pageFirstPaintToElementImpressed\":31676,\"timestamp\":\"2021-06-03T08:01:06.899Z\",\"messageId\":\"r2jn2y-403vy3-y1m66s-axjctl\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"2pdhd9-wz0rga-d2263j-xk51a7\",\"type\":\"link\",\"slotId\":\"nav-link-accountList\",\"contentId\":\"nav_ya_signin\",\"href\":\"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=" +
		"https%3A%2F%2Fwww.amazon.in%2Fb%2F%3Fie%3DUTF8%26_encoding%3DUTF8%26browseLadder%3D6648217031%26browseLadderData%3D%255B%257B%2522storeContextName%2522%253A%2522Fashion%2522%252C%2522id%2522%253A%25226648217031%2522%252C%2522contextFreeName%2522%253A%2522Fashion%2522%257D%255D%26contextFreeName%3DFashion%26displayStyle%3D2-column-static%26node%3D6648217031%26redirect%3Dtrue%26storeContextName%3DFashion%26ref_%3Dnav_ya_signin&openid.identity=" +
		"http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\",\"class\":\"nav-a nav-a-2   nav-progressive-attribute\",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1245,\"pageFirstPaintToElementImpressed\":31676,\"timestamp\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"2021-06-03T08:01:06.899Z\",\"messageId\":\"f8f67f-2knj7-j4szz1-dpe8t2\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"epngop-d5uuyk-bwgo0u-hdzmh7\",\"type\":\"widget\",\"slotId\":\"HamburgerMenuDesktop\",\"" +
		"interactionEvents\":\"click\",\"href\":\"javascript: void(0)\",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1245,\"pageFirstPaintToElementImpressed\":31676,\"timestamp\":\"2021-06-03T08:01:06.899Z\",\"messageId\":\"m9cdt-u02qwu-y92lee-k5cegw\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"vro2t1-ranntp-pef14a-6h9rc2\",\"type\":\"link\",\"slotId\":\"nav_cs_0\",\"contentId\":\"nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98\",\"href\":\"/gp/bestsellers/?ref_=nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"csa.ContentImpressed.2\",\"timeToImpressed\":1245,\"pageFirstPaintToElementImpressed\":31676,\"timestamp\":\"2021-06-03T08:01:06.901Z\",\"messageId\":\"tvszf4-hjnr2f-2unmtg-70jqnb\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"" +
		"element\":{\"id\":\"r4k1ph-9gtei0-j7aia5-trrcbe\",\"type\":\"link\",\"slotId\":\"nav_cs_1\",\"contentId\":\"nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7\",\"href\":\"/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1247,\"pageFirstPaintToElementImpressed\":31678,\"timestamp\":\"2021-06-03T08:01:06.901Z\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"messageId\":\"hukoyj-yz4yb5-son499-7kalms\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"kis2eo-mxxt7l-fam013-isa7qt\",\"type\":\"link\",\"slotId\":\"nav-link-prime\",\"contentId\":\"" +
		"nav_cs_primelink_nonmember_2860122b63884a8688052dc445e46bd9\",\"href\":\"/prime?ref_=nav_cs_primelink_nonmember_2860122b63884a8688052dc445e46bd9\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1247,\"pageFirstPaintToElementImpressed\":31678,\"timestamp\":\"2021-06-03T08:01:06.901Z\",\"messageId\":\"mnsu3g-v65nd8-50sdpj-q2930i\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"1ys2e0-2kl55w-kodc3v-8lkf9j\",\"type\":\"link\",\"slotId\":\"nav_cs_3\",\"contentId\":\"nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"href\":\"/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"" +
		"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1248,\"pageFirstPaintToElementImpressed\":31679,\"timestamp\":\"2021-06-03T08:01:06.902Z\",\"messageId\":\"c6erlj-vlf1f3-51gc5u-1eoieq\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"89kiad-jjxzt6-n8rt4k-lbvzyg\",\"type\":\"link\",\"slotId\":\"nav_cs_4\",\"contentId\":\"nav_cs_electronics_c5b70a82461a484189e700166599ce9f\",\"href\":\"/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics_c5b70a82461a484189e700166599ce9f\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"timeToImpressed\":1248,\"pageFirstPaintToElementImpressed\":31679,\"timestamp\":\"2021-06-03T08:01:06.902Z\",\"messageId\":\"9hljmf-5gyniw-yp9ti2-i93za8\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"" +
		"5rvcwn-qsykj5-elzxq9-mx8hlb\",\"type\":\"link\",\"slotId\":\"nav_cs_5\",\"contentId\":\"nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45\",\"href\":\"/gp/new-releases/?ref_=nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1248,\"pageFirstPaintToElementImpressed\":31679,\"timestamp\":\"2021-06-03T08:01:06.902Z\",\"messageId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"uz27q-pki4p-nktb2u-uajrlk\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"m1wfjj-bsi9v3-msutn7-prf4xi\",\"type\":\"link\",\"slotId\":\"nav_cs_6\",\"contentId\":\"nav_cs_help_79404a52982a4d9d973cf256c713999e\",\"" +
		"href\":\"/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help_79404a52982a4d9d973cf256c713999e\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1248,\"pageFirstPaintToElementImpressed\":31679,\"timestamp\":\"2021-06-03T08:01:06.902Z\",\"messageId\":\"a7ck6z-8tdmzw-ovehx6-g18we7\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"},\"element\":{\"id\":\"6q69xw-tocvqd-953o9y-qkeoml\",\"type\":\"link\",\"slotId\":\"nav_cs_7\",\"contentId\":\"nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84\",\"href\":\"/gp/goldbox?ref_=nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"data\":{\"schemaId\":\"csa.ContentImpressed.2\",\"timeToImpressed\":1249,\"pageFirstPaintToElementImpressed\":31680,\"timestamp\":\"2021-06-03T08:01:06.903Z\",\"messageId\":\"n0t7c4-vv6khh-x259hv-x5yzty\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"260-7871994-7522166\"},\"element\":{\"id\":\"2javvy-q0pfrs-v0gmlz-pghdxv\",\"type\":\"link\",\"slotId\":\"nav_cs_8\",\"contentId\":\"nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f\",\"href\":\"/gp/sva/dashboard?ref_=nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f\",\"class\":\"nav-a  \",\"parentId\":\"gznlkh-55mztm-a47l09-73mrmm\"}}}},{\"data\":{\"schemaId\":\"csa.Metric.3\",\"metrics\":{\"baselineMetricEvent\":1},\"dimensions\":{},\"timestamp\":\"2021-06-03T08:01:08.657Z\",\"messageId\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"27sufi-488r2b-6jd0ox-tz2qs6\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}}]}", 
		EXTRARES, 
		"Url=https://www.amazon.in/favicon.ico", "Referer=https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28", ENDITEM, 
		"Url=https://m.media-amazon.com/images/S/sash/2SazJx$EeTHfhMN.woff2", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		"Url=https://m.media-amazon.com/images/S/sash/Dv1WQ5DdeMS5qP7.woff2", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		"Url=https://m.media-amazon.com/images/S/sash/VjTR4RqBzY0mUYx.woff2", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		"Url=https://m.media-amazon.com/images/S/sash/WOnTLzkiaEccV7F.woff2", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		"Url=https://m.media-amazon.com/images/S/sash/ozb5-CLHQWI6Soc.woff2", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		"Url=https://www.amazon.in/gp/customer-preferences/ajax/icp.html?icpContent=icp&_=1622707271936", "Referer=https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28", ENDITEM, 
		"Url=https://www.amazon.in/service-worker.js", "Referer=https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28", ENDITEM, 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.custom_request("OE_5", 
		"URL=https://fls-eu.amazon.in/1/batch/1/OE/", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=text/plain", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t34.inf", 
		"Mode=HTML", 
		"EncType=text/plain;charset=UTF-8", 
		"Body={\"rid\":\"AXERV8EH5V8NQ9CRG46P\",\"sid\":\"260-7871994-7522166\",\"mid\":\"A21TJRUUN4KGV\",\"sn\":\"www.amazon.in\",\"reqs\":[{\"jserr-rw\":{\"m\":\"ISS AJAX call failed for iss-warmup with responseText: undefined, pageType: Landing, status: timeout, error: timeout\",\"csm\":\"v5 ueLogError callee\",\"logLevel\":\"WARN\",\"attribution\":\"iss-warmup\",\"pageURL\":\"https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"s\":[\"function()" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"{if(f.ue_err.erl){var a=f.ue_err.erl.length,h;for(h=0;h<a;h++){var b=f.ue_err.erl[h];B(b.ex,b.info)}ue_err.erl=[]}}\",\"function(f,m){function y(a){if(a)return a.replace(/^\\\\s+|\\\\s+$/g,\\\"\\\")}function x(a,h){if(!a)return{};var b=\\\"INFO\\\"===h.logLevel;a.m&&a.m.message&&(a=a.m);var e=h.m||h.message||\\\"\\\";e=a.m&&a.m.message?e+a.m.message:a.m&&a.m.target&&a.m.target.tagName?e+(\\\"Error handler invoked by \\\"+a.m.target.tagName+\\\" tag\\\"):a.m?e+a.m:a.message?e+a.message:e+\\\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Unknown error\\\";e={m:e,name:a.name,type:a.type,csm:N+\\\" \\\"+(a.fromOnError?\\\"onerror\\\":\\\"ueLogError\\\")};var k,l=0;e.logLevel=h.logLevel||A;h.adb&&(e.adb=h.adb);if(k=h.attribution)e.at\"],\"t\":21507}},{\"csmcount\":{\"counter\":\"foresterPayloadSize\",\"t\":0,\"value\":1184}}]}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.custom_request("com.amazon.csm.csa.prod_4", 
		"URL=https://unagi.amazon.in/1/events/com.amazon.csm.csa.prod", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t35.inf", 
		"Mode=HTML", 
		"EncType=text/plain;charset=UTF-8", 
		"Body={\"events\":[{\"data\":{\"markers\":{\"pageVisible\":0,\"cumulativeLayoutShiftLastTimestamp\":30678,\"ue\":15577,\"bodyBegin\":24702,\"ns\":24752,\"ne\":24871,\"bodyEnd\":25726,\"firstPaint\":24798,\"firstContentfulPaint\":24798,\"aboveTheFold\":30991,\"pc\":36531,\"tc\":0,\"na_\":0,\"ul_\":15501,\"_ul\":15501,\"rd_\":36540,\"_rd\":36540,\"fe_\":2,\"lk_\":14601,\"_lk\":14601,\"co_\":14601,\"_co\":14708,\"sc_\":14601,\"rq_\":14721,\"rs_\":15402,\"_rs\":18957,\"dl_\":15545,\"di_\":30446,\"de_\"" +
		":30447,\"_de\":30447,\"_dc\":36531,\"ld_\":36531,\"_ld\":36540,\"ntd\":15571,\"ty\":15572,\"rc\":15572,\"hob\":15575,\"hoe\":15577,\"loaded\":36533,\"navigationStart\":0,\"unloadEventStart\":15501,\"unloadEventEnd\":15501,\"fetchStart\":2,\"domainLookupStart\":14601,\"domainLookupEnd\":14601,\"connectStart\":14601,\"connectEnd\":14708,\"secureConnectionStart\":14601,\"requestStart\":14721,\"responseStart\":15402,\"responseEnd\":18957,\"domLoading\":15545,\"domInteractive\":30446,\"" +
		"domContentLoadedEventStart\":30447,\"domContentLoadedEventEnd\":30447,\"domComplete\":36531,\"loadEventStart\":36531,\"largestContentfulPaint\":31202,\"largestContentfulPaint.render\":31202,\"largestContentfulPaint.load\":30989},\"markerTimestamps\":{\"pageVisible\":1622707235223,\"cumulativeLayoutShiftLastTimestamp\":1622707265901,\"ue\":1622707250800,\"bodyBegin\":1622707259925,\"ns\":1622707259975,\"ne\":1622707260094,\"bodyEnd\":1622707260949,\"firstPaint\":1622707260021,\"" +
		"firstContentfulPaint\":1622707260021,\"aboveTheFold\":1622707266214,\"pc\":1622707271754,\"tc\":1622707235223,\"na_\":1622707235223,\"ul_\":1622707250724,\"_ul\":1622707250724,\"rd_\":1622707271763,\"_rd\":1622707271763,\"fe_\":1622707235225,\"lk_\":1622707249824,\"_lk\":1622707249824,\"co_\":1622707249824,\"_co\":1622707249931,\"sc_\":1622707249824,\"rq_\":1622707249944,\"rs_\":1622707250625,\"_rs\":1622707254180,\"dl_\":1622707250768,\"di_\":1622707265669,\"de_\":1622707265670,\"_de\"" +
		":1622707265670,\"_dc\":1622707271754,\"ld_\":1622707271754,\"_ld\":1622707271763,\"ntd\":1622707250794,\"ty\":1622707250795,\"rc\":1622707250795,\"hob\":1622707250798,\"hoe\":1622707250800,\"loaded\":1622707271756,\"navigationStart\":1622707235223,\"unloadEventStart\":1622707250724,\"unloadEventEnd\":1622707250724,\"fetchStart\":1622707235225,\"domainLookupStart\":1622707249824,\"domainLookupEnd\":1622707249824,\"connectStart\":1622707249824,\"connectEnd\":1622707249931,\"secureConnectionStart\"" +
		":1622707249824,\"requestStart\":1622707249944,\"responseStart\":1622707250625,\"responseEnd\":1622707254180,\"domLoading\":1622707250768,\"domInteractive\":1622707265669,\"domContentLoadedEventStart\":1622707265670,\"domContentLoadedEventEnd\":1622707265670,\"domComplete\":1622707271754,\"loadEventStart\":1622707271754,\"largestContentfulPaint\":1622707266425,\"largestContentfulPaint.render\":1622707266425,\"largestContentfulPaint.load\":1622707266212},\"navigationStartTimestamp\":\"2021-06-03T08" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":00:35.223Z\",\"schemaId\":\"csa.PageLatency.5\",\"timestamp\":\"2021-06-03T08:01:11.814Z\",\"messageId\":\"h1v6bk-if80k7-329dq-1pknt5\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}},{\"data\":{\"schemaId\":\"csa.Metric.3\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"metrics\":{\"documentCumulativeLayoutShift\":0.1594389516078747},\"dimensions\":{},\"timestamp\":\"2021-06-03T08:01:13.971Z\",\"messageId\":\"2t856y-rcwcqk-aa940t-x1lh9c\",\"application\":\"Retail:Prod:www.amazon.in\",\"obfuscatedMarketplaceId\":\"A21TJRUUN4KGV\",\"producerId\":\"csa\",\"entities\":{\"page\":{\"id\":\"rd95uz-v5jtgy-xzx4c0-905goc\",\"requestId\":\"AXERV8EH5V8NQ9CRG46P\",\"pageType\":\"Landing\",\"subPageType\":\"Cat-M\"},\"session\":{\"id\":\"260-7871994-7522166\"}}}}]}", 
		EXTRARES, 
		"Url=https://m.media-amazon.com/images/S/sash/KwhNPG8Jz-Vz2X7.woff2", "Referer=https://images-eu.ssl-images-amazon.com/", ENDITEM, 
		"Url=https://www.amazon.in/gp/customer-preferences/ajax/icp.html?icpContent=icp&_=1622707276937", "Referer=https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28", ENDITEM, 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.custom_request("OE_6", 
		"URL=https://fls-eu.amazon.in/1/batch/1/OE/", new String[]{ 
		"Method=POST", 
		"Resource=0", 
		"RecContentType=text/plain", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t36.inf", 
		"Mode=HTML", 
		"EncType=text/plain;charset=UTF-8", 
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"Body={\"rid\":\"AXERV8EH5V8NQ9CRG46P\",\"sid\":\"260-7871994-7522166\",\"mid\":\"A21TJRUUN4KGV\",\"sn\":\"www.amazon.in\",\"reqs\":[{\"cel\":{\"w\":1349,\"h\":7424,\"t\":15349,\"k\":\"doi\"}},{\"navigation\":{\"quirks\":0}},{\"csmcount\":{\"counter\":\"NavJS:CSM:Latency:PreloadSprite:desktop\",\"value\":9179,\"t\":15990}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_bestsellers_17d44cb01bd144359b81b1c10b84dd98\",\"value\":1,\"t\":15993}},{\"csmcount\":{\"counter\":\"Nav:Xshop" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":Impression:nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7\",\"value\":1,\"t\":15994}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_primelink_nonmember_2860122b63884a8688052dc445e46bd9\",\"value\":1,\"t\":15994}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_fashion_ad6f81eb5d474066bc9e5788a3c19a28\",\"value\":1,\"t\":15994}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_electronics_c5b70a82461a484189e700166599ce9f\",\"value\":1,\"t\":15994}},{\"csmcount\":{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"counter\":\"Nav:Xshop:Impression:nav_cs_newreleases_b9144c00866c4016b948d9b5b5215b45\",\"value\":1,\"t\":15994}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_help_79404a52982a4d9d973cf256c713999e\",\"value\":1,\"t\":15994}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84\",\"value\":1,\"t\":15994}},{\"csmcount\":{\"counter\":\"Nav:Xshop:Impression:nav_cs_apay_fe0c735739554ca1a7cccf7c41941f2f\",\"value\":1,\"t\":15995}},{\"csmcount\":{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"counter\":\"nav-flyout-prime-attach-latency\",\"value\":6721,\"t\":16012}},{\"csmcount\":{\"counter\":\"nav-flyout-accountList-attach-latency\",\"value\":6726,\"t\":16017}},{\"csmcount\":{\"counter\":\"nav-flyout-groceries-attach-latency\",\"value\":6830,\"t\":16121}},{\"csmcount\":{\"counter\":\"nav-flyout-transientFlyout-attach-latency\",\"value\":6835,\"t\":16126}},{\"csmcount\":{\"counter\":\"nav-flyout-fresh-attach-latency\",\"value\":6842,\"t\":16133}},{\"csmcount\":{\"counter\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"nav-flyout-abAcquisition-attach-latency\",\"value\":6844,\"t\":16135}},{\"csmcount\":{\"counter\":\"nav-flyout-abActivation-attach-latency\",\"value\":6845,\"t\":16136}},{\"csmcount\":{\"counter\":\"nav-flyout-abAccountLink-attach-latency\",\"value\":6846,\"t\":16137}},{\"csmcount\":{\"counter\":\"nav-flyout-ewc-show\",\"value\":1,\"t\":16158}},{\"csmcount\":{\"counter\":\"nav-flyout-ewc-landing-show\",\"value\":1,\"t\":16158}},{\"csmcount\":{\"counter\":\"nav-flyout-subnavmay18.json" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":subnav-sl-megamenu-1:0-attach-latency\",\"value\":6884,\"t\":16175}},{\"csmcount\":{\"counter\":\"nav-flyout-subnavmay18.json:subnav-sl-megamenu-2:0-attach-latency\",\"value\":6886,\"t\":16177}},{\"csmcount\":{\"counter\":\"nav-flyout-subnavmay18.json:subnav-sl-megamenu-3:0-attach-latency\",\"value\":6888,\"t\":16179}},{\"csmcount\":{\"counter\":\"nav-flyout-subnavmay18.json:subnav-sl-megamenu-4:0-attach-latency\",\"value\":6895,\"t\":16186}},{\"csmcount\":{\"counter\":\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"nav-flyout-subnavmay18.json:subnav-sl-megamenu-5:0-attach-latency\",\"value\":6897,\"t\":16188}},{\"csmcount\":{\"counter\":\"nav-flyout-subnavmay18.json:subnav-sl-megamenu-7:0-attach-latency\",\"value\":6902,\"t\":16193}},{\"csmcount\":{\"counter\":\"p13n:rhf:invalidPage\",\"value\":1,\"t\":16240}},{\"csmcount\":{\"counter\":\"iss-warmup:init\",\"value\":1,\"t\":16311}},{\"csmcount\":{\"counter\":\"iss-warmup:ajax:init\",\"value\":1,\"t\":16312}},{\"csmcount\":{\"counter\":\"iss-api-v2:init\",\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"value\":1,\"t\":16323}},{\"navigation\":{\"t\":\"ewc\"}},{\"cel\":{\"k\":\"hrt\",\"t\":17853}},{\"csmcount\":{\"counter\":\"iss-warmup:ajax:error\",\"value\":1,\"t\":18327}},{\"csmcount\":{\"counter\":\"iss-warmup:ajax:errortimeout\",\"value\":1,\"t\":18327}},{\"cel\":{\"k\":\"mmm1\",\"e\":[{\"x\":333,\"y\":76,\"t\":19065},{\"x\":405,\"y\":6,\"t\":19194},{\"x\":771,\"y\":4,\"t\":19445},{\"x\":853,\"y\":147,\"t\":19557},{\"x\":861,\"y\":159,\"t\":19856},{\"x\":879,\"y\":147,\"t\":19885},{\"x\":970," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"y\":78,\"t\":20266}],\"min\":699,\"max\":699,\"avg\":699}},{\"csmcount\":{\"counter\":\"alexaMetric-AjaxCallCount\",\"value\":1,\"t\":20958}},{\"csmcount\":{\"counter\":\"alexaMetric-AjaxLatency\",\"value\":765,\"t\":20958}},{\"csmcount\":{\"counter\":\"postbackImageSize\",\"value\":831,\"t\":20969}},{\"csmcount\":{\"counter\":\"NavJS:TimeUpTo:ATF:desktop\",\"value\":202,\"t\":21024}},{\"csmcount\":{\"counter\":\"NavJS:TimeUpTo:CF:desktop\",\"value\":207,\"t\":21027}},{\"csmcount\":{\"counter\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":\"NavJS:TimeUpTo:PageLoaded:desktop\",\"value\":210,\"t\":21032}},{\"csmcount\":{\"counter\":\"NavJS:TotalCallCount:PageLoaded:desktop\",\"value\":1229,\"t\":21032}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:network:D:desktop\",\"value\":15400,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:navFirstPaint:D:desktop\",\"value\":9350,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:NavStart:C:desktop\",\"value\":9180,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":NavFirstPaintStart:D:desktop\",\"value\":9180,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:NavFirstPaintStart:C:desktop\",\"value\":9180,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:NavMainStart:D:desktop\",\"value\":9180,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:NavMainStart:C:desktop\",\"value\":9180,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:PreNav:D:desktop\",\"value\":2,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":PreNav:C:desktop\",\"value\":9182,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:UpNav:D:desktop\",\"value\":2,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:UpNav:C:desktop\",\"value\":9184,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:Logo:D:desktop\",\"value\":0,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:Logo:C:desktop\",\"value\":9184,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:Search:D:desktop\",\"value\":23,\"t\":21033}},{" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"csmcount\":{\"counter\":\"Nav:CSM:Latency:Search:C:desktop\",\"value\":9265,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:Tools:D:desktop\",\"value\":1,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:Tools:C:desktop\",\"value\":9266,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:HamburgerMenuIcon:D:desktop\",\"value\":1,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:HamburgerMenuIcon:C:desktop\",\"value\":9278,\"t\":21033}},{\"csmcount\":{\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"counter\":\"Nav:CSM:Latency:CrossShop:D:desktop\",\"value\":2,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:CrossShop:C:desktop\",\"value\":9280,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:SWM:D:desktop\",\"value\":0,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:SWM:C:desktop\",\"value\":9280,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:Subnav:D:desktop\",\"value\":1,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:Subnav:C:desktop\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		",\"value\":9282,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:NavBar:D:desktop\",\"value\":102,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:NavBar:C:desktop\",\"value\":9286,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:NavMainPaintEnd:D:desktop\",\"value\":9287,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:NavMainPaintEnd:C:desktop\",\"value\":9287,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:NavFirstPaintEnd:D:desktop\",\"value\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":9287,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:NavFirstPaintEnd:C:desktop\",\"value\":9287,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:NavMainEnd:D:desktop\",\"value\":9291,\"t\":21033}},{\"csmcount\":{\"counter\":\"Nav:CSM:Latency:NavMainEnd:C:desktop\",\"value\":9291,\"t\":21033}},{\"csmcount\":{\"counter\":\"nav-flyout-icp-attach-latency\",\"value\":11743,\"t\":21034}},{\"csmcount\":{\"counter\":\"nav-flyout-icp-footer-flyout-attach-latency\",\"value\":11747,\"" +
		"t\":21038}},{\"cel\":{\"n\":\"Navigation-desktop-navbar\",\"w\":1349,\"h\":149,\"d\":0,\"x\":0,\"y\":0,\"t\":21064,\"k\":\"ewi\",\"cl\":\"nav-sprite-v1 celwidget nav-bluebeacon nav-a11y-t1 bold-focus-hover layout2 nav-flex layout3 layout3-alt nav-packard-glow hamburger nav-progressive-attribute\"}},{\"cel\":{\"n\":\"acsux-widgets_content-grid_merchandised-search-2\",\"w\":1101,\"h\":357.5,\"d\":0,\"x\":230,\"y\":164,\"t\":21064,\"k\":\"ewi\",\"cl\":\"acswidget acswidget-content-grid celwidget IN " +
		"bxw-content-grid bxw-content-grid--ember bxc-grid--padding bxc-grid--spacing-large  bxc-grid--dark\"}},{\"cel\":{\"n\":\"acsux-widgets_content-grid_merchandised-search-2_row1-col1\",\"w\":1101,\"h\":282.578125,\"d\":0,\"x\":230,\"y\":164,\"t\":21064,\"k\":\"ewi\",\"cl\":\"bxc-grid__content   bxc-grid__content--dark celwidget\"}},{\"cel\":{\"n\":\"acsux-widgets_content-grid_merchandised-search-2_row2-col1\",\"w\":1101,\"h\":74.921875,\"d\":0,\"x\":230,\"y\":446.578125,\"t\":21064,\"k\":\"ewi\",\"" +
		"cl\":\"bxc-grid__content   bxc-grid__content--dark celwidget\"}},{\"cel\":{\"n\":\"acsux-widgets_content-grid_merchandised-search-3\",\"w\":1101,\"h\":110.09375,\"d\":0,\"x\":230,\"y\":543.5,\"t\":21064,\"k\":\"ewi\",\"cl\":\"acswidget acswidget-content-grid celwidget IN bxw-content-grid bxw-content-grid--ember bxc-grid--padding bxc-grid--spacing-large  bxc-grid--light\"}},{\"cel\":{\"n\":\"acsux-widgets_content-grid_merchandised-search-3_row1-col1\",\"w\":1101,\"h\":110.09375,\"d\":0,\"x\":230,\"" +
		"y\":543.5,\"t\":21064,\"k\":\"ewi\",\"cl\":\"bxc-grid__content   bxc-grid__content--light celwidget\"}},{\"cel\":{\"n\":\"sobe_d_b_4\",\"w\":1101,\"h\":268.328125,\"d\":0,\"x\":230,\"y\":675.59375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e csm-widget-ref-QAHzEditorial_en_IN csm-pageid-6648217031 csm-widget-type-horizontaleditorial\"}},{\"cel\":{\"n\":\"sobe_d_b_4_1\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":270,\"" +
		"y\":729.59375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e_1 csm-widget-ref-QAHzEditorial_en_IN_1 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_4_2\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":428.5,\"y\":729.59375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e_2 " +
		"csm-widget-ref-QAHzEditorial_en_IN_2 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_4_3\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":587,\"y\":729.59375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e_3 csm-widget-ref-QAHzEditorial_en_IN_3 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"" +
		"sobe_d_b_4_4\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":745.5,\"y\":729.59375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e_4 csm-widget-ref-QAHzEditorial_en_IN_4 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_4_5\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":904,\"y\":729.59375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card " +
		"celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e_5 csm-widget-ref-QAHzEditorial_en_IN_5 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_4_6\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":1062.5,\"y\":729.59375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-bcfd1cde-700f-4995-b680-ebfbcb2dab1e_6 csm-widget-ref-QAHzEditorial_en_IN_6 csm-pageid-6648217031 " +
		"csm-widget-type-horizontaleditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_5\",\"w\":1101,\"h\":288.328125,\"d\":0,\"x\":230,\"y\":943.921875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-143a0229-3130-4c09-a944-73972faa7cdb csm-widget-ref-QAHzEditorial_en_IN csm-pageid-6648217031 csm-widget-type-horizontaleditorial\"}},{\"cel\":{\"n\":\"sobe_d_b_5_1\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":270,\"y\":997.921875,\"t\":21064,\"k\":\"ewi\"," +
		"\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-143a0229-3130-4c09-a944-73972faa7cdb_1 csm-widget-ref-QAHzEditorial_en_IN_1 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_5_2\",\"w\":139.859375,\"h\":204.328125,\"d\":0,\"x\":460.203125,\"y\":997.921875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-143a0229-3130-4c09-a944-73972faa7cdb_2 csm-widget-ref-QAHzEditorial_en_IN_2 " +
		"csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_5_3\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":650.40625,\"y\":997.921875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-143a0229-3130-4c09-a944-73972faa7cdb_3 csm-widget-ref-QAHzEditorial_en_IN_3 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_5_4\",\"w\":139.859375,\"h\"" +
		":184.328125,\"d\":0,\"x\":840.609375,\"y\":997.921875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-143a0229-3130-4c09-a944-73972faa7cdb_4 csm-widget-ref-QAHzEditorial_en_IN_4 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_5_5\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":1030.8125,\"y\":997.921875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-143a0229-3130-4c09-a944-73972faa7cdb_5 csm-widget-ref-QAHzEditorial_en_IN_5 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_6\",\"w\":1101,\"h\":268.328125,\"d\":0,\"x\":230,\"y\":1232.25,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-6eb6ecc4-e8ed-4fb8-8ba0-fd73db982266 csm-widget-ref-QAHzEditorial_en_IN csm-pageid-6648217031 csm-widget-type-horizontaleditorial\"}},{\"cel\":{\"n\"" +
		":\"sobe_d_b_6_1\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":270,\"y\":1286.25,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6eb6ecc4-e8ed-4fb8-8ba0-fd73db982266_1 csm-widget-ref-QAHzEditorial_en_IN_1 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_6_2\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":428.5,\"y\":1286.25,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card " +
		"celwidget csm-placement-id-6eb6ecc4-e8ed-4fb8-8ba0-fd73db982266_2 csm-widget-ref-QAHzEditorial_en_IN_2 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_6_3\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":587,\"y\":1286.25,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6eb6ecc4-e8ed-4fb8-8ba0-fd73db982266_3 csm-widget-ref-QAHzEditorial_en_IN_3 csm-pageid-6648217031 " +
		"csm-widget-type-horizontaleditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_6_4\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":745.5,\"y\":1286.25,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6eb6ecc4-e8ed-4fb8-8ba0-fd73db982266_4 csm-widget-ref-QAHzEditorial_en_IN_4 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_6_5\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":904,\"y" +
		"\":1286.25,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6eb6ecc4-e8ed-4fb8-8ba0-fd73db982266_5 csm-widget-ref-QAHzEditorial_en_IN_5 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_6_6\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":1062.5,\"y\":1286.25,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6eb6ecc4-e8ed-4fb8-8ba0-fd73db982266_6 " +
		"csm-widget-ref-QAHzEditorial_en_IN_6 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_6_7\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":1221,\"y\":1286.25,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6eb6ecc4-e8ed-4fb8-8ba0-fd73db982266_7 csm-widget-ref-QAHzEditorial_en_IN_7 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-7\"}},{\"cel\":{\"n\":\"sobe_d_b_6_8" +
		"\",\"w\":139.859375,\"h\":184.328125,\"d\":1,\"x\":1379.5,\"y\":1286.25,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6eb6ecc4-e8ed-4fb8-8ba0-fd73db982266_8 csm-widget-ref-QAHzEditorial_en_IN_8 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-8\"}},{\"cel\":{\"n\":\"sobe_d_b_6_9\",\"w\":139.859375,\"h\":184.328125,\"d\":1,\"x\":1538,\"y\":1286.25,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-6eb6ecc4-e8ed-4fb8-8ba0-fd73db982266_9 csm-widget-ref-QAHzEditorial_en_IN_9 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-9\"}},{\"cel\":{\"n\":\"sobe_d_b_7\",\"w\":1101,\"h\":322.15625,\"d\":0,\"x\":230,\"y\":1500.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-e8f75a8d-7ecd-42ae-9e98-fc5b9ec3aeea csm-widget-ref-QANav11CTA_en_IN csm-pageid-6648217031 csm-widget-type-navigationeditorial\"}},{\"cel\":{\"n\"" +
		":\"sobe_d_b_7_1\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":270,\"y\":1554.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-e8f75a8d-7ecd-42ae-9e98-fc5b9ec3aeea_1 csm-widget-ref-QANav11CTA_en_IN_1 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_7_2\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":442.4375,\"y\":1554.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card " +
		"celwidget csm-placement-id-e8f75a8d-7ecd-42ae-9e98-fc5b9ec3aeea_2 csm-widget-ref-QANav11CTA_en_IN_2 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_7_3\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":614.875,\"y\":1554.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-e8f75a8d-7ecd-42ae-9e98-fc5b9ec3aeea_3 csm-widget-ref-QANav11CTA_en_IN_3 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_7_4\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":787.3125,\"y\":1554.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-e8f75a8d-7ecd-42ae-9e98-fc5b9ec3aeea_4 csm-widget-ref-QANav11CTA_en_IN_4 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_7_5\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":959.75" +
		",\"y\":1554.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-e8f75a8d-7ecd-42ae-9e98-fc5b9ec3aeea_5 csm-widget-ref-QANav11CTA_en_IN_5 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_7_6\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":1132.1875,\"y\":1554.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-e8f75a8d-7ecd-42ae-9e98-fc5b9ec3aeea_6 " +
		"csm-widget-ref-QANav11CTA_en_IN_6 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_8\",\"w\":1101,\"h\":322.15625,\"d\":0,\"x\":230,\"y\":1822.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-ee4283ed-8118-401a-9674-643270d825ae csm-widget-ref-QANav11CTA_en_IN csm-pageid-6648217031 csm-widget-type-navigationeditorial\"}},{\"cel\":{\"n\":\"sobe_d_b_8_1\",\"w\":158.734375,\"h\":238.15625,\"d\":0," +
		"\"x\":270,\"y\":1876.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-ee4283ed-8118-401a-9674-643270d825ae_1 csm-widget-ref-QANav11CTA_en_IN_1 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_8_2\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":442.4375,\"y\":1876.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-ee4283ed-8118-401a-9674-643270d825ae_2 csm-widget-ref-QANav11CTA_en_IN_2 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_8_3\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":614.875,\"y\":1876.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-ee4283ed-8118-401a-9674-643270d825ae_3 csm-widget-ref-QANav11CTA_en_IN_3 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_8_4\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":787.3125,\"y\":1876.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-ee4283ed-8118-401a-9674-643270d825ae_4 csm-widget-ref-QANav11CTA_en_IN_4 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_8_5\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":959.75" +
		",\"y\":1876.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-ee4283ed-8118-401a-9674-643270d825ae_5 csm-widget-ref-QANav11CTA_en_IN_5 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_8_6\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":1132.1875,\"y\":1876.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-ee4283ed-8118-401a-9674-643270d825ae_6 " +
		"csm-widget-ref-QANav11CTA_en_IN_6 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_9\",\"w\":1101,\"h\":322.15625,\"d\":0,\"x\":230,\"y\":2144.890625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-5c4db598-98b2-4bcb-bcd6-4f052d4395bf csm-widget-ref-QANav11CTA_en_IN csm-pageid-6648217031 csm-widget-type-navigationeditorial\"}},{\"cel\":{\"n\":\"sobe_d_b_9_1\",\"w\":158.734375,\"h\":238.15625,\"d\":0," +
		"\"x\":270,\"y\":2198.890625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-5c4db598-98b2-4bcb-bcd6-4f052d4395bf_1 csm-widget-ref-QANav11CTA_en_IN_1 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_9_2\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":442.4375,\"y\":2198.890625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-5c4db598-98b2-4bcb-bcd6-4f052d4395bf_2 csm-widget-ref-QANav11CTA_en_IN_2 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_9_3\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":614.875,\"y\":2198.890625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-5c4db598-98b2-4bcb-bcd6-4f052d4395bf_3 csm-widget-ref-QANav11CTA_en_IN_3 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_9_4\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":787.3125,\"y\":2198.890625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-5c4db598-98b2-4bcb-bcd6-4f052d4395bf_4 csm-widget-ref-QANav11CTA_en_IN_4 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_9_5\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":959.75" +
		",\"y\":2198.890625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-5c4db598-98b2-4bcb-bcd6-4f052d4395bf_5 csm-widget-ref-QANav11CTA_en_IN_5 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_9_6\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":1132.1875,\"y\":2198.890625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-5c4db598-98b2-4bcb-bcd6-4f052d4395bf_6 " +
		"csm-widget-ref-QANav11CTA_en_IN_6 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_10\",\"w\":1101,\"h\":322.15625,\"d\":0,\"x\":230,\"y\":2467.046875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-9cb09930-2ff7-4de9-b1fb-29217a186d6e csm-widget-ref-QANav11CTA_en_IN csm-pageid-6648217031 csm-widget-type-navigationeditorial\"}},{\"cel\":{\"n\":\"sobe_d_b_10_1\",\"w\":158.734375,\"h\":238.15625,\"d\":0" +
		",\"x\":270,\"y\":2521.046875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-9cb09930-2ff7-4de9-b1fb-29217a186d6e_1 csm-widget-ref-QANav11CTA_en_IN_1 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_10_2\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":442.4375,\"y\":2521.046875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-9cb09930-2ff7-4de9-b1fb-29217a186d6e_2 csm-widget-ref-QANav11CTA_en_IN_2 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_10_3\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":614.875,\"y\":2521.046875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-9cb09930-2ff7-4de9-b1fb-29217a186d6e_3 csm-widget-ref-QANav11CTA_en_IN_3 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_10_4\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":787.3125,\"y\":2521.046875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-9cb09930-2ff7-4de9-b1fb-29217a186d6e_4 csm-widget-ref-QANav11CTA_en_IN_4 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_10_5\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\"" +
		":959.75,\"y\":2521.046875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-9cb09930-2ff7-4de9-b1fb-29217a186d6e_5 csm-widget-ref-QANav11CTA_en_IN_5 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_10_6\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":1132.1875,\"y\":2521.046875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-9cb09930-2ff7-4de9-b1fb-29217a186d6e_6 csm-widget-ref-QANav11CTA_en_IN_6 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_11\",\"w\":1101,\"h\":393.21875,\"d\":0,\"x\":230,\"y\":2789.203125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-7e5257c8-9d18-4c5d-8fb3-ba12a59e3a9b csm-widget-ref-QAQuad11CTA_en_IN csm-pageid-6648217031 csm-widget-type-quadcardeditorial\"}},{\"cel\":{\"n\":\"" +
		"sobe_d_b_11_1\",\"w\":244.75,\"h\":289.21875,\"d\":0,\"x\":270,\"y\":2843.203125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-7e5257c8-9d18-4c5d-8fb3-ba12a59e3a9b_1 csm-widget-ref-QAQuad11CTA_en_IN_1 csm-pageid-6648217031 csm-widget-type-quadcardeditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_11_2\",\"w\":244.75,\"h\":289.21875,\"d\":0,\"x\":528.734375,\"y\":2843.203125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget" +
		" csm-placement-id-7e5257c8-9d18-4c5d-8fb3-ba12a59e3a9b_2 csm-widget-ref-QAQuad11CTA_en_IN_2 csm-pageid-6648217031 csm-widget-type-quadcardeditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_11_3\",\"w\":244.75,\"h\":289.21875,\"d\":0,\"x\":787.46875,\"y\":2843.203125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-7e5257c8-9d18-4c5d-8fb3-ba12a59e3a9b_3 csm-widget-ref-QAQuad11CTA_en_IN_3 csm-pageid-6648217031 csm-widget-type-quadcardeditorial-tile" +
		" csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_11_4\",\"w\":244.75,\"h\":309.21875,\"d\":0,\"x\":1046.203125,\"y\":2843.203125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-7e5257c8-9d18-4c5d-8fb3-ba12a59e3a9b_4 csm-widget-ref-QAQuad11CTA_en_IN_4 csm-pageid-6648217031 csm-widget-type-quadcardeditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_12\",\"w\":1101,\"h\":268.328125,\"d\":0,\"x\":230,\"y\":3182.421875,\"t\":21064,\"k\":\"ewi\",\"cl" +
		"\":\"sl-sobe-card-desktop celwidget csm-placement-id-42c62051-ae25-4131-b0da-974554a34a71 csm-widget-ref-QAHzEditorial_en_IN csm-pageid-6648217031 csm-widget-type-horizontaleditorial\"}},{\"cel\":{\"n\":\"sobe_d_b_12_1\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":270,\"y\":3236.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-42c62051-ae25-4131-b0da-974554a34a71_1 csm-widget-ref-QAHzEditorial_en_IN_1 csm-pageid-6648217031 " +
		"csm-widget-type-horizontaleditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_12_2\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":428.5,\"y\":3236.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-42c62051-ae25-4131-b0da-974554a34a71_2 csm-widget-ref-QAHzEditorial_en_IN_2 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_12_3\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\"" +
		":587,\"y\":3236.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-42c62051-ae25-4131-b0da-974554a34a71_3 csm-widget-ref-QAHzEditorial_en_IN_3 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_12_4\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":745.5,\"y\":3236.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-42c62051-ae25-4131-b0da-974554a34a71_4 csm-widget-ref-QAHzEditorial_en_IN_4 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_12_5\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":904,\"y\":3236.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-42c62051-ae25-4131-b0da-974554a34a71_5 csm-widget-ref-QAHzEditorial_en_IN_5 csm-pageid-6648217031 " +
		"csm-widget-type-horizontaleditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_12_6\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\":1062.5,\"y\":3236.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-42c62051-ae25-4131-b0da-974554a34a71_6 csm-widget-ref-QAHzEditorial_en_IN_6 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_12_7\",\"w\":139.859375,\"h\":184.328125,\"d\":0,\"x\"" +
		":1221,\"y\":3236.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-42c62051-ae25-4131-b0da-974554a34a71_7 csm-widget-ref-QAHzEditorial_en_IN_7 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-7\"}},{\"cel\":{\"n\":\"sobe_d_b_12_8\",\"w\":139.859375,\"h\":184.328125,\"d\":1,\"x\":1379.5,\"y\":3236.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-42c62051-ae25-4131-b0da-974554a34a71_8 csm-widget-ref-QAHzEditorial_en_IN_8 csm-pageid-6648217031 csm-widget-type-horizontaleditorial-tile csm-widget-tile-8\"}},{\"cel\":{\"n\":\"sobe_d_b_12_9\",\"w\":139.859375,\"h\":184.328125,\"d\":1,\"x\":1538,\"y\":3236.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-42c62051-ae25-4131-b0da-974554a34a71_9 csm-widget-ref-QAHzEditorial_en_IN_9 csm-pageid-6648217031 " +
		"csm-widget-type-horizontaleditorial-tile csm-widget-tile-9\"}},{\"cel\":{\"n\":\"sobe_d_b_13\",\"w\":1101,\"h\":600.3125,\"d\":0,\"x\":230,\"y\":3450.75,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa csm-widget-ref-QAHzEditorial_en_IN csm-pageid-6648217031 csm-widget-type-navigationeditorial\"}},{\"cel\":{\"n\":\"sobe_d_b_13_1\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\":270,\"y\":3504.75,\"t\":21064,\"k\":\"ewi\",\"cl\"" +
		":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa_1 csm-widget-ref-QAHzEditorial_en_IN_1 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_13_2\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":442.4375,\"y\":3504.75,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa_2 csm-widget-ref-QAHzEditorial_en_IN_2 " +
		"csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_13_3\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":614.875,\"y\":3504.75,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa_3 csm-widget-ref-QAHzEditorial_en_IN_3 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_13_4\",\"w\":158.734375,\"h\"" +
		":238.15625,\"d\":0,\"x\":787.3125,\"y\":3504.75,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa_4 csm-widget-ref-QAHzEditorial_en_IN_4 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_13_5\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":959.75,\"y\":3504.75,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa_5 csm-widget-ref-QAHzEditorial_en_IN_5 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_13_6\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":1132.1875,\"y\":3504.75,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa_6 csm-widget-ref-QAHzEditorial_en_IN_6 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_13_7\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":270,\"y\":3762.90625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa_7 csm-widget-ref-QAHzEditorial_en_IN_7 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-7\"}},{\"cel\":{\"n\":\"sobe_d_b_13_8\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\"" +
		":442.4375,\"y\":3762.90625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa_8 csm-widget-ref-QAHzEditorial_en_IN_8 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-8\"}},{\"cel\":{\"n\":\"sobe_d_b_13_9\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":614.875,\"y\":3762.90625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa_9 csm-widget-ref-QAHzEditorial_en_IN_9 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-9\"}},{\"cel\":{\"n\":\"sobe_d_b_13_10\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\":787.3125,\"y\":3762.90625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa_10 csm-widget-ref-QAHzEditorial_en_IN_10 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-10\"}},{\"cel\":{\"n\":\"sobe_d_b_13_11\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":959.75,\"y\":3762.90625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa_11 csm-widget-ref-QAHzEditorial_en_IN_11 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-11\"}},{\"cel\":{\"n\":\"sobe_d_b_13_12\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x" +
		"\":1132.1875,\"y\":3762.90625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-41c02473-3a3b-4c27-8e13-58da2a543ffa_12 csm-widget-ref-QAHzEditorial_en_IN_12 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-12\"}},{\"cel\":{\"n\":\"sobe_d_b_14\",\"w\":1101,\"h\":345.140625,\"d\":0,\"x\":230,\"y\":4051.0625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-5cc46178-23b7-47a7-b3db-db5eeca91e4e " +
		"csm-widget-ref-QAHzEditorial_en_IN csm-pageid-6648217031 csm-widget-type-navigationeditorial\"}},{\"cel\":{\"n\":\"sobe_d_b_14_1\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":270,\"y\":4105.0625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-5cc46178-23b7-47a7-b3db-db5eeca91e4e_1 csm-widget-ref-QAHzEditorial_en_IN_1 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_14_2\",\"w\":158.734375,\"h" +
		"\":238.15625,\"d\":0,\"x\":442.4375,\"y\":4105.0625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-5cc46178-23b7-47a7-b3db-db5eeca91e4e_2 csm-widget-ref-QAHzEditorial_en_IN_2 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_14_3\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":614.875,\"y\":4105.0625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-5cc46178-23b7-47a7-b3db-db5eeca91e4e_3 csm-widget-ref-QAHzEditorial_en_IN_3 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_14_4\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":787.3125,\"y\":4105.0625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-5cc46178-23b7-47a7-b3db-db5eeca91e4e_4 csm-widget-ref-QAHzEditorial_en_IN_4 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_14_5\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":959.75,\"y\":4105.0625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-5cc46178-23b7-47a7-b3db-db5eeca91e4e_5 csm-widget-ref-QAHzEditorial_en_IN_5 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_14_6\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\"" +
		":1132.1875,\"y\":4105.0625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-5cc46178-23b7-47a7-b3db-db5eeca91e4e_6 csm-widget-ref-QAHzEditorial_en_IN_6 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_14_7\",\"w\":158.734375,\"h\":238.15625,\"d\":1,\"x\":1304.625,\"y\":4105.0625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-5cc46178-23b7-47a7-b3db-db5eeca91e4e_7 csm-widget-ref-QAHzEditorial_en_IN_7 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-7\"}},{\"cel\":{\"n\":\"sobe_d_b_14_8\",\"w\":158.734375,\"h\":238.15625,\"d\":1,\"x\":1477.0625,\"y\":4105.0625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-5cc46178-23b7-47a7-b3db-db5eeca91e4e_8 csm-widget-ref-QAHzEditorial_en_IN_8 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-8\"}},{\"cel\":{\"n\":\"sobe_d_b_14_9\",\"w\":158.734375,\"h\":238.15625,\"d\":1,\"x\":1649.5,\"y\":4105.0625,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-5cc46178-23b7-47a7-b3db-db5eeca91e4e_9 csm-widget-ref-QAHzEditorial_en_IN_9 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-9\"}},{\"cel\":{\"n\":\"sobe_d_b_15\",\"w\":1101,\"h\":373.21875,\"d\":0,\"x\":230,\"y\"" +
		":4396.203125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-0f15bbbe-a203-4edf-a4a2-faad0191f4cd csm-widget-ref-QAQuad11CTA_en_IN csm-pageid-6648217031 csm-widget-type-quadcardeditorial\"}},{\"cel\":{\"n\":\"sobe_d_b_15_1\",\"w\":244.75,\"h\":289.21875,\"d\":0,\"x\":270,\"y\":4450.203125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-0f15bbbe-a203-4edf-a4a2-faad0191f4cd_1 csm-widget-ref-QAQuad11CTA_en_IN_1 " +
		"csm-pageid-6648217031 csm-widget-type-quadcardeditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_15_2\",\"w\":244.75,\"h\":289.21875,\"d\":0,\"x\":528.734375,\"y\":4450.203125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-0f15bbbe-a203-4edf-a4a2-faad0191f4cd_2 csm-widget-ref-QAQuad11CTA_en_IN_2 csm-pageid-6648217031 csm-widget-type-quadcardeditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_15_3\",\"w\":244.75,\"h\":289.21875,\"d\"" +
		":0,\"x\":787.46875,\"y\":4450.203125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-0f15bbbe-a203-4edf-a4a2-faad0191f4cd_3 csm-widget-ref-QAQuad11CTA_en_IN_3 csm-pageid-6648217031 csm-widget-type-quadcardeditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_15_4\",\"w\":244.75,\"h\":289.21875,\"d\":0,\"x\":1046.203125,\"y\":4450.203125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-0f15bbbe-a203-4edf-a4a2-faad0191f4cd_4 csm-widget-ref-QAQuad11CTA_en_IN_4 csm-pageid-6648217031 csm-widget-type-quadcardeditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_16\",\"w\":1101,\"h\":600.3125,\"d\":0,\"x\":230,\"y\":4769.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146 csm-widget-ref-QAHzEditorial_en_IN csm-pageid-6648217031 csm-widget-type-navigationeditorial\"}},{\"cel\":{\"n\":" +
		"\"sobe_d_b_16_1\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":270,\"y\":4823.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146_1 csm-widget-ref-QAHzEditorial_en_IN_1 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_16_2\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":442.4375,\"y\":4823.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"" +
		"sl-sobe-carousel-sub-card celwidget csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146_2 csm-widget-ref-QAHzEditorial_en_IN_2 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_16_3\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\":614.875,\"y\":4823.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146_3 csm-widget-ref-QAHzEditorial_en_IN_3 " +
		"csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_16_4\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\":787.3125,\"y\":4823.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146_4 csm-widget-ref-QAHzEditorial_en_IN_4 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_16_5\",\"w\":158.734375,\"h\"" +
		":238.15625,\"d\":0,\"x\":959.75,\"y\":4823.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146_5 csm-widget-ref-QAHzEditorial_en_IN_5 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_16_6\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":1132.1875,\"y\":4823.421875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146_6 csm-widget-ref-QAHzEditorial_en_IN_6 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_16_7\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":270,\"y\":5081.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146_7 csm-widget-ref-QAHzEditorial_en_IN_7 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-7\"}},{\"cel\":{\"n\":\"sobe_d_b_16_8\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\":442.4375,\"y\":5081.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146_8 csm-widget-ref-QAHzEditorial_en_IN_8 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-8\"}},{\"cel\":{\"n\":\"sobe_d_b_16_9\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\"" +
		":614.875,\"y\":5081.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146_9 csm-widget-ref-QAHzEditorial_en_IN_9 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-9\"}},{\"cel\":{\"n\":\"sobe_d_b_16_10\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":787.3125,\"y\":5081.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146_10 csm-widget-ref-QAHzEditorial_en_IN_10 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-10\"}},{\"cel\":{\"n\":\"sobe_d_b_16_11\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":959.75,\"y\":5081.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146_11 csm-widget-ref-QAHzEditorial_en_IN_11 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-11\"}},{\"cel\":{\"n\":\"sobe_d_b_16_12\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":1132.1875,\"y\":5081.578125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-38375dd1-dc1c-4f4a-b3b4-68be172f7146_12 csm-widget-ref-QAHzEditorial_en_IN_12 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-12\"}},{\"cel\":{\"n\":\"sobe_d_b_17\",\"w\":1101,\"h\":365.140625,\"d\":0,\"x\"" +
		":230,\"y\":5369.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-266063af-cae4-4ef5-80ad-8747f4febdcd csm-widget-ref-QAHzEditorial_en_IN csm-pageid-6648217031 csm-widget-type-navigationeditorial\"}},{\"cel\":{\"n\":\"sobe_d_b_17_1\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\":270,\"y\":5423.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-266063af-cae4-4ef5-80ad-8747f4febdcd_1 " +
		"csm-widget-ref-QAHzEditorial_en_IN_1 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_17_2\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\":442.4375,\"y\":5423.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-266063af-cae4-4ef5-80ad-8747f4febdcd_2 csm-widget-ref-QAHzEditorial_en_IN_2 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"" +
		"sobe_d_b_17_3\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\":614.875,\"y\":5423.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-266063af-cae4-4ef5-80ad-8747f4febdcd_3 csm-widget-ref-QAHzEditorial_en_IN_3 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_17_4\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":787.3125,\"y\":5423.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"" +
		"sl-sobe-carousel-sub-card celwidget csm-placement-id-266063af-cae4-4ef5-80ad-8747f4febdcd_4 csm-widget-ref-QAHzEditorial_en_IN_4 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_17_5\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":959.75,\"y\":5423.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-266063af-cae4-4ef5-80ad-8747f4febdcd_5 csm-widget-ref-QAHzEditorial_en_IN_5 " +
		"csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_17_6\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":1132.1875,\"y\":5423.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-266063af-cae4-4ef5-80ad-8747f4febdcd_6 csm-widget-ref-QAHzEditorial_en_IN_6 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_17_7\",\"w\":158.734375,\"h\"" +
		":238.15625,\"d\":1,\"x\":1304.625,\"y\":5423.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-266063af-cae4-4ef5-80ad-8747f4febdcd_7 csm-widget-ref-QAHzEditorial_en_IN_7 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-7\"}},{\"cel\":{\"n\":\"sobe_d_b_17_8\",\"w\":158.734375,\"h\":238.15625,\"d\":1,\"x\":1477.0625,\"y\":5423.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-266063af-cae4-4ef5-80ad-8747f4febdcd_8 csm-widget-ref-QAHzEditorial_en_IN_8 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-8\"}},{\"cel\":{\"n\":\"sobe_d_b_17_9\",\"w\":158.734375,\"h\":238.15625,\"d\":1,\"x\":1649.5,\"y\":5423.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-266063af-cae4-4ef5-80ad-8747f4febdcd_9 csm-widget-ref-QAHzEditorial_en_IN_9 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-9\"}},{\"cel\":{\"n\":\"sobe_d_b_17_10\",\"w\":158.734375,\"h\":238.15625,\"d\":1,\"x\":1821.9375,\"y\":5423.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-266063af-cae4-4ef5-80ad-8747f4febdcd_10 csm-widget-ref-QAHzEditorial_en_IN_10 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-10\"}},{\"cel\":{\"n\":\"sobe_d_b_17_11\",\"w\":158.734375,\"h\":238.15625,\"d\":1," +
		"\"x\":1994.375,\"y\":5423.734375,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-266063af-cae4-4ef5-80ad-8747f4febdcd_11 csm-widget-ref-QAHzEditorial_en_IN_11 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-11\"}},{\"cel\":{\"n\":\"sobe_d_b_19\",\"w\":1101,\"h\":600.3125,\"d\":0,\"x\":230,\"y\":5734.875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8 " +
		"csm-widget-ref-QAHzEditorial_en_IN csm-pageid-6648217031 csm-widget-type-navigationeditorial\"}},{\"cel\":{\"n\":\"sobe_d_b_19_1\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\":270,\"y\":5788.875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8_1 csm-widget-ref-QAHzEditorial_en_IN_1 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_19_2\",\"w\":158.734375,\"h\"" +
		":238.15625,\"d\":0,\"x\":442.4375,\"y\":5788.875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8_2 csm-widget-ref-QAHzEditorial_en_IN_2 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_19_3\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":614.875,\"y\":5788.875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8_3 csm-widget-ref-QAHzEditorial_en_IN_3 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_19_4\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\":787.3125,\"y\":5788.875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8_4 csm-widget-ref-QAHzEditorial_en_IN_4 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_19_5\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":959.75,\"y\":5788.875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8_5 csm-widget-ref-QAHzEditorial_en_IN_5 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_19_6\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\"" +
		":1132.1875,\"y\":5788.875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8_6 csm-widget-ref-QAHzEditorial_en_IN_6 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_19_7\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":270,\"y\":6047.03125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8_7 csm-widget-ref-QAHzEditorial_en_IN_7 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-7\"}},{\"cel\":{\"n\":\"sobe_d_b_19_8\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":442.4375,\"y\":6047.03125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8_8 csm-widget-ref-QAHzEditorial_en_IN_8 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-8\"}},{\"cel\":{\"n\":\"sobe_d_b_19_9\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\":614.875,\"y\":6047.03125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8_9 csm-widget-ref-QAHzEditorial_en_IN_9 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-9\"}},{\"cel\":{\"n\":\"sobe_d_b_19_10\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\"" +
		":787.3125,\"y\":6047.03125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8_10 csm-widget-ref-QAHzEditorial_en_IN_10 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-10\"}},{\"cel\":{\"n\":\"sobe_d_b_19_11\",\"w\":158.734375,\"h\":258.15625,\"d\":0,\"x\":959.75,\"y\":6047.03125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8_11 csm-widget-ref-QAHzEditorial_en_IN_11 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-11\"}},{\"cel\":{\"n\":\"sobe_d_b_19_12\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":1132.1875,\"y\":6047.03125,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-74a5ed39-1744-47f2-a50e-c1e19d0cf1b8_12 csm-widget-ref-QAHzEditorial_en_IN_12 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-12\"}},{\"cel\":{\"n\":\"sobe_d_b_20\",\"w\":1101,\"h\":345.140625,\"d\":0,\"x\":230,\"y\":6335.1875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-card-desktop celwidget csm-placement-id-6e615477-a784-4512-8c5d-64c344af99f1 csm-widget-ref-QAHzEditorial_en_IN csm-pageid-6648217031 csm-widget-type-navigationeditorial\"}},{\"cel\":{\"n\":\"sobe_d_b_20_1\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":270,\"y\":6389.1875,\"t\":21064,\"k\":\"ewi\"," +
		"\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6e615477-a784-4512-8c5d-64c344af99f1_1 csm-widget-ref-QAHzEditorial_en_IN_1 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-1\"}},{\"cel\":{\"n\":\"sobe_d_b_20_2\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":442.4375,\"y\":6389.1875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6e615477-a784-4512-8c5d-64c344af99f1_2 csm-widget-ref-QAHzEditorial_en_IN_2 " +
		"csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-2\"}},{\"cel\":{\"n\":\"sobe_d_b_20_3\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":614.875,\"y\":6389.1875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6e615477-a784-4512-8c5d-64c344af99f1_3 csm-widget-ref-QAHzEditorial_en_IN_3 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-3\"}},{\"cel\":{\"n\":\"sobe_d_b_20_4\",\"w\":158.734375,\"h\"" +
		":238.15625,\"d\":0,\"x\":787.3125,\"y\":6389.1875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6e615477-a784-4512-8c5d-64c344af99f1_4 csm-widget-ref-QAHzEditorial_en_IN_4 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-4\"}},{\"cel\":{\"n\":\"sobe_d_b_20_5\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":959.75,\"y\":6389.1875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget " +
		"csm-placement-id-6e615477-a784-4512-8c5d-64c344af99f1_5 csm-widget-ref-QAHzEditorial_en_IN_5 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-5\"}},{\"cel\":{\"n\":\"sobe_d_b_20_6\",\"w\":158.734375,\"h\":238.15625,\"d\":0,\"x\":1132.1875,\"y\":6389.1875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6e615477-a784-4512-8c5d-64c344af99f1_6 csm-widget-ref-QAHzEditorial_en_IN_6 csm-pageid-6648217031 " +
		"csm-widget-type-navigationeditorial-tile csm-widget-tile-6\"}},{\"cel\":{\"n\":\"sobe_d_b_20_7\",\"w\":158.734375,\"h\":238.15625,\"d\":1,\"x\":1304.625,\"y\":6389.1875,\"t\":21064,\"k\":\"ewi\",\"cl\":\"sl-sobe-carousel-sub-card celwidget csm-placement-id-6e615477-a784-4512-8c5d-64c344af99f1_7 csm-widget-ref-QAHzEditorial_en_IN_7 csm-pageid-6648217031 csm-widget-type-navigationeditorial-tile csm-widget-tile-7\"}},{\"cel\":{\"n\":\"nav_sitewide_msg\",\"w\":400,\"h\":39,\"d\":0,\"x\":949,\"y\":60," +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		"\"t\":21064,\"k\":\"ewi\",\"cl\":\"\"}},{\"cel\":{\"n\":\"osa_browse_banner_0\",\"w\":1101,\"h\":357.5,\"d\":0,\"x\":230,\"y\":164,\"t\":21064,\"k\":\"ewi\",\"cl\":\"bxc-grid__container bxc-grid__container--width-1500\"}},{\"cel\":{\"n\":\"osa_browse_banner_1\",\"w\":1101,\"h\":110.09375,\"d\":0,\"x\":230,\"y\":543.5,\"t\":21064,\"k\":\"ewi\",\"cl\":\"bxc-grid__container bxc-grid__container--width-1500\"}},{\"cel\":{\"k\":\"hrt\",\"t\":22365}},{\"cel\":{\"k\":\"hrt\",\"t\":22512}},{\"csm\":{\"k\"" +
// Suspected parametrization in next line. If true make sure to substitute {} with proper parameter braces on the parameter
		":\"chk\",\"f\":2,\"l\":{\"csmcount\":106,\"cel\":168,\"csm\":2,\"navigation\":2,\"jserr-rw\":1},\"s\":\"full\"}},{\"csmcount\":{\"counter\":\"foresterPayloadSize\",\"t\":0,\"value\":54359}}]}", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	_webresult = lrapi.web.revert_auto_header("Origin");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Site", 
		"cross-site");

	_webresult = lrapi.web.add_auto_header("Accept", 
		"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Dest", 
		"iframe");

	_webresult = lrapi.web.add_auto_header("Sec-Fetch-Mode", 
		"navigate");

	_webresult = lrapi.web.add_header("Upgrade-Insecure-Requests", 
		"1");

	_webresult = lrapi.web.url("iu3", 
		"URL=https://aax-eu.amazon-adsystem.com/s/iu3?d=amazon.in&slot=navFooter&a2=01019f401c53b1f002761af8d8af1b1aef8551021f939b53e34afffd75e71ddaf6ab&old_oo=0&ts=1622707252859&s=AQW9s58CUS5AWdd8Dj9B0sv7gGZNMy3ycShy8QgCE3dL&cb=1622707252859", new String[]{ 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://www.amazon.in/", 
		"Snapshot=t37.inf", 
		"Mode=HTML", 
		LAST})	// couldn't decode request from body. , couldn't decode response from body.%n
;

	}catch(Exception e){
		e.printStackTrace();
		return -1;
	}
	return 0;
    }

}