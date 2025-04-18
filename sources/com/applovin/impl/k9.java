package com.applovin.impl;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.w6;
import com.applovin.impl.x7;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class k9 implements x7 {

    /* renamed from: d, reason: collision with root package name */
    public static final x7.c f5638d = new x7.c() { // from class: com.applovin.impl.au
        @Override // com.applovin.impl.x7.c
        public final x7 a(UUID uuid) {
            x7 b3;
            b3 = k9.b(uuid);
            return b3;
        }
    };
    private final UUID a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaDrm f5639b;

    /* renamed from: c, reason: collision with root package name */
    private int f5640c;

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return androidx.core.app.c.x(mediaDrm, str);
        }
    }

    private k9(UUID uuid) {
        a1.a(uuid);
        a1.a(!r2.f7310b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f5639b = mediaDrm;
        this.f5640c = 1;
        if (r2.f7312d.equals(uuid) && e()) {
            a(mediaDrm);
        }
    }

    private static boolean e() {
        return "ASUS_Z00AD".equals(yp.f9255d);
    }

    @Override // com.applovin.impl.x7
    public x7.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f5639b.getProvisionRequest();
        return new x7.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.applovin.impl.x7
    public int c() {
        return 2;
    }

    @Override // com.applovin.impl.x7
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public j9 d(byte[] bArr) {
        boolean z10;
        if (yp.a < 21 && r2.f7312d.equals(this.a) && "L3".equals(a("securityLevel"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new j9(a(this.a), bArr, z10);
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static byte[] e(byte[] bArr) {
        yg ygVar = new yg(bArr);
        int m10 = ygVar.m();
        short o10 = ygVar.o();
        short o11 = ygVar.o();
        if (o10 == 1 && o11 == 1) {
            short o12 = ygVar.o();
            Charset charset = Charsets.UTF_16LE;
            String a10 = ygVar.a(o12, charset);
            if (a10.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = a10.indexOf("</DATA>");
            if (indexOf == -1) {
                kc.d("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = a10.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + a10.substring(indexOf);
            int i10 = m10 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i10);
            allocate.putShort(o10);
            allocate.putShort(o11);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        kc.c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    @Override // com.applovin.impl.x7
    public void c(byte[] bArr) {
        this.f5639b.closeSession(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x7 b(UUID uuid) {
        try {
            return c(uuid);
        } catch (tp unused) {
            kc.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new e7();
        }
    }

    public static k9 c(UUID uuid) {
        try {
            return new k9(uuid);
        } catch (UnsupportedSchemeException e2) {
            throw new tp(1, e2);
        } catch (Exception e10) {
            throw new tp(2, e10);
        }
    }

    @Override // com.applovin.impl.x7
    public x7.a a(byte[] bArr, List list, int i10, HashMap hashMap) {
        w6.b bVar;
        byte[] bArr2;
        String str;
        if (list != null) {
            bVar = a(this.a, list);
            bArr2 = b(this.a, (byte[]) a1.a(bVar.f8735f));
            str = a(this.a, bVar.f8734d);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f5639b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] a10 = a(this.a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f8733c)) {
            defaultUrl = bVar.f8733c;
        }
        return new x7.a(a10, defaultUrl, yp.a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.applovin.impl.x7
    public byte[] d() {
        return this.f5639b.openSession();
    }

    @Override // com.applovin.impl.x7
    public Map b(byte[] bArr) {
        return this.f5639b.queryKeyStatus(bArr);
    }

    @Override // com.applovin.impl.x7
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (r2.f7311c.equals(this.a)) {
            bArr2 = g3.b(bArr2);
        }
        return this.f5639b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if ("AFTT".equals(r0) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] b(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = com.applovin.impl.r2.f7313e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = com.applovin.impl.fi.a(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = e(r4)
            byte[] r4 = com.applovin.impl.fi.a(r0, r4)
        L18:
            int r1 = com.applovin.impl.yp.a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = com.applovin.impl.r2.f7312d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.impl.yp.f9254c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.impl.yp.f9255d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = com.applovin.impl.fi.a(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k9.b(java.util.UUID, byte[]):byte[]");
    }

    public String a(String str) {
        return this.f5639b.getPropertyString(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(x7.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    @Override // com.applovin.impl.x7
    public void a(byte[] bArr) {
        this.f5639b.provideProvisionResponse(bArr);
    }

    @Override // com.applovin.impl.x7
    public synchronized void a() {
        int i10 = this.f5640c - 1;
        this.f5640c = i10;
        if (i10 == 0) {
            this.f5639b.release();
        }
    }

    @Override // com.applovin.impl.x7
    public void a(byte[] bArr, byte[] bArr2) {
        this.f5639b.restoreKeys(bArr, bArr2);
    }

    @Override // com.applovin.impl.x7
    public void a(final x7.b bVar) {
        this.f5639b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: com.applovin.impl.zt
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                k9.this.a(bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // com.applovin.impl.x7
    public boolean a(byte[] bArr, String str) {
        if (yp.a >= 31) {
            return a.a(this.f5639b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private static w6.b a(UUID uuid, List list) {
        if (!r2.f7312d.equals(uuid)) {
            return (w6.b) list.get(0);
        }
        if (yp.a >= 28 && list.size() > 1) {
            w6.b bVar = (w6.b) list.get(0);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                w6.b bVar2 = (w6.b) list.get(i11);
                byte[] bArr = (byte[]) a1.a(bVar2.f8735f);
                if (yp.a((Object) bVar2.f8734d, (Object) bVar.f8734d) && yp.a((Object) bVar2.f8733c, (Object) bVar.f8733c) && fi.a(bArr)) {
                    i10 += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i10];
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                byte[] bArr3 = (byte[]) a1.a(((w6.b) list.get(i13)).f8735f);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i12, length);
                i12 += length;
            }
            return bVar.a(bArr2);
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            w6.b bVar3 = (w6.b) list.get(i14);
            int d10 = fi.d((byte[]) a1.a(bVar3.f8735f));
            int i15 = yp.a;
            if (i15 < 23 && d10 == 0) {
                return bVar3;
            }
            if (i15 >= 23 && d10 == 1) {
                return bVar3;
            }
        }
        return (w6.b) list.get(0);
    }

    private static UUID a(UUID uuid) {
        return (yp.a >= 27 || !r2.f7311c.equals(uuid)) ? uuid : r2.f7310b;
    }

    private static String a(UUID uuid, String str) {
        return (yp.a < 26 && r2.f7311c.equals(uuid) && (MimeTypes.VIDEO_MP4.equals(str) || MimeTypes.AUDIO_MP4.equals(str))) ? C.CENC_TYPE_cenc : str;
    }

    private static byte[] a(UUID uuid, byte[] bArr) {
        return r2.f7311c.equals(uuid) ? g3.a(bArr) : bArr;
    }
}
