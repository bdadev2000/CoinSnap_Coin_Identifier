package androidx.emoji2.text;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g extends v3.c {

    /* renamed from: d, reason: collision with root package name */
    public volatile t f1499d;

    /* renamed from: f, reason: collision with root package name */
    public volatile s2.h f1500f;

    public g(l lVar) {
        super(lVar, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0140, code lost:
    
        if (r5 != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[Catch: all -> 0x014d, TryCatch #0 {all -> 0x014d, blocks: (B:101:0x001b, B:104:0x0020, B:106:0x0024, B:108:0x0031, B:9:0x0044, B:11:0x004c, B:13:0x004f, B:15:0x0053, B:17:0x005f, B:19:0x0062, B:23:0x006f, B:26:0x0077, B:31:0x009c, B:56:0x00aa, B:61:0x00b6, B:62:0x00c0, B:43:0x00d7, B:46:0x00de, B:34:0x00e3, B:36:0x00ee, B:65:0x00f4, B:67:0x00f8, B:69:0x00fe, B:71:0x0102, B:77:0x010f, B:80:0x011b, B:81:0x0121, B:83:0x0136, B:6:0x0039), top: B:100:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011b A[Catch: all -> 0x014d, TryCatch #0 {all -> 0x014d, blocks: (B:101:0x001b, B:104:0x0020, B:106:0x0024, B:108:0x0031, B:9:0x0044, B:11:0x004c, B:13:0x004f, B:15:0x0053, B:17:0x005f, B:19:0x0062, B:23:0x006f, B:26:0x0077, B:31:0x009c, B:56:0x00aa, B:61:0x00b6, B:62:0x00c0, B:43:0x00d7, B:46:0x00de, B:34:0x00e3, B:36:0x00ee, B:65:0x00f4, B:67:0x00f8, B:69:0x00fe, B:71:0x0102, B:77:0x010f, B:80:0x011b, B:81:0x0121, B:83:0x0136, B:6:0x0039), top: B:100:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0136 A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #0 {all -> 0x014d, blocks: (B:101:0x001b, B:104:0x0020, B:106:0x0024, B:108:0x0031, B:9:0x0044, B:11:0x004c, B:13:0x004f, B:15:0x0053, B:17:0x005f, B:19:0x0062, B:23:0x006f, B:26:0x0077, B:31:0x009c, B:56:0x00aa, B:61:0x00b6, B:62:0x00c0, B:43:0x00d7, B:46:0x00de, B:34:0x00e3, B:36:0x00ee, B:65:0x00f4, B:67:0x00f8, B:69:0x00fe, B:71:0x0102, B:77:0x010f, B:80:0x011b, B:81:0x0121, B:83:0x0136, B:6:0x0039), top: B:100:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence F(java.lang.CharSequence r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.g.F(java.lang.CharSequence, int, int, boolean):java.lang.CharSequence");
    }

    public final void G(EditorInfo editorInfo) {
        int i10;
        Bundle bundle = editorInfo.extras;
        d1.b bVar = (d1.b) this.f1500f.f24169b;
        int a = bVar.a(4);
        if (a != 0) {
            i10 = ((ByteBuffer) bVar.f16791d).getInt(a + bVar.a);
        } else {
            i10 = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i10);
        Bundle bundle2 = editorInfo.extras;
        ((l) this.f26021c).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
