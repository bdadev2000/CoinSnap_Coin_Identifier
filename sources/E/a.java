package E;

import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: j, reason: collision with root package name */
    public int f758j;

    /* renamed from: k, reason: collision with root package name */
    public int f759k;
    public B.a l;

    public boolean getAllowsGoneWidget() {
        return this.l.f86t0;
    }

    public int getMargin() {
        return this.l.f87u0;
    }

    public int getType() {
        return this.f758j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [B.a, B.i] */
    @Override // E.c
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        ?? iVar = new B.i();
        iVar.f85s0 = 0;
        iVar.f86t0 = true;
        iVar.f87u0 = 0;
        iVar.f88v0 = false;
        this.l = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = obtainStyledAttributes.getIndex(i9);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.l.f86t0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.l.f87u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f768f = this.l;
        k();
    }

    @Override // E.c
    public final void i(B.d dVar, boolean z8) {
        int i9 = this.f758j;
        this.f759k = i9;
        if (z8) {
            if (i9 == 5) {
                this.f759k = 1;
            } else if (i9 == 6) {
                this.f759k = 0;
            }
        } else if (i9 == 5) {
            this.f759k = 0;
        } else if (i9 == 6) {
            this.f759k = 1;
        }
        if (dVar instanceof B.a) {
            ((B.a) dVar).f85s0 = this.f759k;
        }
    }

    public void setAllowsGoneWidget(boolean z8) {
        this.l.f86t0 = z8;
    }

    public void setDpMargin(int i9) {
        this.l.f87u0 = (int) ((i9 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i9) {
        this.l.f87u0 = i9;
    }

    public void setType(int i9) {
        this.f758j = i9;
    }
}
