package com.applovin.impl;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.w6;
import com.applovin.impl.x7;
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
    public static final x7.c f8610d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final UUID f8611a;
    private final MediaDrm b;

    /* renamed from: c, reason: collision with root package name */
    private int f8612c;

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }
    }

    private k9(UUID uuid) {
        AbstractC0669a1.a(uuid);
        AbstractC0669a1.a(!AbstractC0744r2.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f8611a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.b = mediaDrm;
        this.f8612c = 1;
        if (AbstractC0744r2.f10446d.equals(uuid) && e()) {
            a(mediaDrm);
        }
    }

    private static boolean e() {
        return "ASUS_Z00AD".equals(yp.f12453d);
    }

    @Override // com.applovin.impl.x7
    public x7.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new x7.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.applovin.impl.x7
    public int c() {
        return 2;
    }

    @Override // com.applovin.impl.x7
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public j9 d(byte[] bArr) {
        boolean z8;
        if (yp.f12451a < 21 && AbstractC0744r2.f10446d.equals(this.f8611a) && "L3".equals(a("securityLevel"))) {
            z8 = true;
        } else {
            z8 = false;
        }
        return new j9(a(this.f8611a), bArr, z8);
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static byte[] e(byte[] bArr) {
        yg ygVar = new yg(bArr);
        int m = ygVar.m();
        short o3 = ygVar.o();
        short o9 = ygVar.o();
        if (o3 == 1 && o9 == 1) {
            short o10 = ygVar.o();
            Charset charset = Charsets.UTF_16LE;
            String a6 = ygVar.a(o10, charset);
            if (a6.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = a6.indexOf("</DATA>");
            if (indexOf == -1) {
                kc.d("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = a6.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + a6.substring(indexOf);
            int i9 = m + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i9);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i9);
            allocate.putShort(o3);
            allocate.putShort(o9);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        kc.c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    @Override // com.applovin.impl.x7
    public void c(byte[] bArr) {
        this.b.closeSession(bArr);
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
        } catch (UnsupportedSchemeException e4) {
            throw new tp(1, e4);
        } catch (Exception e9) {
            throw new tp(2, e9);
        }
    }

    @Override // com.applovin.impl.x7
    public x7.a a(byte[] bArr, List list, int i9, HashMap hashMap) {
        w6.b bVar;
        byte[] bArr2;
        String str;
        if (list != null) {
            bVar = a(this.f8611a, list);
            bArr2 = b(this.f8611a, (byte[]) AbstractC0669a1.a(bVar.f11948f));
            str = a(this.f8611a, bVar.f11947d);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i9, hashMap);
        byte[] a6 = a(this.f8611a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f11946c)) {
            defaultUrl = bVar.f11946c;
        }
        return new x7.a(a6, defaultUrl, yp.f12451a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.applovin.impl.x7
    public byte[] d() {
        return this.b.openSession();
    }

    @Override // com.applovin.impl.x7
    public Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // com.applovin.impl.x7
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (AbstractC0744r2.f10445c.equals(this.f8611a)) {
            bArr2 = AbstractC0701g3.b(bArr2);
        }
        return this.b.provideKeyResponse(bArr, bArr2);
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
            java.util.UUID r0 = com.applovin.impl.AbstractC0744r2.f10447e
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
            int r1 = com.applovin.impl.yp.f12451a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = com.applovin.impl.AbstractC0744r2.f10446d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.impl.yp.f12452c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.impl.yp.f12453d
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
        return this.b.getPropertyString(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(x7.b bVar, MediaDrm mediaDrm, byte[] bArr, int i9, int i10, byte[] bArr2) {
        bVar.a(this, bArr, i9, i10, bArr2);
    }

    @Override // com.applovin.impl.x7
    public void a(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // com.applovin.impl.x7
    public synchronized void a() {
        int i9 = this.f8612c - 1;
        this.f8612c = i9;
        if (i9 == 0) {
            this.b.release();
        }
    }

    @Override // com.applovin.impl.x7
    public void a(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // com.applovin.impl.x7
    public void a(final x7.b bVar) {
        this.b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: com.applovin.impl.S0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i9, int i10, byte[] bArr2) {
                k9.this.a(bVar, mediaDrm, bArr, i9, i10, bArr2);
            }
        });
    }

    @Override // com.applovin.impl.x7
    public boolean a(byte[] bArr, String str) {
        if (yp.f12451a >= 31) {
            return a.a(this.b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f8611a, bArr);
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
        if (!AbstractC0744r2.f10446d.equals(uuid)) {
            return (w6.b) list.get(0);
        }
        if (yp.f12451a >= 28 && list.size() > 1) {
            w6.b bVar = (w6.b) list.get(0);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                w6.b bVar2 = (w6.b) list.get(i10);
                byte[] bArr = (byte[]) AbstractC0669a1.a(bVar2.f11948f);
                if (yp.a((Object) bVar2.f11947d, (Object) bVar.f11947d) && yp.a((Object) bVar2.f11946c, (Object) bVar.f11946c) && fi.a(bArr)) {
                    i9 += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i9];
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                byte[] bArr3 = (byte[]) AbstractC0669a1.a(((w6.b) list.get(i12)).f11948f);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i11, length);
                i11 += length;
            }
            return bVar.a(bArr2);
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            w6.b bVar3 = (w6.b) list.get(i13);
            int d2 = fi.d((byte[]) AbstractC0669a1.a(bVar3.f11948f));
            int i14 = yp.f12451a;
            if (i14 < 23 && d2 == 0) {
                return bVar3;
            }
            if (i14 >= 23 && d2 == 1) {
                return bVar3;
            }
        }
        return (w6.b) list.get(0);
    }

    private static UUID a(UUID uuid) {
        return (yp.f12451a >= 27 || !AbstractC0744r2.f10445c.equals(uuid)) ? uuid : AbstractC0744r2.b;
    }

    private static String a(UUID uuid, String str) {
        return (yp.f12451a < 26 && AbstractC0744r2.f10445c.equals(uuid) && (MimeTypes.VIDEO_MP4.equals(str) || MimeTypes.AUDIO_MP4.equals(str))) ? com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cenc : str;
    }

    private static byte[] a(UUID uuid, byte[] bArr) {
        return AbstractC0744r2.f10445c.equals(uuid) ? AbstractC0701g3.a(bArr) : bArr;
    }
}
