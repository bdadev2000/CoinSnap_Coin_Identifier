package com.applovin.impl;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.y6;
import com.applovin.impl.z7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class m9 implements z7 {
    public static final z7.c d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final UUID f25225a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaDrm f25226b;

    /* renamed from: c, reason: collision with root package name */
    private int f25227c;

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }
    }

    private m9(UUID uuid) {
        b1.a(uuid);
        b1.a(!t2.f27006b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f25225a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f25226b = mediaDrm;
        this.f25227c = 1;
        if (t2.d.equals(uuid) && e()) {
            a(mediaDrm);
        }
    }

    private static boolean e() {
        return "ASUS_Z00AD".equals(xp.d);
    }

    @Override // com.applovin.impl.z7
    public z7.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f25226b.getProvisionRequest();
        return new z7.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.applovin.impl.z7
    public int c() {
        return 2;
    }

    @Override // com.applovin.impl.z7
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public l9 d(byte[] bArr) {
        return new l9(a(this.f25225a), bArr, xp.f27962a < 21 && t2.d.equals(this.f25225a) && "L3".equals(a("securityLevel")));
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static byte[] e(byte[] bArr) {
        bh bhVar = new bh(bArr);
        int m2 = bhVar.m();
        short o2 = bhVar.o();
        short o3 = bhVar.o();
        if (o2 == 1 && o3 == 1) {
            short o4 = bhVar.o();
            Charset charset = Charsets.UTF_16LE;
            String a2 = bhVar.a(o4, charset);
            if (a2.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = a2.indexOf("</DATA>");
            if (indexOf == -1) {
                pc.d("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = a2.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + a2.substring(indexOf);
            int i2 = m2 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i2);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i2);
            allocate.putShort(o2);
            allocate.putShort(o3);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(charset));
            return allocate.array();
        }
        pc.c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    @Override // com.applovin.impl.z7
    public void c(byte[] bArr) {
        this.f25226b.closeSession(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z7 b(UUID uuid) {
        try {
            return c(uuid);
        } catch (sp unused) {
            pc.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new g7();
        }
    }

    public static m9 c(UUID uuid) {
        try {
            return new m9(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new sp(1, e);
        } catch (Exception e2) {
            throw new sp(2, e2);
        }
    }

    @Override // com.applovin.impl.z7
    public z7.a a(byte[] bArr, List list, int i2, HashMap hashMap) {
        y6.b bVar;
        byte[] bArr2;
        String str;
        if (list != null) {
            bVar = a(this.f25225a, list);
            bArr2 = b(this.f25225a, (byte[]) b1.a(bVar.f28117f));
            str = a(this.f25225a, bVar.d);
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f25226b.getKeyRequest(bArr, bArr2, str, i2, hashMap);
        byte[] a2 = a(this.f25225a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f28116c)) {
            defaultUrl = bVar.f28116c;
        }
        return new z7.a(a2, defaultUrl, xp.f27962a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.applovin.impl.z7
    public byte[] d() {
        return this.f25226b.openSession();
    }

    @Override // com.applovin.impl.z7
    public Map b(byte[] bArr) {
        return this.f25226b.queryKeyStatus(bArr);
    }

    @Override // com.applovin.impl.z7
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (t2.f27007c.equals(this.f25225a)) {
            bArr2 = i3.b(bArr2);
        }
        return this.f25226b.provideKeyResponse(bArr, bArr2);
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
            java.util.UUID r0 = com.applovin.impl.t2.e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = com.applovin.impl.ji.a(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = e(r4)
            byte[] r4 = com.applovin.impl.ji.a(r0, r4)
        L18:
            int r1 = com.applovin.impl.xp.f27962a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = com.applovin.impl.t2.d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.impl.xp.f27964c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.impl.xp.d
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
            byte[] r3 = com.applovin.impl.ji.a(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.m9.b(java.util.UUID, byte[]):byte[]");
    }

    public String a(String str) {
        return this.f25226b.getPropertyString(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(z7.b bVar, MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
        bVar.a(this, bArr, i2, i3, bArr2);
    }

    @Override // com.applovin.impl.z7
    public void a(byte[] bArr) {
        this.f25226b.provideProvisionResponse(bArr);
    }

    @Override // com.applovin.impl.z7
    public synchronized void a() {
        int i2 = this.f25227c - 1;
        this.f25227c = i2;
        if (i2 == 0) {
            this.f25226b.release();
        }
    }

    @Override // com.applovin.impl.z7
    public void a(byte[] bArr, byte[] bArr2) {
        this.f25226b.restoreKeys(bArr, bArr2);
    }

    @Override // com.applovin.impl.z7
    public void a(final z7.b bVar) {
        this.f25226b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: com.applovin.impl.hu
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
                m9.this.a(bVar, mediaDrm, bArr, i2, i3, bArr2);
            }
        });
    }

    @Override // com.applovin.impl.z7
    public boolean a(byte[] bArr, String str) {
        if (xp.f27962a >= 31) {
            return a.a(this.f25226b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f25225a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private static y6.b a(UUID uuid, List list) {
        if (!t2.d.equals(uuid)) {
            return (y6.b) list.get(0);
        }
        if (xp.f27962a >= 28 && list.size() > 1) {
            y6.b bVar = (y6.b) list.get(0);
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                y6.b bVar2 = (y6.b) list.get(i3);
                byte[] bArr = (byte[]) b1.a(bVar2.f28117f);
                if (xp.a((Object) bVar2.d, (Object) bVar.d) && xp.a((Object) bVar2.f28116c, (Object) bVar.f28116c) && ji.a(bArr)) {
                    i2 += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i2];
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                byte[] bArr3 = (byte[]) b1.a(((y6.b) list.get(i5)).f28117f);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i4, length);
                i4 += length;
            }
            return bVar.a(bArr2);
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            y6.b bVar3 = (y6.b) list.get(i6);
            int d2 = ji.d((byte[]) b1.a(bVar3.f28117f));
            int i7 = xp.f27962a;
            if (i7 < 23 && d2 == 0) {
                return bVar3;
            }
            if (i7 >= 23 && d2 == 1) {
                return bVar3;
            }
        }
        return (y6.b) list.get(0);
    }

    private static UUID a(UUID uuid) {
        return (xp.f27962a >= 27 || !t2.f27007c.equals(uuid)) ? uuid : t2.f27006b;
    }

    private static String a(UUID uuid, String str) {
        return (xp.f27962a < 26 && t2.f27007c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static byte[] a(UUID uuid, byte[] bArr) {
        return t2.f27007c.equals(uuid) ? i3.a(bArr) : bArr;
    }
}
