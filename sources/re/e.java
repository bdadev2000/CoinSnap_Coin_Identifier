package re;

import android.media.Image;

/* loaded from: classes4.dex */
public final class e extends d {
    public e(int i10) {
        super(Image.class, i10);
    }

    @Override // re.d
    public final void b(Object obj, boolean z10) {
        try {
            ((Image) obj).close();
        } catch (Exception unused) {
        }
    }
}
