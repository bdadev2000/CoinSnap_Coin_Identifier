package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.layout.MeasureScope;
import b1.d0;
import e0.u;
import java.util.List;
import kotlin.jvm.internal.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ScrollableTabData {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollState f10850a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f10851b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f10852c;

    public ScrollableTabData(ScrollState scrollState, d0 d0Var) {
        this.f10850a = scrollState;
        this.f10851b = d0Var;
    }

    public final void a(MeasureScope measureScope, int i2, List list, int i3) {
        Integer num = this.f10852c;
        if (num != null && num.intValue() == i3) {
            return;
        }
        this.f10852c = Integer.valueOf(i3);
        TabPosition tabPosition = (TabPosition) u.G0(i3, list);
        if (tabPosition != null) {
            TabPosition tabPosition2 = (TabPosition) u.L0(list);
            int F0 = measureScope.F0(tabPosition2.f11794a + tabPosition2.f11795b) + i2;
            ScrollState scrollState = this.f10850a;
            int g2 = F0 - scrollState.d.g();
            int F02 = measureScope.F0(tabPosition.f11794a) - ((g2 / 2) - (measureScope.F0(tabPosition.f11795b) / 2));
            int i4 = F0 - g2;
            if (i4 < 0) {
                i4 = 0;
            }
            int A = p0.a.A(F02, 0, i4);
            if (scrollState.f2865a.g() != A) {
                e.v(this.f10851b, null, 0, new ScrollableTabData$onLaidOut$1$1(this, A, null), 3);
            }
        }
    }
}
