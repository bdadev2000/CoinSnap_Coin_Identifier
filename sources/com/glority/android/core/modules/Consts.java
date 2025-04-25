package com.glority.android.core.modules;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* compiled from: Consts.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/glority/android/core/modules/Consts;", "", "()V", "QUERY_DATA", "", "getQUERY_DATA", "()Ljava/lang/String;", "SCHEME_CONSUMER", "getSCHEME_CONSUMER", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class Consts {
    public static final Consts INSTANCE = new Consts();
    private static final String SCHEME_CONSUMER = "cnglorityscanner://";
    private static final String QUERY_DATA = "?data=";

    private Consts() {
    }

    public final String getSCHEME_CONSUMER() {
        return SCHEME_CONSUMER;
    }

    public final String getQUERY_DATA() {
        return QUERY_DATA;
    }
}
