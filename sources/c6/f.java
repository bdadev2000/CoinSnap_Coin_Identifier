package c6;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {
    public final BigDecimal a;

    /* renamed from: b, reason: collision with root package name */
    public final Currency f2634b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2635c;

    public f(BigDecimal purchaseAmount, Currency currency, Bundle param) {
        Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(param, "param");
        this.a = purchaseAmount;
        this.f2634b = currency;
        this.f2635c = param;
    }
}
