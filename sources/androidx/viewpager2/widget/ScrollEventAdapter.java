package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
final class ScrollEventAdapter extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public int f21788a;

    /* renamed from: b, reason: collision with root package name */
    public int f21789b;

    /* renamed from: c, reason: collision with root package name */
    public int f21790c;
    public int d;
    public boolean e;

    /* loaded from: classes.dex */
    public static final class ScrollEventValues {
    }

    public final void a(int i2) {
        if ((this.f21788a == 3 && this.f21789b == 0) || this.f21789b == i2) {
            return;
        }
        this.f21789b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
        int i3 = this.f21788a;
        if (!(i3 == 1 && this.f21789b == 1) && i2 == 1) {
            this.f21788a = 1;
            int i4 = this.d;
            if (i4 != -1) {
                this.f21790c = i4;
                this.d = -1;
            } else if (this.f21790c == -1) {
                throw null;
            }
            a(1);
            return;
        }
        if ((i3 == 1 || i3 == 4) && i2 == 2) {
            if (this.e) {
                a(2);
            }
        } else if ((i3 == 1 || i3 == 4) && i2 == 0) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        this.e = true;
        throw null;
    }
}
