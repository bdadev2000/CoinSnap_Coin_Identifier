package com.glority.base.utils.data;

import android.content.DialogInterface;
import android.os.Process;
import androidx.appcompat.app.AlertDialog;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.route.analysis.LogExceptionRequest;
import com.glority.base.R;
import com.glority.component.generatedAPI.kotlinAPI.ErrorCodes;
import com.glority.network.exception.NetworkException;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.UtilsApp;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResponseUtil.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nJ\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/base/utils/data/ResponseUtil;", "", "<init>", "()V", "handleResult", "", ExifInterface.GPS_DIRECTION_TRUE, "resource", "Lcom/glority/network/model/Resource;", "responseHandler", "Lcom/glority/base/utils/data/ResponseHandler;", "handleError", "e", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ResponseUtil {
    public static final int $stable = 0;
    public static final ResponseUtil INSTANCE = new ResponseUtil();

    /* compiled from: ResponseUtil.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ErrorCodes.values().length];
            try {
                iArr2[ErrorCodes.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ErrorCodes.ITEM_NOT_EXIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ErrorCodes.INVALID_ARGUMENT_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ErrorCodes.SERVER_IN_MAINTAIN_MODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private ResponseUtil() {
    }

    public final <T> void handleResult(Resource<? extends T> resource, ResponseHandler<T> responseHandler) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(responseHandler, "responseHandler");
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            responseHandler.success(resource.getData());
        } else if (i == 2) {
            responseHandler.error(resource.getException());
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            responseHandler.loading(resource.getData());
        }
    }

    public final void handleError(Throwable e) {
        if (e instanceof NetworkException) {
            NetworkException networkException = (NetworkException) e;
            int i = WhenMappings.$EnumSwitchMapping$1[ErrorCodes.INSTANCE.parse(networkException.getCode()).ordinal()];
            if (i == 1) {
                ToastUtils.showShort(R.string.error_text_internal_error);
                LogUtils.e(networkException.getApiName(), networkException.getMessage());
                networkException.printStackTrace();
            } else if (i == 2 || i == 3) {
                ToastUtils.showShort(networkException.getMessage(), new Object[0]);
            } else if (i == 4) {
                new AlertDialog.Builder(UtilsApp.getApp()).setMessage(networkException.getMessage()).setPositiveButton(R.string.text_confirm, new DialogInterface.OnClickListener() { // from class: com.glority.base.utils.data.ResponseUtil$$ExternalSyntheticLambda0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ResponseUtil.handleError$lambda$0(dialogInterface, i2);
                    }
                }).setCancelable(false).create().show();
            } else {
                LogUtils.e(networkException.getApiName(), networkException.getMessage());
                networkException.printStackTrace();
            }
            new LogExceptionRequest(e).post();
            return;
        }
        new LogExceptionRequest(e).post();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleError$lambda$0(DialogInterface dialogInterface, int i) {
        Process.killProcess(Process.myPid());
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
