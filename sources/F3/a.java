package F3;

import L3.h;
import L3.i;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
public final class a extends com.bumptech.glide.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1146e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i9) {
        super(3);
        this.f1145d = i9;
        this.f1146e = obj;
    }

    @Override // com.bumptech.glide.c
    public final void P(int i9) {
        switch (this.f1145d) {
            case 0:
                return;
            default:
                i iVar = (i) this.f1146e;
                iVar.f1797d = true;
                h hVar = (h) iVar.f1798e.get();
                if (hVar != null) {
                    e eVar = (e) hVar;
                    eVar.v();
                    eVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // com.bumptech.glide.c
    public final void Q(Typeface typeface, boolean z8) {
        CharSequence text;
        switch (this.f1145d) {
            case 0:
                Chip chip = (Chip) this.f1146e;
                e eVar = chip.f13993g;
                if (eVar.f1162F0) {
                    text = eVar.f1163G;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z8) {
                    i iVar = (i) this.f1146e;
                    iVar.f1797d = true;
                    h hVar = (h) iVar.f1798e.get();
                    if (hVar != null) {
                        e eVar2 = (e) hVar;
                        eVar2.v();
                        eVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void W(int i9) {
    }
}
