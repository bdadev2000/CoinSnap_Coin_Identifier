package com.facebook.shimmer;

import android.content.res.TypedArray;
import androidx.core.view.ViewCompat;
import l0.h;

/* loaded from: classes3.dex */
public final class b extends h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10) {
        super(6);
        this.f11369d = i10;
        if (i10 != 1) {
            ((c) this.f21106c).f11384p = true;
        } else {
            super(6);
            ((c) this.f21106c).f11384p = false;
        }
    }

    @Override // l0.h
    public final h e(TypedArray typedArray) {
        switch (this.f11369d) {
            case 1:
                super.e(typedArray);
                if (typedArray.hasValue(2)) {
                    int color = typedArray.getColor(2, ((c) this.f21106c).f11373e);
                    c cVar = (c) this.f21106c;
                    cVar.f11373e = (color & ViewCompat.MEASURED_SIZE_MASK) | (cVar.f11373e & ViewCompat.MEASURED_STATE_MASK);
                }
                if (typedArray.hasValue(12)) {
                    ((c) this.f21106c).f11372d = typedArray.getColor(12, ((c) this.f21106c).f11372d);
                }
                return this;
            default:
                return super.e(typedArray);
        }
    }
}
