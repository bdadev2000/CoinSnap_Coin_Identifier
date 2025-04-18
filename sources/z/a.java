package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: j, reason: collision with root package name */
    public int f28297j;

    /* renamed from: k, reason: collision with root package name */
    public int f28298k;

    /* renamed from: l, reason: collision with root package name */
    public w.a f28299l;

    public a(Context context) {
        super(context);
        setVisibility(8);
    }

    @Override // z.c
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f28299l = new w.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f28445b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f28299l.f26544t0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f28299l.f26545u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f28309f = this.f28299l;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.f28299l.f26544t0;
    }

    public int getMargin() {
        return this.f28299l.f26545u0;
    }

    public int getType() {
        return this.f28297j;
    }

    @Override // z.c
    public final void h(w.e eVar, boolean z10) {
        int i10 = this.f28297j;
        this.f28298k = i10;
        if (z10) {
            if (i10 == 5) {
                this.f28298k = 1;
            } else if (i10 == 6) {
                this.f28298k = 0;
            }
        } else if (i10 == 5) {
            this.f28298k = 0;
        } else if (i10 == 6) {
            this.f28298k = 1;
        }
        if (eVar instanceof w.a) {
            ((w.a) eVar).f26543s0 = this.f28298k;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f28299l.f26544t0 = z10;
    }

    public void setDpMargin(int i10) {
        this.f28299l.f26545u0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f28299l.f26545u0 = i10;
    }

    public void setType(int i10) {
        this.f28297j = i10;
    }
}
