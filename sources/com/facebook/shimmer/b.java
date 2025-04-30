package com.facebook.shimmer;

import B1.f;
import android.content.res.TypedArray;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i9) {
        super(4);
        this.f13820d = i9;
        switch (i9) {
            case 1:
                super(4);
                return;
            default:
                ((c) this.f273c).f13833p = true;
                return;
        }
    }

    @Override // B1.f
    public f h(TypedArray typedArray) {
        switch (this.f13820d) {
            case 1:
                super.h(typedArray);
                boolean hasValue = typedArray.hasValue(2);
                c cVar = (c) this.f273c;
                if (hasValue) {
                    int color = typedArray.getColor(2, cVar.f13824e);
                    cVar.f13824e = (color & ViewCompat.MEASURED_SIZE_MASK) | (cVar.f13824e & ViewCompat.MEASURED_STATE_MASK);
                }
                if (typedArray.hasValue(12)) {
                    cVar.f13823d = typedArray.getColor(12, cVar.f13823d);
                }
                return this;
            default:
                return super.h(typedArray);
        }
    }

    @Override // B1.f
    public final f l() {
        int i9 = this.f13820d;
        return this;
    }
}
