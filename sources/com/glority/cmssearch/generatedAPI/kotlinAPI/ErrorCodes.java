package com.glority.cmssearch.generatedAPI.kotlinAPI;

import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ErrorCodes.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/glority/cmssearch/generatedAPI/kotlinAPI/ErrorCodes;", "", "value", "", Args.title, "", "(Ljava/lang/String;IILjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getValue", "()I", "SUCCESS", "INTERNAL_ERROR", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public enum ErrorCodes {
    SUCCESS(1, ""),
    INTERNAL_ERROR(1000, "");

    private final String title;
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SparseArray<ErrorCodes> codeMap = new SparseArray<>();

    ErrorCodes(int i, String str) {
        this.value = i;
        this.title = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        int i = 0;
        ErrorCodes[] values = values();
        int length = values.length;
        while (i < length) {
            ErrorCodes errorCodes = values[i];
            i++;
            codeMap.put(errorCodes.value, errorCodes);
        }
    }

    /* compiled from: ErrorCodes.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/glority/cmssearch/generatedAPI/kotlinAPI/ErrorCodes$Companion;", "", "()V", "codeMap", "Landroid/util/SparseArray;", "Lcom/glority/cmssearch/generatedAPI/kotlinAPI/ErrorCodes;", "parse", "code", "", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ErrorCodes parse(int code) {
            ErrorCodes errorCodes = (ErrorCodes) ErrorCodes.codeMap.get(code);
            return errorCodes != null ? errorCodes : ErrorCodes.INTERNAL_ERROR;
        }
    }
}
