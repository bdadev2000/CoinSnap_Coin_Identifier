package com.safedk.android.internal;

import android.content.Context;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.facebook.internal.ServerProtocol;
import com.safedk.android.SafeDK;
import com.safedk.android.SafeDKApplication;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SafeDKWebAppInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29898a = "SafeDKWebAppInterface";

    /* renamed from: b, reason: collision with root package name */
    public static final String f29899b = "status";

    /* renamed from: c, reason: collision with root package name */
    public static final String f29900c = "playing";
    public static final String d = "paused";
    public static final String e = "end-card";

    /* renamed from: f, reason: collision with root package name */
    public static final String f29901f = "sdk_id";

    /* renamed from: g, reason: collision with root package name */
    public static final String f29902g = "address";

    /* renamed from: h, reason: collision with root package name */
    public static final String f29903h = "javascript:";

    /* renamed from: i, reason: collision with root package name */
    public static final String f29904i = "(function(){var isMainFrame=function(){return window.location===window.parent.location};var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"[video_observer] \"+sdkId+\" \"+address+\" \"+message)}else{console.log(\"SafeDKWebApInterface video_observer safedkDebug object missing\")}}catch(error){}};var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var applovinEndCardDetected=false;var isElementInEventHidden=function(event){return isHidden(event.srcElement)};var getVideoPathWithElement=function(videoElement){try{if(videoElement==null||videoElement.tagName!=\"VIDEO\")return null;var path=videoElement.src;if(!path){var sourceNodes=videoElement.getElementsByTagName(\"SOURCE\");for(var sourceNode of sourceNodes){if(sourceNode.src){path=sourceNode.src;break}}}if(path){if(path.length>=200){path=path.substring(0,199)}}return path}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}return null};var getVideoPath=function(event){try{var videoElement=event.srcElement;if(videoElement==null||videoElement.tagName!=\"VIDEO\")return null;var path=getVideoPathWithElement(videoElement);return path}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}return null};var isEndCardDetected=function(){return applovinEndCardDetected||unityEndCardDetected};var notifyPlayWithVideoElement=function(videoElement){if(!isEndCardDetected()){if(isHidden(videoElement))return;videoElement.safedkVideoPlaying=true;var message={status:\"playing\",sdk_id:sdkId};var src=getVideoPathWithElement(videoElement);if(src)message[\"src\"]=src;log(\"Notifying client that video is playing for sdkId: \"+sdkId+\", video ID: \"+videoElement.id);if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface video_observer safedkVideo object missing\")}}};var notifyPlay=function(event){var videoElement=event.srcElement;notifyPlayWithVideoElement(videoElement)};var notifyPause=function(event){if(!isEndCardDetected()){event.srcElement.safedkVideoPlaying=false;var message={status:\"paused\",sdk_id:sdkId,address:address};var src=getVideoPath(event);if(src)message[\"src\"]=src;log(\"Notifying client that video is paused for sdkId: \"+sdkId+\", video ID: \"+event.srcElement.id);if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface video_observer safedkVideo object missing\")}}};var notifyAppLovinEndCard=function(){if(!applovinEndCardDetected){applovinEndCardDetected=true;log(\"Notifying client that end-card detected for sdkId: \"+sdkId);var message={status:\"end-card\",sdk_id:sdkId,address:address};if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface video_observer safedkVideo object missing\")}}};var addVideoListeners=function(doc){try{if(doc.nodeName==\"#text\")return;var videoElements=doc.getElementsByTagName(\"VIDEO\");if(videoElements.length==0){if(doc.tagName&&doc.tagName==\"VIDEO\"){videoElements=[doc]}}for(i=0;i<videoElements.length;i++){var videoElement=videoElements[i];if(videoElement.safedkVideoPlaying==null){log(\"Found VIDEO tag, adding event listeners. sdkId: \"+sdkId+\", video ID: \"+videoElement.id);if(videoElement.currentTime>0){notifyPlayWithVideoElement(videoElement);videoElement.safedkVideoPlaying=true}else{videoElement.safedkVideoPlaying=false}videoElement.addEventListener(\"play\",notifyPlay);videoElement.addEventListener(\"pause\",notifyPause)}}}catch(error){}};var unityEndCardFound=false;var addUnityEndCardObserver=function(){try{if(!unityEndCardFound){log(\"attempting to find end-screen-adapter\");var endCardElement=document.getElementById(\"end-screen-adapter\");if(endCardElement&&endCardElement.style&&endCardElement.style.visibility){unityEndCardFound=true;log(\"found end-screen-adapter\");var endCardElement_style_visibility=endCardElement.style.visibility;if(endCardElement_style_visibility==\"visible\"){notifyUnityEndCard()}else{try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(getComputedStyle(mutation.target).visibility==\"visible\"){notifyUnityEndCard()}break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\"]};observer.observe(endCardElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}}}}}catch(error){log(\"caught exception with error = \"+error);if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}};var unityEndCardDetected=false;var notifyUnityEndCard=function(){if(!unityEndCardDetected){unityEndCardDetected=true;log(\"Notifying client that unity end-card detected for sdkId: \"+sdkId);var message={status:\"end-card\",sdk_id:sdkId,address:address};if(typeof window.webkit.messageHandlers.safedkVideo.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideo.postMessage(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface video_observer safedkVideo object missing\")}}};var appLovinNewTemplateEndCardObserver=function(){try{var rootElements=document.getElementsByClassName(\"root\");if(rootElements){var rootElement=rootElements[0];if(rootElement){var divElements=rootElement.getElementsByTagName(\"div\");if(divElements){for(var element of divElements){if(element.style){var style=element.style;var isBackground=style.background&&(style.background==\"rgb(32, 32, 32)\"||style.background.includes(\"rgba(32, 32, 32\"));var isDisplay=style.display&&style.display==\"flex\";if(isBackground&&isDisplay){log(\"New applovin template. endcard is displaying\");notifyAppLovinEndCard()}}}}}}}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}};var addApplovinEndCardObserver=function(){try{var endCardElement=document.getElementById(\"al_endCardDiv\");if(endCardElement){var computedStyle=getComputedStyle(endCardElement);if(computedStyle&&computedStyle.display==\"flex\"){log(\"Found visible al_endCardDiv tag. sdkId: \"+sdkId);notifyAppLovinEndCard()}else{if(endCardElement.safedkEndCardObserver!=true){endCardElement.safedkEndCardObserver=true;log(\"Found al_endCardDiv tag, adding end-card observer. sdkId: \"+sdkId);try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":computedStyle=getComputedStyle(mutation.target);if(computedStyle&&computedStyle.display==\"flex\"){notifyAppLovinEndCard()}break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\"]};observer.observe(endCardElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}}}}}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}};var isHidden=function(element){try{while(element){if(getComputedStyle(element).display==\"none\")return true;element=element.parentElement}}catch(error){log(\"isHidden caught error: \"+error)}return false};function traverseIframes(iframeDocument,level=0){try{if(level>99){return}var iframes=iframeDocument.getElementsByTagName(\"iframe\");for(var i=0;i<iframes.length;i++){var iframe=iframes[i];if(isHidden(iframe)){continue}var iframeDoc=iframe.contentDocument||iframe.contentWindow.document;if(iframeDoc){traverseIframes(iframeDoc,level+1)}}}catch(e){log(\"caught exception = \"+e)}try{addVideoListeners(iframeDocument);if(iframeDocument.safedkDocRemovedNodesObserved!=true){iframeDocument.safedkDocRemovedNodesObserved=true;var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var node of mutation.removedNodes){if(node.tagName){var removedVideoElements=node.getElementsByTagName(\"VIDEO\");for(var removedVideoElement of removedVideoElements){if(removedVideoElement.safedkVideoPlaying){var event={srcElement:removedVideoElement};notifyPause(event)}}}}})});var config={childList:true,subtree:true};observer.observe(iframeDocument,config)}}catch(error){log(\"caught exception = \"+e)}}var shouldTraverseIframes=\"{{shouldTraverseIframes}}\";if(shouldTraverseIframes==\"true\"){traverseIframes(document)}else{addVideoListeners(document);try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var node of mutation.addedNodes){log(\"Add video listeners for added elements: \"+node);addVideoListeners(node)}for(var node of mutation.removedNodes){if(node.tagName){var removedVideoElements=node.getElementsByTagName(\"VIDEO\");for(var removedVideoElement of removedVideoElements){if(removedVideoElement.safedkVideoPlaying){log(\"VIDEO tag removed. Calling notifyPause\");var event={srcElement:removedVideoElement};notifyPause(event)}}}}})});var config={childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkVideoExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkVideoExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface video_observer safedkVideoExc object missing\")}}}})();\n";

    /* renamed from: j, reason: collision with root package name */
    public static final String f29905j = "(function(){var webviewAddress=\"{{webviewAddress}}\";var sdkPackage=\"{{sdkPackage}}\";var log=function(message){try{console.log(\"get_text \"+sdkPackage+\" \"+webviewAddress+\" : \"+message);if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"get_text \"+sdkPackage+\" \"+webviewAddress+\" : \"+message)}else{console.log(\"SafeDKWebApInterface get_text safedkDebug object missing\")}}catch(error){}};var textContentUnder=function(element){var n;var s=new Set;try{if(element){var walk=document.createTreeWalker(element,NodeFilter.SHOW_TEXT,null,false);while(n=walk.nextNode()){var parent=n.parentElement;if(!parent)continue;if(parent.nodeType!=1)continue;if(parent.tagName==\"SCRIPT\"||parent.tagName==\"NOSCRIPT\"||parent.tagName==\"STYLE\"||parent.tagName==\"IFRAME\")continue;if(isHidden(parent))continue;var text=n.textContent.trim();if(text==\"\")continue;s.add(text)}}}catch(error){log(\"error : \"+error)}return s};var isHidden=function(element){try{while(element){if(getComputedStyle(element).display==\"none\")return true;element=element.parentElement}}catch(error){console.log(\"error : \"+error)}return false};var collectText=function(element){var textArray=textContentUnder(document.body);var text=Array.from(textArray).join(\"---\");try{if(typeof window.webkit.messageHandlers.safedkDebug.setContent===\"function\"){window.webkit.messageHandlers.safedkDebug.setContent(sdkPackage,webviewAddress,text)}else{console.log(\"SafeDKWebApInterface get_text safedkDebug object missing\")}}catch(error){log(\"collectText error : \"+error)}};var i=0;var interval=1e3;setInterval(function(){if(i<10){i++;collectText()}},interval)})();\n";

    /* renamed from: k, reason: collision with root package name */
    public static final String f29906k = "(function(){var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(message)}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){}};var printError=function(error){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"ERROR: \"+fileName+\" \"+error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){}};if(window.safedkXHRMonitoring){return}var fullscreenRecommendations=function(){if(window.safedkXHRMonitoring){return}var webviewAddress=\"{{webviewAddress}}\";var sdkId=\"{{SDK_ID}}\";var recommendationBoxes=document.getElementsByClassName(\"mtg-recommend-box\");if(recommendationBoxes.length>0){var recommendationBox=recommendationBoxes[0];var imageElements=recommendationBox.getElementsByTagName(\"img\");if(imageElements.length>0){var images=[];for(var i=0;i<imageElements.length;i++){var imageElement=imageElements[i];images.push(imageElement.src)}try{var message={direction:\"recommendation-images\",sdkId:sdkId,webviewAddress:webviewAddress,recommendations:images};if(typeof window.webkit.messageHandlers.safedkDebug.interceptXmlHttpRequest===\"function\"){window.webkit.messageHandlers.safedkDebug.interceptXmlHttpRequest(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){printError(error)}window.safedkXHRMonitoring=true}}};var hookXMLHTTPRequest=function(){if(window.safedkXHRMonitoring){return}var fileName=\"{{fileName}}\";var webviewAddress=\"{{webviewAddress}}\";var sdkId=\"{{SDK_ID}}\";var origOpen=window.XMLHttpRequest.prototype.open;function open(method,url,async,user,password){origOpen.apply(this,arguments);try{this.safedkURL=url.toString();this.addEventListener(\"load\",function(){try{var message={direction:\"response\",sdkId:sdkId,webviewAddress:webviewAddress};if(typeof this.safedkURL!=\"undefined\"&&this.safedkURL)message.url=this.safedkURL;if(typeof this.safedkRequestText!=\"undefined\"&&this.safedkRequestText)message.safedkRequestText=this.safedkRequestText;if(typeof this.responseText!=\"undefined\"&&this.responseText)message.responseText=this.responseText;if(typeof window.webkit.messageHandlers.safedkDebug.interceptXmlHttpRequest===\"function\"){window.webkit.messageHandlers.safedkDebug.interceptXmlHttpRequest(JSON.stringify(message))}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){printError(error)}})}catch(error){printError(error)}}window.XMLHttpRequest.prototype.open=open;var origSend=window.XMLHttpRequest.prototype.send;function send(body){try{var message={direction:\"request\",sdkId:sdkId,webviewAddress:webviewAddress};if(typeof this.safedkURL!=\"undefined\"&&this.safedkURL)message.url=this.safedkURL;if(typeof body!=\"undefined\"&&body){if(typeof body===\"string\"){this.safedkRequestText=body;message.requestText=this.safedkRequestText}}}catch(error){printError(error)}origSend.apply(this,arguments)}window.XMLHttpRequest.prototype.send=send;window.safedkXHRMonitoring=true};try{var swiperElements=document.getElementsByClassName(\"swiper-more-offer-slide-2\");if(swiperElements.length>0){hookXMLHTTPRequest()}else{window.safedkSwiperElementTimer=setInterval(function(){try{var swiperElements=document.getElementsByClassName(\"swiper-more-offer-slide-2\");if(swiperElements.length>0){hookXMLHTTPRequest();if(window.safedkSwiperElementTimer){clearInterval(window.safedkSwiperElementTimer)}}fullscreenRecommendations()}catch(error){printError(error)}},1e3)}}catch(error){printError(error)}})();\n";

    /* renamed from: l, reason: collision with root package name */
    public static final String f29907l = "window.safedkResCollectionFunc=function(){var sdkPackage=\"{{sdkPackage}}\";var webviewAddress=\"{{webviewAddress}}\";var excludedResources=[];var log=function(message){try{@@SafeDKWebAppInterface@@.logMessage(message)}catch(error){}};var isHidden=function(element){try{while(element){if(getComputedStyle(element).display==\"none\")return true;element=element.parentElement}}catch(error){log(\"isHidden caught error: \"+error)}return false};var getElementAdditionalData=function(element){try{if(element==null)return null;if(element.tagName==\"IMG\"){return`(${element.width},${element.height})`}return null}catch(error){return null}};var extractBackgroundImageUris=function(backgroundImageContent){var uris=[];content=backgroundImageContent.trim();if(content.startsWith(\"url(\")){var regex=new RegExp(\"url\\\\(\\\"?'?([^)\\\"']+)\\\"?'?\\\\)\",\"g\");var match=regex.exec(content);while(match!=null){uris.push(match[1]);match=regex.exec(content)}}else{uris.push(content)}return uris};String.prototype.safedkHashCode=function(){var hash=0,i,chr;if(this.length===0)return hash;for(i=0;i<this.length;i++){chr=this.charCodeAt(i);hash=(hash<<5)-hash+chr;hash|=0}return hash};var sanitizeUri=function(uri,element){try{if(uri==\"none\")return\"\";uri=uri.trim();var regex=new RegExp(\"url\\\\(\\\"?'?([^)\\\"']+)\\\"?'?\\\\)\",\"g\");var match=regex.exec(uri);if(match&&match.length>1){uri=match[1]}if(element.tagName==\"SOURCE\"){var dataIndex=uri.indexOf(\"data:\");if(dataIndex>-1){uri=uri.substring(dataIndex)}}if(uri.startsWith(\"data:\")){let parts=uri.split(\",\",2);if(parts.length==2&&parts[0]&&parts[1]){var hashCode=parts[1].safedkHashCode();if(hashCode==0||hashCode==\"\")return\"\";uri=parts[0]+\",\"+hashCode;var additionalData=getElementAdditionalData(element);if(additionalData){uri=uri+\",\"+additionalData}var style=element.style;if(typeof style!=\"undefined\"&&style&&style.zIndex&&style.zIndex==2147483647){uri=uri+\";watermark\"}}}if(element.tagName==\"IMG\"){var closest=element.closest(\".recommend, .m-more-offer-scroll, .recommend-box, .mtg-recommend-box\");if(closest){return\"\"}}return uri}catch(error){log(\"sanitizeUri caught error: \"+error);return uri}};var findResourcesInDoc=function(doc){var resourceExtractionStartTime=new Date;var tagsWithUris=[{name:\"IMG\",prop:\"src\",filterAction:1,checkIfHidden:true},{name:\"SCRIPT\",prop:\"src\",filterAction:3,checkIfHidden:false},{name:\"EMBED\",prop:\"src\",filterAction:2,checkIfHidden:true},{name:\"SOURCE\",prop:\"src\",filterAction:2,checkIfHidden:true},{name:\"AUDIO\",prop:\"src\",filterAction:1,checkIfHidden:true},{name:\"VIDEO\",prop:\"src\",filterAction:1,checkIfHidden:true},{name:\"TRACK\",prop:\"src\",filterAction:0,checkIfHidden:true},{name:\"IFRAME\",prop:\"src\",filterAction:0,checkIfHidden:true},{name:\"LINK\",prop:\"href\",filterAction:0,checkIfHidden:false},{name:\"AREA\",prop:\"href\",filterAction:0,checkIfHidden:true},{name:\"BASE\",prop:\"href\",filterAction:0,checkIfHidden:true}];var hidden_resources=[];var resources=[];var unfilteredResources=[];var videoResources=[];for(const tag of tagsWithUris){var elements=[].slice.call(doc.getElementsByTagName(tag.name));for(const element of elements){if(tag.checkIfHidden){if(isHidden(element)){hidden_resources.push(sanitizeUri(element[tag.prop],element));continue}}var uri=sanitizeUri(element[tag.prop],element);var filter_action=tag.filterAction==\"undefined\"?0:tag.filterAction;if(filter_action==0){resources.push(uri)}else if(filter_action==1){if(tag.name==\"VIDEO\")videoResources.push(uri);else unfilteredResources.push(uri)}else if(filter_action==2){if(element.type&&(element.type.startsWith(\"audio\")||element.type.startsWith(\"image\"))){unfilteredResources.push(uri)}else if(tag.name==\"SOURCE\"&&element.parentElement.tagName==\"VIDEO\"){videoResources.push(uri)}else if(tag.name==\"EMBED\"&&element.type&&element.type.startsWith(\"video\")){videoResources.push(uri)}else{resources.push(uri)}}else if(filter_action==3){try{if(typeof element.innerText!=\"undefined\"&&element.innerText!=null&&element.innerText!=\"\"){var regex=new RegExp(\"(https?:\\\\/\\\\/[^\\\\s\\\\<\\\\>;\\\"'\\\\\\\\(){},\\\\]]+)\",\"g\");if(sdkPackage==\"com.unity3d.ads\"){var ppRegex=new RegExp('(\"dsp-list\".*<\\\\/p>)',\"ms\");var dspListMatches=element.innerText.match(ppRegex);if(dspListMatches.length>1){var ppText=dspListMatches[1];var dspResourceMatches=[...ppText.matchAll(regex)];for(var dspResourceMatch of dspResourceMatches){if(dspResourceMatch.length>1){excludedResources.push(dspResourceMatch[1])}}}}var matches=[...element.innerText.matchAll(regex)];for(var match of matches){if(match.length>1){resources.push(match[1])}}}else{resources.push(uri)}}catch(error){resources.push(uri)}}else{resources.push(uri)}}}var excludeUris=[\"none\",\"initial\",\"inherit\",\"unset\"];var sheets=doc.styleSheets;if(sheets){for(var sheet of sheets){try{var rules=sheet.rules?sheet.rules:sheet.cssRules;if(typeof rules!=\"undefined\"&&rules&&rules.length>0){for(var rule of rules){if(typeof rule.style!=\"undefined\"&&rule.style&&rule.style.backgroundImage){var backgroundImage=rule.style.backgroundImage;for(var uri of extractBackgroundImageUris(backgroundImage)){var sanitizedUri=sanitizeUri(uri,rule);if(!excludeUris.includes(sanitizedUri)&&!sanitizedUri.includes(\"gradient\")){unfilteredResources.push(sanitizedUri)}}}}}}catch(error){}}}var tagsWithBGImage=[\"DIV\",\"CANVAS\",\"A\"];for(var tagWithBGImage of tagsWithBGImage){var divs=doc.getElementsByTagName(tagWithBGImage);for(let div of divs){var divStyle=getComputedStyle(div);if(typeof divStyle!=\"undefined\"&&divStyle){var backgroundImage=divStyle.backgroundImage;if(typeof backgroundImage!=\"undefined\"&&backgroundImage){for(var uri of extractBackgroundImageUris(backgroundImage)){var sanitizedUri=sanitizeUri(uri,div);if(!excludeUris.includes(sanitizedUri)&&!sanitizedUri.includes(\"gradient\")){if(isHidden(div)){hidden_resources.push(sanitizedUri);continue}else{unfilteredResources.push(sanitizedUri)}}}}}}}var creativeImageClassName=\"creative__image\";var imageElements=doc.getElementsByClassName(creativeImageClassName);for(let imageElement of imageElements){if(imageElement.style&&imageElement.style.cssText){var sanitizedUri=sanitizeUri(imageElement.style.cssText,null);if(sanitizedUri){unfilteredResources.push(sanitizedUri)}}}var resourceArrays=[resources,unfilteredResources,videoResources];var dataUris=[];for(var i=0;i<resourceArrays.length;i++){resourceArrays[i]=resourceArrays[i].filter(function(value,index,self){return value!=\"\"&&self.indexOf(value)===index&&!excludedResources.includes(value)});var urls=[];for(var str of resourceArrays[i]){str=str+\"\";if(str.startsWith(\"data:\")){dataUris.push(str)}else{urls.push(str)}}resourceArrays[i]=urls}var resourceExtractionElapsedTime=new Date-resourceExtractionStartTime;return{urls:resourceArrays[0],unfilteredUrls:resourceArrays[1],videoUrls:resourceArrays[2],dataUris:dataUris,hidden_res:hidden_resources}};var scanDocumentResources=function(currDoc){var resources={urls:[],unfilteredUrls:[],videoUrls:[],dataUris:[],hidden:[],isDD:false};var docs=[];docs.push(currDoc);var shadowRootElements=[].slice.call(document.getElementsByClassName(\"creative__shadow-root\"));var yandexAdContainer=document.getElementById(\"ad_container\");if(yandexAdContainer!=null){var yandexAdContainerChildren=yandexAdContainer.children;if(typeof yandexAdContainerChildren!=\"undefined\"&&yandexAdContainerChildren.length==1){shadowRootElements.push(yandexAdContainerChildren[0])}}for(var shadowElement of shadowRootElements){if(typeof shadowElement.shadowRoot!=\"undefined\"){log(\"sdr, shadow element found\");var shadowRoot=shadowElement.shadowRoot;if(shadowRoot&&typeof shadowRoot.innerHTML!=\"undefined\"&&shadowRoot.innerHTML){var shadowRootChildren=[].slice.call(shadowRoot.children);if(shadowRootChildren.length>0){docs.push(...shadowRootChildren)}var tmpDiv=document.createElement(\"div\");if(tmpDiv){tmpDiv.innerHTML=shadowRoot.innerHTML;var tmpHtml=document.createElement(\"div\");if(tmpHtml){tmpHtml.innerHTML=shadowRoot.innerHTML;tmpHtml.body=tmpDiv;tmpHtml.styleSheets=shadowRoot.styleSheets;docs.push(tmpHtml)}}}}}for(var doc of docs){var resourcesInDoc=findResourcesInDoc(doc);if(resourcesInDoc){if(resourcesInDoc.stopAnalyzingResources){resources.stopAnalyzingResources=\"yes\"}else{resources.urls.push(...resourcesInDoc.urls);resources.unfilteredUrls.push(...resourcesInDoc.unfilteredUrls);resources.videoUrls.push(...resourcesInDoc.videoUrls);resources.dataUris.push(...resourcesInDoc.dataUris);resources.hidden.push(...resourcesInDoc.hidden_res)}}}return resources};function traverseIframes(iframeDocument,level=0){var isDD=false;try{if(level>99){return}var iframes=iframeDocument.getElementsByTagName(\"iframe\");for(var i=0;i<iframes.length;i++){var iframe=iframes[i];if(isHidden(iframe)){continue}var iframeDoc=iframe.contentDocument||iframe.contentWindow.document;if(iframeDoc){traverseIframes(iframeDoc,level+1)}}}catch(e){log(\"ti caught exception = \"+e);if(e.name===\"SecurityError\"){isDD=true}}var resourcesList={urls:[],unfilteredUrls:[],videoUrls:[],dataUris:[],hidden:[],isDD:false};try{resourcesList=scanDocumentResources(iframeDocument)}catch(e){log(\"sdr caught exception = \"+e)}if(isDD==true){resourcesList.isDD=true}var jsonString=JSON.stringify(resourcesList);@@SafeDKWebAppInterface@@.onResourcesCollected(sdkPackage,webviewAddress,jsonString)}traverseIframes(document)};try{window.safedkResCollectionFunc()}catch(e){log(\"sdr caught exception = \"+e)}\n";

    /* renamed from: o, reason: collision with root package name */
    private static final String f29909o = "privacy";

    /* renamed from: p, reason: collision with root package name */
    private static final String f29910p = "end_of_video";

    /* renamed from: q, reason: collision with root package name */
    private static final String f29911q = "extract_text";

    /* renamed from: r, reason: collision with root package name */
    private static final String f29912r = "xml_http_request";

    /* renamed from: n, reason: collision with root package name */
    Context f29916n;

    /* renamed from: s, reason: collision with root package name */
    private static final CharSequence f29913s = "https://webview.unityads.unity3d.com/webview/";

    /* renamed from: t, reason: collision with root package name */
    private static final CharSequence f29914t = "UnityAdsWebApp.html";

    /* renamed from: u, reason: collision with root package name */
    private static final List<String> f29915u = Arrays.asList("document.write", "(function()");

    /* renamed from: m, reason: collision with root package name */
    public static final Map<String, WeakReference<WebView>> f29908m = new HashMap();

    public SafeDKWebAppInterface(Context c2) {
        this.f29916n = c2;
    }

    @JavascriptInterface
    public void postMessage(String msg) {
        String str;
        boolean z2;
        boolean z3;
        Logger.d(f29898a, "postMessage : msg = " + msg);
        try {
            JSONObject jSONObject = new JSONObject(msg);
            if (jSONObject.has("status")) {
                String string = jSONObject.getString("status");
                if (jSONObject.get("status").equals(f29900c)) {
                    str = string;
                    z2 = false;
                    z3 = false;
                } else if (jSONObject.get("status").equals(d)) {
                    str = string;
                    z2 = false;
                    z3 = true;
                } else if (jSONObject.get("status").equals(e)) {
                    str = string;
                    z2 = true;
                    z3 = false;
                } else {
                    str = string;
                    z2 = false;
                    z3 = false;
                }
            } else {
                str = null;
                z2 = false;
                z3 = false;
            }
            String string2 = jSONObject.has(f29901f) ? jSONObject.getString(f29901f) : null;
            String string3 = jSONObject.has("address") ? jSONObject.getString("address") : null;
            Logger.d(f29898a, "postMessage : status = " + str + ", sdk_id = " + string2 + ", address = " + string3 + ", src = " + (jSONObject.has("src") ? jSONObject.get("src") : "NA"));
            if (string2 != null && !z2) {
                CreativeInfoManager.a(string2, string3, z3);
            } else if (string2 != null && string3 != null) {
                CreativeInfoManager.f(string2);
            }
        } catch (JSONException e2) {
            Logger.d(f29898a, "Received msg is not a JSON object : " + msg + ", ex : " + e2.getMessage(), e2);
        }
    }

    @JavascriptInterface
    public void logMessage(String msg) {
        Logger.d(f29898a, "logMessage msg = " + msg);
    }

    @JavascriptInterface
    public void interceptXmlHttpRequest(String message) {
        Logger.d(f29898a, "interceptXmlHttpRequest - message= " + message);
        try {
            com.safedk.android.analytics.brandsafety.creatives.discoveries.g h2 = CreativeInfoManager.h(com.safedk.android.utils.g.f30060o);
            if (h2 != null) {
                h2.m(message);
            } else {
                Logger.d(f29898a, "interceptXmlHttpRequest - mintegralDiscovery is null");
            }
        } catch (Exception e2) {
            Logger.d(f29898a, "interceptXmlHttpRequest - encountered exception= " + e2);
        }
    }

    public static String a(String str, String str2) {
        Logger.d(f29898a, "getXMLHttpRequestJsScript: sdk= " + str + ", webviewAddress= " + str2);
        return "javascript:" + f29906k.replace("{{webviewAddress}}", str2).replace("{{SDK_ID}}", str).replace("window.webkit.", "window.").replace("messageHandlers.safedkDebug.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkDebug.interceptXmlHttpRequest", "SafeDKWebAppInterface.interceptXmlHttpRequest");
    }

    @JavascriptInterface
    public void requestNoSampling(String sdkPackageName, String address, int height, int width) {
        Logger.d(f29898a, "requestNoSampling : address = " + address + ", height = " + height + " , width = " + width);
        if (!com.safedk.android.analytics.brandsafety.b.f(address, ImpressionLog.f29265q)) {
            com.safedk.android.analytics.brandsafety.b.a(address, ImpressionLog.f29265q, new ImpressionLog.a[0]);
        }
        if (height == 0 && width == 0) {
            CreativeInfoManager.a(sdkPackageName, address);
            return;
        }
        if (k.a(width, height)) {
            Logger.d(f29898a, "requestNoSampling calling banner requestNoSampling, : address = " + address);
            CreativeInfoManager.a(BrandSafetyUtils.AdType.BANNER, address);
        } else if (k.b(width, height)) {
            Logger.d(f29898a, "requestNoSampling calling MREC requestNoSampling, : address = " + address);
            CreativeInfoManager.a(BrandSafetyUtils.AdType.MREC, address);
        } else if (b.getInstance().isInterstitialActivity(b.getInstance().getForegroundActivity())) {
            Logger.d(f29898a, "requestNoSampling calling interstitial requestNoSampling, : address = " + address);
            CreativeInfoManager.d(sdkPackageName, address);
        } else {
            Logger.d(f29898a, "requestNoSampling WebView is non a banner nor an interstitial, probably MREC, : address = " + address);
        }
    }

    @JavascriptInterface
    public void setContent(String packageName, String webviewAddress, String texts) {
        WeakReference<WebView> weakReference;
        try {
            if (com.safedk.android.utils.a.a(packageName)) {
                if (texts != null && texts.trim().length() > 0) {
                    Logger.d(f29898a, "setContent packageName = " + packageName + ", webviewAddress = " + webviewAddress + ", text = " + texts);
                    if (f29908m.containsKey(webviewAddress) && b(texts) && (weakReference = f29908m.get(webviewAddress)) != null && weakReference.get() != null) {
                        for (String str : texts.split("---")) {
                            if (str != null && str.trim().length() > 0) {
                                com.safedk.android.analytics.brandsafety.creatives.e.a(packageName, weakReference.get(), "text:" + str, (Map<String, String>) null);
                            }
                        }
                        return;
                    }
                    return;
                }
                Logger.d(f29898a, "setContent WebView address " + webviewAddress + " text is empty");
            }
        } catch (Throwable th) {
            Logger.d(f29898a, "setContent exception : " + th.getMessage() + ", webviewAddress = " + webviewAddress, th);
        }
    }

    private boolean b(String str) {
        for (String str2 : f29915u) {
            if (str != null && str.contains(str2)) {
                Logger.d(f29898a, "should add text : skipping text " + str);
                return false;
            }
        }
        Logger.d(f29898a, "should add text : eligible text " + str);
        return true;
    }

    public static void a(String str, final WebView webView, final String str2) {
        final String a2 = BrandSafetyUtils.a(webView);
        SafeDK safeDK = SafeDK.getInstance();
        Logger.d(f29898a, "addJScript started sdkPackage=" + str + ", webView=" + a2 + " ,url=" + str2 + " , isMaxInit=" + SafeDK.W());
        if (!SafeDK.W() || safeDK == null || str2 == null) {
            Logger.d(f29898a, "addJScript loaded url is empty or app not initialized yet, skipping.");
            return;
        }
        if (webView == null || webView.getContext() == null) {
            Logger.d(f29898a, "addJScript WebView is null or WebView context is null. skipping.");
            return;
        }
        final String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        if (CreativeInfoManager.h(mainSdkPackage) == null) {
            Logger.d(f29898a, "addJScript not supported sdkPackage :  " + mainSdkPackage + ", existing");
            return;
        }
        if ((SafeDK.W() && safeDK != null && !safeDK.h()) || str2.contains(f29913s) || str2.contains(f29914t)) {
            if (str2.startsWith("javascript:")) {
                Logger.d(f29898a, "addJScript loaded data is javascript, ignoring. url : " + str2);
                return;
            } else {
                SafeDKApplication.runOnUiThread(new Runnable() { // from class: com.safedk.android.internal.SafeDKWebAppInterface.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SafeDKWebAppInterface.b(mainSdkPackage, webView, str2, a2);
                    }
                });
                return;
            }
        }
        Logger.d(f29898a, "addJScript skipped url " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, WebView webView, String str2, String str3) {
        if (SafeDK.N() && Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        webView.addJavascriptInterface(new SafeDKWebAppInterface(webView.getContext()), f29898a);
        Logger.d(f29898a, "addJScript javascript interface added, WebView address is " + str3);
        if (SafeDK.N() && Build.VERSION.SDK_INT >= 19) {
            Logger.d(f29898a, "addJScript testing javascript call. WebView address is " + str3);
            webView.evaluateJavascript("javascript:console.log('adding js interface. success : ' + (typeof(window.SafeDKWebAppInterface.logMessage)=='function'));", null);
            webView.evaluateJavascript("javascript:window.SafeDKWebAppInterface.logMessage('adding js interface');", null);
        }
        c(str, webView, str2);
    }

    public static String a(String str, String str2, String str3) {
        return "javascript:" + str3.replace("window.webkit.", "window.").replace("messageHandlers.safedkNoSamplingExc.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkNoSampling.postMessage", "SafeDKWebAppInterface.requestNoSampling").replace("messageHandlers.safedkDebug.postMessage", "SafeDKWebAppInterface.logMessage").replace("{{SDK_ID}}", str).replace("{{ADDRESS}}", str2);
    }

    public static String b(String str, String str2) {
        String str3 = "javascript:" + f29904i.replace("window.webkit.", "window.").replace("messageHandlers.safedkDebug.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkVideoExc.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkNoSampling.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkVideo", f29898a).replace("{{SDK_ID}}", str).replace("{{ADDRESS}}", str2);
        com.safedk.android.analytics.brandsafety.creatives.a i2 = CreativeInfoManager.i(str);
        if (i2 != null && i2.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES)) {
            return str3.replace("{{shouldTraverseIframes}}", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        }
        return str3;
    }

    public static String c(String str, String str2) {
        Logger.d(f29898a, "getting js html extr script for webviewAddress " + str2);
        return "javascript:" + f29905j.replace("{{webviewAddress}}", str2).replace("{{sdkPackage}}", str).replace("window.webkit.", "window.").replace("messageHandlers.safedkDebug.postMessage", "SafeDKWebAppInterface.logMessage").replace("messageHandlers.safedkDebug.setContent", "SafeDKWebAppInterface.setContent");
    }

    public static String d(String str, String str2) {
        Logger.d(f29898a, "getting Resources Collection JS of webpage: " + str2);
        return "javascript:" + f29907l.replace("{{webviewAddress}}", str2).replace("{{sdkPackage}}", str).replace("@@SafeDKWebAppInterface@@", f29898a);
    }

    @JavascriptInterface
    public void onResourcesCollected(String packageName, String webviewAddress, String msg) {
        k.b(f29898a, "on resources collected - package: " + packageName + ", msg: " + msg);
        try {
            JSONObject jSONObject = new JSONObject(msg);
            ArrayList arrayList = new ArrayList(com.safedk.android.utils.d.b(jSONObject.getJSONArray("urls")));
            arrayList.addAll(com.safedk.android.utils.d.b(jSONObject.getJSONArray("dataUris")));
            ArrayList arrayList2 = new ArrayList(com.safedk.android.utils.d.b(jSONObject.getJSONArray("unfilteredUrls")));
            JSONArray jSONArray = jSONObject.getJSONArray("videoUrls");
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList3.add(CreativeInfo.aq + jSONArray.getString(i2));
            }
            if (jSONObject.optBoolean("isDD")) {
                Logger.d(f29898a, "on resources collected - detected isDD - not reporting resources");
                return;
            }
            k.b(f29898a, "on resources collected - webview address: " + webviewAddress + " urls are: " + arrayList);
            com.safedk.android.analytics.brandsafety.creatives.e.a(packageName, webviewAddress, (List<String>) arrayList, false);
            k.b(f29898a, "on resources collected - webview address: " + webviewAddress + " undefined urls are: " + arrayList2);
            com.safedk.android.analytics.brandsafety.creatives.e.a(packageName, webviewAddress, (List<String>) arrayList2, true);
            k.b(f29898a, "on resources collected - webview address: " + webviewAddress + " video urls are: " + arrayList3);
            com.safedk.android.analytics.brandsafety.creatives.e.a(packageName, webviewAddress, (List<String>) arrayList3, true);
        } catch (Throwable th) {
            Logger.d("on Resources Collected error with json: " + th);
        }
    }

    private static void c(final String str, final WebView webView, String str2) {
        final String a2 = BrandSafetyUtils.a(webView);
        SafeDK safeDK = SafeDK.getInstance();
        if (SafeDK.W() && safeDK != null && !SafeDK.getInstance().h()) {
            if (str2 == null || str2.equalsIgnoreCase("about:blank") || str2.trim().length() == 0) {
                Logger.d(f29898a, "attachJsScript url is blank, skipping scripts injection. sdkPackage = " + str + ", webView = " + webView);
                return;
            }
            if (str2.length() < 20480) {
                Logger.d(f29898a, "attachJsScript sdkPackage = " + str + ", webView = " + webView + " url = " + str2);
            } else {
                Logger.d(f29898a, "attachJsScript sdkPackage = " + str + ", webView = " + webView + " url too long (probably html, size is " + str2.length() + " ) ");
            }
            final HashMap hashMap = new HashMap();
            Logger.d(f29898a, "attachJsScript sdk: " + str + ", address: " + a2);
            com.safedk.android.analytics.brandsafety.creatives.a i2 = CreativeInfoManager.i(str);
            if (i2 == null) {
                Logger.d(f29898a, "attachJsScript configBundle is empty, existing");
                return;
            }
            if (i2 != null) {
                Logger.d(f29898a, "attachJsScript sdk " + str + " items: js privacy fullscreen  : " + i2.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, false) + ", js privacy banner  : " + i2.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, false) + ", js privacy mrec  : " + i2.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, false) + ", js video : " + i2.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, false) + ", js text extraction : " + i2.a(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, true));
            } else {
                Logger.d(f29898a, "attachJsScript sdk " + str + " config bundle is empty");
            }
            if (i2.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, false) || i2.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, false) || i2.a(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, false)) {
                String a3 = i2.a(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, (String) null);
                if (a3 != null && a3.length() > 0) {
                    hashMap.put("privacy", a(str, a2, a3));
                    Logger.d(f29898a, "attachJsScript added " + str + " privacy button click detection script to list.");
                } else {
                    Logger.d(f29898a, "attachJsScript privacy button click detection script is empty, skipping.");
                }
            }
            if (i2.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION)) {
                hashMap.put(f29910p, b(str, a2));
                Logger.d(f29898a, "attachJsScript added " + str + " video state detection script to list.");
            } else {
                Logger.d(f29898a, "attachJsScript no need to add video state detection script. WebView : " + a2);
            }
            String a4 = a(str, a2);
            Logger.d(f29898a, "attachJsScript adding Xml Http Request Js Script . WebView : " + a2);
            hashMap.put(f29912r, a4);
            if (i2.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING) && i2.a(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, true)) {
                synchronized (f29908m) {
                    f29908m.put(a2, new WeakReference<>(webView));
                }
                String c2 = c(str, a2);
                hashMap.put(f29911q, c2);
                Logger.d(f29898a, "attachJsScript added " + str + " text extraction script to list. script : " + c2);
            } else {
                Logger.d(f29898a, "attachJsScript no need to add text extraction script. sdkPackage = " + str + ", WebView : " + a2);
            }
            webView.post(new Runnable() { // from class: com.safedk.android.internal.SafeDKWebAppInterface.2
                @Override // java.lang.Runnable
                public void run() {
                    if (Build.VERSION.SDK_INT >= 19) {
                        if (webView != null) {
                            for (String str3 : hashMap.keySet()) {
                                if (hashMap.get(str3) != null && ((String) hashMap.get(str3)).length() > 0) {
                                    String str4 = (String) hashMap.get(str3);
                                    Logger.d(SafeDKWebAppInterface.f29898a, "Injecting script for " + str + " WebView : " + a2 + ", script : " + str3);
                                    try {
                                        webView.evaluateJavascript(str4, null);
                                    } catch (Throwable th) {
                                        Logger.d(SafeDKWebAppInterface.f29898a, "attachJsScript Exception injecting text extraction script : " + th.getMessage(), th);
                                    }
                                }
                            }
                        }
                        hashMap.clear();
                        return;
                    }
                    for (String str5 : hashMap.keySet()) {
                        String str6 = (String) hashMap.get(str5);
                        if (str6 != null && str6.length() > 0 && webView != null) {
                            Logger.d(SafeDKWebAppInterface.f29898a, "attachJsScript Injecting script for " + str + " WebView : " + a2 + ", script : " + str5);
                            try {
                                webView.loadUrl(str6, null);
                            } catch (Throwable th2) {
                                Logger.d(SafeDKWebAppInterface.f29898a, "attachJsScript Exception injecting text extraction script : " + th2.getMessage(), th2);
                            }
                        }
                    }
                }
            });
        }
    }

    public static void b(String str, final WebView webView, final String str2) {
        Logger.d(f29898a, "add Script For WebView started with sdk package: " + str + " and webview address: " + BrandSafetyUtils.a(webView));
        k.b(f29898a, "Resource script is: " + str2);
        webView.post(new Runnable() { // from class: com.safedk.android.internal.SafeDKWebAppInterface.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        webView.evaluateJavascript(str2, null);
                    }
                } catch (Throwable th) {
                    Logger.d(SafeDKWebAppInterface.f29898a, "add Script For WebView Exception injecting text extraction script : " + th.getMessage(), th);
                }
            }
        });
    }

    public static void a(String str) {
        synchronized (f29908m) {
            if (f29908m.remove(str) != null) {
                Logger.d(f29898a, "WebView address removed : " + str);
            }
        }
    }
}
