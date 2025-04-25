package com.glority.android.base.aws.s3;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.base.aws.repository.AwsRepository;
import com.glority.android.core.app.AppContext;
import com.glority.component.generatedAPI.kotlinAPI.storage.GetUploadConfigMessage;
import com.glority.component.generatedAPI.kotlinAPI.storage.UploadToken;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: S3Util.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(c = "com.glority.android.base.aws.s3.S3Util$updateAwsCredentials$1", f = "S3Util.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
public final class S3Util$updateAwsCredentials$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ S3Util this$0;

    /* compiled from: S3Util.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes14.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3Util$updateAwsCredentials$1(S3Util s3Util, Continuation<? super S3Util$updateAwsCredentials$1> continuation) {
        super(2, continuation);
        this.this$0 = s3Util;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new S3Util$updateAwsCredentials$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((S3Util$updateAwsCredentials$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        String str2;
        UploadToken uploadToken;
        String str3;
        AtomicBoolean atomicBoolean3;
        AtomicBoolean atomicBoolean4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Resource<GetUploadConfigMessage> uploadConfigBlocking = AwsRepository.INSTANCE.getUploadConfigBlocking();
            int i2 = WhenMappings.$EnumSwitchMapping$0[uploadConfigBlocking.getStatus().ordinal()];
            if (i2 == 1) {
                GetUploadConfigMessage data = uploadConfigBlocking.getData();
                Map<String, Object> uploadTokenMap = data == null ? null : data.getUploadTokenMap();
                if (uploadTokenMap == null || uploadTokenMap.isEmpty()) {
                    str = S3Util.TAG;
                    LogUtils.d(str, "empty uploadTokens...");
                    atomicBoolean = this.this$0.uploadingCredential;
                    atomicBoolean.set(false);
                } else {
                    Ref.LongRef longRef = new Ref.LongRef();
                    longRef.element = -1L;
                    Set<Map.Entry<String, Object>> entrySet = uploadTokenMap.entrySet();
                    S3Util s3Util = this.this$0;
                    Iterator<T> it = entrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object value = entry.getValue();
                        JSONObject jSONObject = value instanceof JSONObject ? (JSONObject) value : null;
                        if (jSONObject != null) {
                            try {
                                uploadToken = new UploadToken(jSONObject);
                            } catch (Exception e) {
                                if (AppContext.INSTANCE.isDebugMode()) {
                                    LogUtils.e(Log.getStackTraceString(e));
                                }
                                uploadToken = null;
                            }
                            if (uploadToken != null) {
                                S3Uploader s3Uploader = s3Util.getUploaders().get(entry.getKey());
                                if (s3Uploader == null) {
                                    s3Uploader = new S3Uploader(uploadToken);
                                }
                                s3Uploader.updateCredentials(uploadToken);
                                s3Util.getUploaders().put(entry.getKey(), s3Uploader);
                                if (uploadToken.getExpiration().getTime() > longRef.element) {
                                    longRef.element = uploadToken.getExpiration().getTime();
                                }
                            }
                        }
                    }
                    atomicBoolean2 = this.this$0.uploadingCredential;
                    atomicBoolean2.set(false);
                    if (longRef.element == -1) {
                        return Unit.INSTANCE;
                    }
                    long currentTimeMillis = longRef.element - System.currentTimeMillis();
                    long j = 120000;
                    if (currentTimeMillis > j) {
                        currentTimeMillis -= j;
                    }
                    if (currentTimeMillis < 600000) {
                        currentTimeMillis = 600000;
                    }
                    str2 = S3Util.TAG;
                    LogUtils.d(str2, "updateAwsCredentials after " + (currentTimeMillis / 1000) + 's');
                    this.label = 1;
                    if (DelayKt.delay(currentTimeMillis, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i2 != 2) {
                atomicBoolean4 = this.this$0.uploadingCredential;
                atomicBoolean4.set(false);
            } else {
                str3 = S3Util.TAG;
                LogUtils.d(str3, Intrinsics.stringPlus("updateAwsCredentials err.   ", uploadConfigBlocking.getException()));
                atomicBoolean3 = this.this$0.uploadingCredential;
                atomicBoolean3.set(false);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateAwsCredentials();
        return Unit.INSTANCE;
    }
}
