package x7;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v8.u0;

/* loaded from: classes3.dex */
public final class f0 implements b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final hf.d f27448f = new hf.d();

    /* renamed from: b, reason: collision with root package name */
    public final UUID f27449b;

    /* renamed from: c, reason: collision with root package name */
    public final MediaDrm f27450c;

    /* renamed from: d, reason: collision with root package name */
    public int f27451d;

    public f0(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = s7.j.f24440b;
        u0.e(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f27449b = uuid;
        MediaDrm mediaDrm = new MediaDrm((n9.h0.a >= 27 || !s7.j.f24441c.equals(uuid)) ? uuid : uuid2);
        this.f27450c = mediaDrm;
        this.f27451d = 1;
        if (s7.j.f24442d.equals(uuid) && "ASUS_Z00AD".equals(n9.h0.f22546d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // x7.b0
    public final int a() {
        return 2;
    }

    @Override // x7.b0
    public final void b(final v3.c cVar) {
        this.f27450c.setOnEventListener(new MediaDrm.OnEventListener() { // from class: x7.d0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                f0 f0Var = f0.this;
                v3.c cVar2 = cVar;
                f0Var.getClass();
                f fVar = ((i) cVar2.f26021c).f27479y;
                fVar.getClass();
                fVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override // x7.b0
    public final w7.b c(byte[] bArr) {
        boolean z10;
        int i10 = n9.h0.a;
        UUID uuid = this.f27449b;
        if (i10 < 21 && s7.j.f24442d.equals(uuid) && "L3".equals(this.f27450c.getPropertyString("securityLevel"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 < 27 && s7.j.f24441c.equals(uuid)) {
            uuid = s7.j.f24440b;
        }
        return new c0(uuid, bArr, z10);
    }

    @Override // x7.b0
    public final void closeSession(byte[] bArr) {
        this.f27450c.closeSession(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a9, code lost:
    
        if (r5 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a3, code lost:
    
        if ("AFTT".equals(r5) == false) goto L86;
     */
    @Override // x7.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x7.z e(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.f0.e(byte[], java.util.List, int, java.util.HashMap):x7.z");
    }

    @Override // x7.b0
    public final void f(byte[] bArr, t7.x xVar) {
        if (n9.h0.a >= 31) {
            try {
                e0.b(this.f27450c, bArr, xVar);
            } catch (UnsupportedOperationException unused) {
                n9.o.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // x7.b0
    public final boolean g(String str, byte[] bArr) {
        if (n9.h0.a >= 31) {
            return e0.a(this.f27450c, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f27449b, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // x7.b0
    public final a0 getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f27450c.getProvisionRequest();
        return new a0(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // x7.b0
    public final byte[] openSession() {
        return this.f27450c.openSession();
    }

    @Override // x7.b0
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (s7.j.f24441c.equals(this.f27449b) && n9.h0.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(n9.h0.l(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K).replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = n9.h0.z(sb2.toString());
            } catch (JSONException e2) {
                n9.o.d("ClearKeyUtil", "Failed to adjust response data: ".concat(n9.h0.l(bArr2)), e2);
            }
        }
        return this.f27450c.provideKeyResponse(bArr, bArr2);
    }

    @Override // x7.b0
    public final void provideProvisionResponse(byte[] bArr) {
        this.f27450c.provideProvisionResponse(bArr);
    }

    @Override // x7.b0
    public final Map queryKeyStatus(byte[] bArr) {
        return this.f27450c.queryKeyStatus(bArr);
    }

    @Override // x7.b0
    public final synchronized void release() {
        int i10 = this.f27451d - 1;
        this.f27451d = i10;
        if (i10 == 0) {
            this.f27450c.release();
        }
    }

    @Override // x7.b0
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f27450c.restoreKeys(bArr, bArr2);
    }
}
