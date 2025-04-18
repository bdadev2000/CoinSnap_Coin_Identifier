package z9;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import ea.h;
import ea.i;

/* loaded from: classes3.dex */
public final class b extends p6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f28657f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f28658g;

    public /* synthetic */ b(Object obj, int i10) {
        this.f28657f = i10;
        this.f28658g = obj;
    }

    @Override // p6.a
    public final void n(int i10) {
        switch (this.f28657f) {
            case 0:
                return;
            default:
                i iVar = (i) this.f28658g;
                iVar.f17253d = true;
                h hVar = (h) iVar.f17254e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.v();
                    fVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // p6.a
    public final void o(Typeface typeface, boolean z10) {
        CharSequence text;
        int i10 = this.f28657f;
        Object obj = this.f28658g;
        switch (i10) {
            case 0:
                Chip chip = (Chip) obj;
                f fVar = chip.f11642g;
                if (fVar.H0) {
                    text = fVar.I;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z10) {
                    i iVar = (i) obj;
                    iVar.f17253d = true;
                    h hVar = (h) iVar.f17254e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.v();
                        fVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
