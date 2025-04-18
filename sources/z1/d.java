package z1;

import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.bumptech.glide.manager.n;
import com.facebook.internal.m0;
import com.facebook.k;
import com.facebook.q;
import com.google.android.gms.internal.play_billing.zzhe;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import e4.m;
import g4.g0;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;
import k4.f0;
import k4.o;
import k4.p;
import k4.y;
import k4.z;
import kotlin.jvm.internal.Intrinsics;
import n4.d0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements p3.b, f7.e, j4.d, z, o, d0, q4.a, n, x4.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28460b;

    public d() {
        this.f28460b = 3;
    }

    public static com.facebook.a k(JSONObject jsonObject) {
        ArrayList B;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (jsonObject.getInt("version") <= 1) {
            String token = jsonObject.getString(BidResponsed.KEY_TOKEN);
            Date date = new Date(jsonObject.getLong("expires_at"));
            JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
            JSONArray declinedPermissionsArray = jsonObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jsonObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jsonObject.getLong("last_refresh"));
            String string = jsonObject.getString("source");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
            k valueOf = k.valueOf(string);
            String applicationId = jsonObject.getString("application_id");
            String userId = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
            String optString = jsonObject.optString("graph_domain", null);
            Intrinsics.checkNotNullExpressionValue(token, "token");
            Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
            ArrayList B2 = m0.B(permissionsArray);
            Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
            ArrayList B3 = m0.B(declinedPermissionsArray);
            if (optJSONArray == null) {
                B = new ArrayList();
            } else {
                B = m0.B(optJSONArray);
            }
            return new com.facebook.a(token, applicationId, userId, B2, B3, B, valueOf, date, date2, date3, optString);
        }
        throw new q("Unknown AccessToken serialization format.");
    }

    public static com.facebook.a n() {
        return com.facebook.j.f11145f.B().f11148c;
    }

    public static boolean p() {
        com.facebook.a aVar = com.facebook.j.f11145f.B().f11148c;
        if (aVar != null && !new Date().after(aVar.f10883b)) {
            return true;
        }
        return false;
    }

    @Override // k4.o
    public final Class a() {
        return InputStream.class;
    }

    @Override // f7.e
    public final Object apply(Object obj) {
        return ((zzhe) obj).zzc();
    }

    @Override // k4.o
    public final void b(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // k4.z
    public final y c(k4.d0 d0Var) {
        int i10 = 0;
        switch (this.f28460b) {
            case 13:
                return new k4.e(new fb.c(this, 16), i10);
            case 14:
                return new k4.g(i10);
            case 15:
            default:
                return new f0(d0Var.b(p.class, InputStream.class), 1);
            case 16:
                return new f0(d0Var.b(Uri.class, AssetFileDescriptor.class), i10);
            case 17:
                return new f0(d0Var.b(Uri.class, InputStream.class), i10);
        }
    }

    @Override // p3.b
    public final boolean d(float f10) {
        throw new IllegalStateException("not implemented");
    }

    @Override // p3.b
    public final z3.a e() {
        throw new IllegalStateException("not implemented");
    }

    @Override // x4.a
    public final Object f() {
        return new ArrayList();
    }

    @Override // p3.b
    public final boolean g(float f10) {
        return false;
    }

    @Override // p3.b
    public final float h() {
        return 0.0f;
    }

    @Override // q4.a
    public final g0 i(g0 g0Var, m mVar) {
        e1.b bVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((d4.e) ((p4.c) g0Var.get()).f23419b.a.a).f16839d.asReadOnlyBuffer();
        AtomicReference atomicReference = w4.b.a;
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            bVar = new e1.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.f17069b == 0 && bVar.f17070c == ((byte[]) bVar.f17071d).length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new n4.z(bArr);
    }

    @Override // p3.b
    public final boolean isEmpty() {
        return true;
    }

    @Override // p3.b
    public final float j() {
        return 1.0f;
    }

    @Override // k4.o
    public final Object l(File file) {
        return new FileInputStream(file);
    }

    @Override // n4.d0
    public final void m(MediaExtractor mediaExtractor, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // j4.d
    public final void o(Throwable th2) {
        switch (this.f28460b) {
            case 11:
                return;
            default:
                throw new RuntimeException("Request threw uncaught throwable", th2);
        }
    }

    @Override // n4.d0
    public final void q(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    public /* synthetic */ d(int i10) {
        this.f28460b = i10;
    }

    public d(JSONObject jSONObject, int i10) {
        this.f28460b = i10;
        if (i10 != 7) {
            jSONObject.getInt("maximumQuantity");
            jSONObject.getInt("remainingQuantity");
        } else {
            jSONObject.getLong("startTimeMillis");
            jSONObject.getLong("endTimeMillis");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj) {
        this(4);
        this.f28460b = 4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(vd.e eVar) {
        this(19);
        this.f28460b = 19;
    }
}
