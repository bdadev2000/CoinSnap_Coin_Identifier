package o4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.o;
import d3.g;
import h4.h;
import p4.e;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23132c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Drawable drawable, int i10) {
        super(drawable);
        this.f23132c = i10;
    }

    @Override // g4.g0
    public final void a() {
        h hVar;
        h hVar2;
        h hVar3;
        switch (this.f23132c) {
            case 0:
                return;
            default:
                p4.c cVar = (p4.c) this.f23131b;
                cVar.stop();
                cVar.f23422f = true;
                p4.h hVar4 = cVar.f23419b.a;
                hVar4.f23440c.clear();
                Bitmap bitmap = hVar4.f23449l;
                if (bitmap != null) {
                    hVar4.f23442e.a(bitmap);
                    hVar4.f23449l = null;
                }
                hVar4.f23443f = false;
                e eVar = hVar4.f23446i;
                o oVar = hVar4.f23441d;
                if (eVar != null) {
                    oVar.i(eVar);
                    hVar4.f23446i = null;
                }
                e eVar2 = hVar4.f23448k;
                if (eVar2 != null) {
                    oVar.i(eVar2);
                    hVar4.f23448k = null;
                }
                e eVar3 = hVar4.f23450m;
                if (eVar3 != null) {
                    oVar.i(eVar3);
                    hVar4.f23450m = null;
                }
                d4.e eVar4 = (d4.e) hVar4.a;
                eVar4.f16847l = null;
                byte[] bArr = eVar4.f16844i;
                g gVar = eVar4.f16838c;
                if (bArr != null && (hVar3 = (h) gVar.f16813d) != null) {
                    hVar3.g(bArr);
                }
                int[] iArr = eVar4.f16845j;
                if (iArr != null && (hVar2 = (h) gVar.f16813d) != null) {
                    hVar2.g(iArr);
                }
                Bitmap bitmap2 = eVar4.f16848m;
                if (bitmap2 != null) {
                    ((h4.d) gVar.f16812c).a(bitmap2);
                }
                eVar4.f16848m = null;
                eVar4.f16839d = null;
                eVar4.f16854s = null;
                byte[] bArr2 = eVar4.f16840e;
                if (bArr2 != null && (hVar = (h) gVar.f16813d) != null) {
                    hVar.g(bArr2);
                }
                hVar4.f23447j = true;
                return;
        }
    }

    @Override // g4.g0
    public final Class c() {
        switch (this.f23132c) {
            case 0:
                return this.f23131b.getClass();
            default:
                return p4.c.class;
        }
    }

    @Override // g4.g0
    public final int getSize() {
        int i10 = this.f23132c;
        Drawable drawable = this.f23131b;
        switch (i10) {
            case 0:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                p4.h hVar = ((p4.c) drawable).f23419b.a;
                d4.e eVar = (d4.e) hVar.a;
                return (eVar.f16845j.length * 4) + eVar.f16839d.limit() + eVar.f16844i.length + hVar.f23451n;
        }
    }

    @Override // g4.c0
    public final void initialize() {
        int i10 = this.f23132c;
        Drawable drawable = this.f23131b;
        switch (i10) {
            case 1:
                ((p4.c) drawable).f23419b.a.f23449l.prepareToDraw();
                return;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    return;
                } else {
                    if (drawable instanceof p4.c) {
                        ((p4.c) drawable).f23419b.a.f23449l.prepareToDraw();
                        return;
                    }
                    return;
                }
        }
    }
}
