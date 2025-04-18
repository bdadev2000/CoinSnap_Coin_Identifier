package xg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k1;
import androidx.recyclerview.widget.r0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends r0 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27673c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27674d;

    public c(int i10, int i11, int i12, int i13) {
        this.a = i10;
        this.f27672b = i11;
        this.f27673c = i12;
        this.f27674d = i13;
    }

    @Override // androidx.recyclerview.widget.r0
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, k1 state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        if (parent.getChildAdapterPosition(view) >= 0) {
            outRect.left = this.a;
            outRect.top = this.f27672b;
            outRect.right = this.f27673c;
            outRect.bottom = this.f27674d;
        }
    }
}
