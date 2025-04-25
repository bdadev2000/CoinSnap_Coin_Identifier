package com.glority.android.surveyEvent;

import android.util.Base64;
import androidx.core.os.BundleKt;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.Router;
import com.glority.android.core.route.analysis.GetLongIdRequest;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.analysis.SendErrorEventRequest;
import com.glority.android.core.route.surveyEvent.SurveyAddToMmsRequest;
import com.glority.android.core.route.surveyEvent.UrlSurveyEvent;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.LinkedHashMap;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: SurveyAddToMmsHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002Jq\u0010\f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152*\u0010\u0016\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0017j\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u0018H\u0002¢\u0006\u0002\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/glority/android/surveyEvent/SurveyAddToMmsHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "post", "", "request", "Lcom/glority/android/core/route/RouteRequest;", "sendMmsEvent", "Lcom/glority/android/core/route/surveyEvent/SurveyAddToMmsRequest;", "itemId", "businessType", "imageUrl", "list", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "photoFrom", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;", "fields", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "(Ljava/lang/String;JLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lcom/glority/component/generatedAPI/kotlinAPI/enums/PhotoFrom;Ljava/util/LinkedHashMap;)V", "Companion", "base-surveyEvent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class SurveyAddToMmsHandler implements RouteHandler<Long> {
    public static final String ADD_TAG_TO_MMS = "add_to_mms";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String encryptoMode = "RSA/ECB/PKCS1Padding";
    public static final String pubKeyString = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQD2WZLqC9Y07ExYF6X9KF9DOLuJVRhVjNYfhJpfqfR89Ro/RR7KLGfpDIY3B6h076EaegXYsbSsXZnkVTF8sFux+LCSiYjMioJilg7mgMYinC0RSu2wBoQ2XUPAPNXOSd0VRX7Cje2Qi3oglfHUwRHuBeInf/w9ScLM0VF4T8m6AwIDAQAB";

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.glority.android.core.route.RouteHandler
    public Long execute(RouteRequest<Long> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (Long) RouteHandler.DefaultImpls.execute(this, request);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return UrlSurveyEvent.INSTANCE.getURL_SURVEY_ADD_TO_MMS();
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(final RouteRequest<Long> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request instanceof SurveyAddToMmsRequest) {
            new GetLongIdRequest().subscribe(new Consumer<Long>() { // from class: com.glority.android.surveyEvent.SurveyAddToMmsHandler$post$1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Long it) {
                    SurveyAddToMmsHandler surveyAddToMmsHandler = SurveyAddToMmsHandler.this;
                    SurveyAddToMmsRequest surveyAddToMmsRequest = (SurveyAddToMmsRequest) request;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    surveyAddToMmsHandler.sendMmsEvent(surveyAddToMmsRequest, it.longValue());
                    Router.onResponse(request.getId(), it);
                }
            }, new Consumer<Throwable>() { // from class: com.glority.android.surveyEvent.SurveyAddToMmsHandler$post$2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Throwable th) {
                    SurveyAddToMmsHandler.this.sendMmsEvent((SurveyAddToMmsRequest) request, 0L);
                    Router.onResponse(request.getId(), th);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMmsEvent(SurveyAddToMmsRequest request, long itemId) {
        try {
            Companion companion = INSTANCE;
            String encrypto = companion.encrypto(request.getImage_url(), companion.getPublicKey(pubKeyString));
            String replace$default = encrypto != null ? StringsKt.replace$default(encrypto, "\n", "", false, 4, (Object) null) : null;
            String item_type = request.getItem_type();
            if (replace$default == null) {
                replace$default = request.getImage_url();
            }
            sendMmsEvent(item_type, itemId, replace$default, request.getList(), request.getCountry_code(), request.getPhotoFrom(), request.getFields());
        } catch (Exception e) {
            new SendErrorEventRequest("add_to_mms_error", e.toString()).post();
        }
    }

    private final void sendMmsEvent(String businessType, long itemId, String imageUrl, String[] list, String countryCode, PhotoFrom photoFrom, LinkedHashMap<String, String> fields) {
        LinkedHashMap<String, String> linkedHashMap = fields != null ? fields : new LinkedHashMap<>();
        linkedHashMap.put("image_from", photoFrom.name());
        AddToMmsBean addToMmsBean = new AddToMmsBean(businessType, itemId, imageUrl, list != null ? list : new String[0], countryCode, linkedHashMap);
        Gson create = new GsonBuilder().disableHtmlEscaping().create();
        Intrinsics.checkNotNullExpressionValue(create, "GsonBuilder().disableHtmlEscaping().create()");
        new LogEventRequest(ADD_TAG_TO_MMS, BundleKt.bundleOf(TuplesKt.to("content", create.toJson(addToMmsBean)))).post();
    }

    /* compiled from: SurveyAddToMmsHandler.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/glority/android/surveyEvent/SurveyAddToMmsHandler$Companion;", "", "()V", "ADD_TAG_TO_MMS", "", "encryptoMode", "pubKeyString", "encrypto", "text", "key", "Ljava/security/Key;", "getPublicKey", "Ljava/security/PublicKey;", "base-surveyEvent_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PublicKey getPublicKey(String pubKeyString) {
            byte[] decode = Base64.decode(pubKeyString, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "Base64.decode(pubKeyString, Base64.DEFAULT)");
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        }

        public final String encrypto(String text, Key key) {
            byte[] doFinal;
            Intrinsics.checkNotNullParameter(text, "text");
            try {
                Cipher cipher = Cipher.getInstance(SurveyAddToMmsHandler.encryptoMode);
                cipher.init(1, key);
                byte[] bytes = text.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                int length = bytes.length;
                byte[] bArr = new byte[0];
                int i = 0;
                while (true) {
                    int i2 = length - i;
                    if (i2 > 0) {
                        if (i2 > 117) {
                            doFinal = cipher.doFinal(bytes, i, 117);
                            Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(inputArra…ffSet, MAX_ENCRYPT_BLOCK)");
                            i += 117;
                        } else {
                            doFinal = cipher.doFinal(bytes, i, i2);
                            Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(inputArra…et, inputLength - offSet)");
                            i = length;
                        }
                        bArr = Arrays.copyOf(bArr, bArr.length + doFinal.length);
                        Intrinsics.checkNotNullExpressionValue(bArr, "java.util.Arrays.copyOf(this, newSize)");
                        System.arraycopy(doFinal, 0, bArr, bArr.length - doFinal.length, doFinal.length);
                    } else {
                        return Base64.encodeToString(bArr, 0);
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException("加密字符串[" + text + "]时遇到异常", e);
            }
        }
    }
}
