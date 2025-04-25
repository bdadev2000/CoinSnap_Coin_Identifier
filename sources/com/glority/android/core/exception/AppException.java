package com.glority.android.core.exception;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AppException.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0002\u000b\fB\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/glority/android/core/exception/AppException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", NotificationCompat.CATEGORY_MESSAGE, "", "code", "", "(Ljava/lang/String;I)V", "<set-?>", "getCode", "()I", "AppError", "Companion", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public class AppException extends RuntimeException {
    private static final long serialVersionUID = -7066897190745466939L;
    private int code;

    public AppException() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AppException(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? AppError.APP_ERROR_UNKNOWN.getValue() : i);
    }

    public AppException(String str, int i) {
        super(str);
        AppError.APP_ERROR_UNKNOWN.getValue();
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    /* compiled from: AppException.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/core/exception/AppException$AppError;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "APP_ERROR_UNKNOWN", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes7.dex */
    public enum AppError {
        APP_ERROR_UNKNOWN(-1);

        private final int value;

        AppError(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }
}
