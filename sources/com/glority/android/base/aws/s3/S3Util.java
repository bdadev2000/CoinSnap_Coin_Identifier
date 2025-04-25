package com.glority.android.base.aws.s3;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.glority.component.generatedAPI.kotlinAPI.storage.UploadToken;
import com.glority.utils.stability.LogUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.GlobalScope;

/* compiled from: S3Util.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0013R\u001f\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/glority/android/base/aws/s3/S3Util;", "", "()V", "uploaders", "", "", "Lcom/glority/android/base/aws/s3/S3Uploader;", "getUploaders", "()Ljava/util/Map;", "uploadingCredential", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getAccessUrl", "scope", "objectKey", "getObjectKey", "format", "getTransferUtility", "Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtility;", "updateAwsCredentials", "", "Companion", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes14.dex */
public final class S3Util {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "S3Util";
    private static final Lazy<S3Util> instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<S3Util>() { // from class: com.glority.android.base.aws.s3.S3Util$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final S3Util invoke() {
            return new S3Util(null);
        }
    });
    private final Map<String, S3Uploader> uploaders;
    private final AtomicBoolean uploadingCredential;

    public /* synthetic */ S3Util(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final S3Util getInstance() {
        return INSTANCE.getInstance();
    }

    private S3Util() {
        this.uploaders = new LinkedHashMap();
        this.uploadingCredential = new AtomicBoolean(false);
    }

    public final Map<String, S3Uploader> getUploaders() {
        return this.uploaders;
    }

    public final TransferUtility getTransferUtility(String scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        S3Uploader s3Uploader = this.uploaders.get(scope);
        if (s3Uploader == null) {
            return null;
        }
        return s3Uploader.getTransferUtility();
    }

    public static /* synthetic */ String getObjectKey$default(S3Util s3Util, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "jpg";
        }
        return s3Util.getObjectKey(str, str2);
    }

    public final String getObjectKey(String scope, String format) {
        UploadToken uploadToken;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(format, "format");
        StringBuilder sb = new StringBuilder();
        S3Uploader s3Uploader = this.uploaders.get(scope);
        String str = null;
        if (s3Uploader != null && (uploadToken = s3Uploader.getUploadToken()) != null) {
            str = uploadToken.getAuthorizedPath();
        }
        return sb.append((Object) str).append('/').append(INSTANCE.getRandomName(format)).toString();
    }

    public final String getAccessUrl(String scope, String objectKey) {
        UploadToken uploadToken;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(objectKey, "objectKey");
        StringBuilder sb = new StringBuilder();
        S3Uploader s3Uploader = this.uploaders.get(scope);
        String str = null;
        if (s3Uploader != null && (uploadToken = s3Uploader.getUploadToken()) != null) {
            str = uploadToken.getDownloadUrlPrefix();
        }
        return sb.append((Object) str).append('/').append(objectKey).toString();
    }

    public final void updateAwsCredentials() {
        LogUtils.d(TAG, "updateAwsCredentials begin.....");
        if (this.uploadingCredential.compareAndSet(false, true)) {
            BuildersKt.launch$default(GlobalScope.INSTANCE, null, null, new S3Util$updateAwsCredentials$1(this, null), 3, null);
        }
    }

    /* compiled from: S3Util.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0006\u001a\u00020\u00078FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/glority/android/base/aws/s3/S3Util$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "instance", "Lcom/glority/android/base/aws/s3/S3Util;", "getInstance$annotations", "getInstance", "()Lcom/glority/android/base/aws/s3/S3Util;", "instance$delegate", "Lkotlin/Lazy;", "getRandomName", "format", "base-aws_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        private Companion() {
        }

        public final S3Util getInstance() {
            return (S3Util) S3Util.instance$delegate.getValue();
        }

        public static /* synthetic */ String getRandomName$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "jpg";
            }
            return companion.getRandomName(str);
        }

        public final String getRandomName(String format) {
            Intrinsics.checkNotNullParameter(format, "format");
            StringBuilder sb = new StringBuilder();
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            String substring = uuid.substring(13);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
            return sb.append(substring).append('.').append(format).toString();
        }
    }
}
