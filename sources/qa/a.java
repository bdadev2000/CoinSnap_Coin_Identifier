package qa;

import a4.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import com.bumptech.glide.e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import dd.b;
import ic.t;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import jb.k;
import jb.m;
import ka.f;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;
import s2.h;
import sd.c;
import sd.d;
import uc.n;
import uc.w;
import va.g;
import w3.l;
import y7.q;
import y7.u;

/* loaded from: classes3.dex */
public final class a implements SuccessContinuation, n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23735b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23736c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23737d;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static qa.a d(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2b java.io.IOException -> L2d
            qa.a r2 = new qa.a     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 9
            r2.<init>(r5, r0, r3)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L39
        L25:
            r2 = move-exception
            goto L39
        L27:
            r2 = move-exception
            goto L39
        L29:
            r0 = move-exception
            goto L2e
        L2b:
            r0 = move-exception
            goto L2e
        L2d:
            r0 = move-exception
        L2e:
            r2 = r0
            r0 = r1
            goto L39
        L31:
            r5 = move-exception
            goto L36
        L33:
            r5 = move-exception
            goto L36
        L35:
            r5 = move-exception
        L36:
            r2 = r5
            r5 = r1
            r0 = r5
        L39:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L45
            r0.release()     // Catch: java.io.IOException -> L45
        L45:
            if (r5 == 0) goto L4a
            r5.close()     // Catch: java.io.IOException -> L4a
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.a.d(android.content.Context):qa.a");
    }

    public final void a(JSONObject jSONObject) {
        switch (this.f23735b) {
            case 16:
                this.f23736c = jSONObject;
                return;
            default:
                this.f23736c = jSONObject;
                return;
        }
    }

    @Override // uc.n
    public final Object b() {
        try {
            return w.a.b((Class) this.f23736c);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to create instance of " + ((Class) this.f23736c) + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e2);
        }
    }

    public final void c(JSONObject jSONObject, HashSet hashSet, long j3) {
        switch (this.f23735b) {
            case 16:
                ((t) this.f23737d).d(new d(this, hashSet, jSONObject, j3, 0));
                return;
            default:
                ((h) this.f23737d).h(new be.d(this, hashSet, jSONObject, j3, 0));
                return;
        }
    }

    public final void e() {
        switch (this.f23735b) {
            case 16:
                ((t) this.f23737d).d(new c(this));
                return;
            default:
                ((h) this.f23737d).h(new be.c(this));
                return;
        }
    }

    public final void f(JSONObject jSONObject, HashSet hashSet, long j3) {
        switch (this.f23735b) {
            case 16:
                ((t) this.f23737d).d(new d(this, hashSet, jSONObject, j3, 1));
                return;
            default:
                ((h) this.f23737d).h(new be.d(this, hashSet, jSONObject, j3, 1));
                return;
        }
    }

    public final void g() {
        try {
            ob.c cVar = (ob.c) this.f23737d;
            String str = (String) this.f23736c;
            cVar.getClass();
            new File((File) cVar.f23293c, str).createNewFile();
        } catch (IOException e2) {
            b6.a.f2288f.e("Error creating marker: " + ((String) this.f23736c), e2);
        }
    }

    public final void h(int i10, int[] iArr) {
        int[] iArr2;
        b bVar;
        if (i10 != 0) {
            int length = iArr.length - i10;
            if (length > 0) {
                int i11 = 0;
                int i12 = 1;
                if (i10 >= ((List) this.f23737d).size()) {
                    List list = (List) this.f23737d;
                    b bVar2 = (b) list.get(list.size() - 1);
                    int size = ((List) this.f23737d).size();
                    while (size <= i10) {
                        dd.a aVar = (dd.a) this.f23736c;
                        int[] iArr3 = new int[2];
                        iArr3[i11] = i12;
                        iArr3[i12] = aVar.a[(size - 1) + aVar.f17000f];
                        b bVar3 = new b(aVar, iArr3);
                        bVar2.getClass();
                        dd.a aVar2 = bVar2.a;
                        if (aVar2.equals(aVar)) {
                            if (!bVar2.b() && !bVar3.b()) {
                                int[] iArr4 = bVar2.f17001b;
                                int length2 = iArr4.length;
                                int[] iArr5 = bVar3.f17001b;
                                int length3 = iArr5.length;
                                int[] iArr6 = new int[(length2 + length3) - 1];
                                int i13 = i11;
                                while (i11 < length2) {
                                    int i14 = iArr4[i11];
                                    while (i13 < length3) {
                                        int i15 = i11 + i13;
                                        iArr6[i15] = aVar2.a(i14, iArr5[i13]) ^ iArr6[i15];
                                        i13++;
                                        iArr4 = iArr4;
                                    }
                                    i11++;
                                    i13 = 0;
                                }
                                bVar2 = new b(aVar2, iArr6);
                            } else {
                                bVar2 = aVar2.f16997c;
                            }
                            ((List) this.f23737d).add(bVar2);
                            size++;
                            i11 = 0;
                            i12 = 1;
                        } else {
                            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                        }
                    }
                }
                b bVar4 = (b) ((List) this.f23737d).get(i10);
                int[] iArr7 = new int[length];
                System.arraycopy(iArr, 0, iArr7, 0, length);
                b c10 = new b((dd.a) this.f23736c, iArr7).c(i10, 1);
                c10.getClass();
                dd.a aVar3 = bVar4.a;
                dd.a aVar4 = c10.a;
                if (aVar4.equals(aVar3)) {
                    if (!bVar4.b()) {
                        if (bVar4.f17001b[(r6.length - 1) - (r6.length - 1)] != 0) {
                            int i16 = aVar4.a[(aVar4.f16998d - aVar4.f16996b[r7]) - 1];
                            b bVar5 = aVar4.f16997c;
                            b bVar6 = bVar5;
                            while (true) {
                                iArr2 = c10.f17001b;
                                if (iArr2.length - 1 < r6.length - 1 || c10.b()) {
                                    break;
                                }
                                int length4 = (iArr2.length - 1) - (r6.length - 1);
                                int length5 = iArr2.length - 1;
                                int a = aVar4.a(c10.f17001b[(r13.length - 1) - length5], i16);
                                b c11 = bVar4.c(length4, a);
                                if (length4 >= 0) {
                                    if (a == 0) {
                                        bVar = bVar5;
                                    } else {
                                        int[] iArr8 = new int[length4 + 1];
                                        iArr8[0] = a;
                                        bVar = new b(aVar4, iArr8);
                                    }
                                    bVar6 = bVar6.a(bVar);
                                    c10 = c10.a(c11);
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                            int length6 = i10 - iArr2.length;
                            for (int i17 = 0; i17 < length6; i17++) {
                                iArr[length + i17] = 0;
                            }
                            System.arraycopy(iArr2, 0, iArr, length + length6, iArr2.length);
                            return;
                        }
                        throw new ArithmeticException();
                    }
                    throw new IllegalArgumentException("Divide by 0");
                }
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: JSONException -> 0x00b2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00b2, blocks: (B:5:0x0013, B:7:0x002a, B:8:0x003c, B:13:0x0056, B:22:0x006c, B:24:0x0075, B:26:0x007f, B:28:0x0083, B:30:0x009a, B:31:0x00a1, B:34:0x00a2, B:35:0x00a9, B:37:0x00aa, B:38:0x00b1), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[Catch: JSONException -> 0x00b2, TryCatch #0 {JSONException -> 0x00b2, blocks: (B:5:0x0013, B:7:0x002a, B:8:0x003c, B:13:0x0056, B:22:0x006c, B:24:0x0075, B:26:0x007f, B:28:0x0083, B:30:0x009a, B:31:0x00a1, B:34:0x00a2, B:35:0x00a9, B:37:0x00aa, B:38:0x00b1), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pc.e i(mc.f r14) {
        /*
            r13 = this;
            java.lang.String r0 = ""
            long r1 = r14.f22171f
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4 = 0
            r5 = r4
        Lb:
            org.json.JSONArray r6 = r14.f22172g
            int r7 = r6.length()
            if (r5 >= r7) goto Lbb
            org.json.JSONObject r6 = r6.getJSONObject(r5)     // Catch: org.json.JSONException -> Lb2
            java.lang.String r7 = "rolloutId"
            java.lang.String r7 = r6.getString(r7)     // Catch: org.json.JSONException -> Lb2
            java.lang.String r8 = "affectedParameterKeys"
            org.json.JSONArray r8 = r6.getJSONArray(r8)     // Catch: org.json.JSONException -> Lb2
            int r9 = r8.length()     // Catch: org.json.JSONException -> Lb2
            r10 = 1
            if (r9 <= r10) goto L3c
            java.lang.String r9 = "FirebaseRemoteConfig"
            java.lang.String r11 = "Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s"
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: org.json.JSONException -> Lb2
            r12[r4] = r7     // Catch: org.json.JSONException -> Lb2
            r12[r10] = r8     // Catch: org.json.JSONException -> Lb2
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch: org.json.JSONException -> Lb2
            android.util.Log.w(r9, r11)     // Catch: org.json.JSONException -> Lb2
        L3c:
            java.lang.String r8 = r8.optString(r4, r0)     // Catch: org.json.JSONException -> Lb2
            java.lang.Object r9 = r13.f23736c     // Catch: org.json.JSONException -> Lb2
            mc.d r9 = (mc.d) r9     // Catch: org.json.JSONException -> Lb2
            mc.f r9 = r9.c()     // Catch: org.json.JSONException -> Lb2
            r11 = 0
            if (r9 != 0) goto L4d
        L4b:
            r9 = r11
            goto L53
        L4d:
            org.json.JSONObject r9 = r9.f22167b     // Catch: org.json.JSONException -> L4b
            java.lang.String r9 = r9.getString(r8)     // Catch: org.json.JSONException -> L4b
        L53:
            if (r9 == 0) goto L56
            goto L6c
        L56:
            java.lang.Object r9 = r13.f23737d     // Catch: org.json.JSONException -> Lb2
            mc.d r9 = (mc.d) r9     // Catch: org.json.JSONException -> Lb2
            mc.f r9 = r9.c()     // Catch: org.json.JSONException -> Lb2
            if (r9 != 0) goto L61
            goto L67
        L61:
            org.json.JSONObject r9 = r9.f22167b     // Catch: org.json.JSONException -> L67
            java.lang.String r11 = r9.getString(r8)     // Catch: org.json.JSONException -> L67
        L67:
            if (r11 == 0) goto L6b
            r9 = r11
            goto L6c
        L6b:
            r9 = r0
        L6c:
            int r11 = pc.f.a     // Catch: org.json.JSONException -> Lb2
            pc.c r11 = new pc.c     // Catch: org.json.JSONException -> Lb2
            r11.<init>()     // Catch: org.json.JSONException -> Lb2
            if (r7 == 0) goto Laa
            r11.a = r7     // Catch: org.json.JSONException -> Lb2
            java.lang.String r7 = "variantId"
            java.lang.String r6 = r6.getString(r7)     // Catch: org.json.JSONException -> Lb2
            if (r6 == 0) goto La2
            r11.f23584b = r6     // Catch: org.json.JSONException -> Lb2
            if (r8 == 0) goto L9a
            r11.f23585c = r8     // Catch: org.json.JSONException -> Lb2
            r11.f23586d = r9     // Catch: org.json.JSONException -> Lb2
            r11.f23587e = r1     // Catch: org.json.JSONException -> Lb2
            byte r6 = r11.f23588f     // Catch: org.json.JSONException -> Lb2
            r6 = r6 | r10
            byte r6 = (byte) r6     // Catch: org.json.JSONException -> Lb2
            r11.f23588f = r6     // Catch: org.json.JSONException -> Lb2
            pc.d r6 = r11.a()     // Catch: org.json.JSONException -> Lb2
            r3.add(r6)     // Catch: org.json.JSONException -> Lb2
            int r5 = r5 + 1
            goto Lb
        L9a:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> Lb2
            java.lang.String r0 = "Null parameterKey"
            r14.<init>(r0)     // Catch: org.json.JSONException -> Lb2
            throw r14     // Catch: org.json.JSONException -> Lb2
        La2:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> Lb2
            java.lang.String r0 = "Null variantId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> Lb2
            throw r14     // Catch: org.json.JSONException -> Lb2
        Laa:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> Lb2
            java.lang.String r0 = "Null rolloutId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> Lb2
            throw r14     // Catch: org.json.JSONException -> Lb2
        Lb2:
            r14 = move-exception
            lc.c r0 = new lc.c
            java.lang.String r1 = "Exception parsing rollouts metadata to create RolloutsState."
            r0.<init>(r1, r14)
            throw r0
        Lbb:
            pc.e r14 = new pc.e
            r14.<init>(r3)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.a.i(mc.f):pc.e");
    }

    public final File j() {
        if (((File) this.f23736c) == null) {
            synchronized (this) {
                if (((File) this.f23736c) == null) {
                    g gVar = (g) this.f23737d;
                    gVar.a();
                    this.f23736c = new File(gVar.a.getFilesDir(), "PersistedInstallation." + ((g) this.f23737d).d() + ".json");
                }
            }
        }
        return (File) this.f23736c;
    }

    public final void k(ec.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.a);
            jSONObject.put("Status", aVar.f17292b.ordinal());
            jSONObject.put("AuthToken", aVar.f17293c);
            jSONObject.put("RefreshToken", aVar.f17294d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f17296f);
            jSONObject.put("ExpiresInSecs", aVar.f17295e);
            jSONObject.put("FisError", aVar.f17297g);
            g gVar = (g) this.f23737d;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(j())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final void l(int i10, Bundle bundle) {
        hb.b bVar;
        b6.a.f2288f.h(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                bVar = (hb.b) this.f23736c;
            } else {
                bVar = (hb.b) this.f23737d;
            }
            if (bVar != null) {
                bVar.b(bundle2, string);
            }
        }
    }

    public final ec.a m() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[JsonLexerKt.BATCH_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(j());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, JsonLexerKt.BATCH_SIZE);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = ec.a.f17291h;
        ob.c cVar = new ob.c();
        cVar.f23296f = 0L;
        cVar.v(ec.c.ATTEMPT_MIGRATION);
        cVar.f23295e = 0L;
        cVar.a = optString;
        cVar.v(ec.c.values()[optInt]);
        cVar.f23293c = optString2;
        cVar.f23294d = optString3;
        cVar.f23296f = Long.valueOf(optLong);
        cVar.f23295e = Long.valueOf(optLong2);
        cVar.f23297g = optString4;
        return cVar.j();
    }

    public final void n() {
        try {
            ((FileLock) this.f23737d).release();
            ((FileChannel) this.f23736c).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        b6.a aVar = b6.a.f2288f;
        String str = null;
        switch (this.f23735b) {
            case 4:
                if (((qb.a) obj) == null) {
                    aVar.i("Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                Task[] taskArr = new Task[2];
                taskArr[0] = m.a(((k) this.f23737d).f19902f);
                k kVar = (k) this.f23737d;
                m mVar = kVar.f19902f;
                ob.c cVar = mVar.f19916m;
                kb.a aVar2 = mVar.f19908e.a;
                if (kVar.f19901e) {
                    str = (String) this.f23736c;
                }
                taskArr[1] = cVar.t(str, aVar2);
                return Tasks.whenAll((Task<?>[]) taskArr);
            default:
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue()) {
                    aVar.h("Deleting cached crash reports...");
                    m mVar2 = (m) this.f23737d;
                    Iterator it = ob.c.s(((File) mVar2.f19910g.f23293c).listFiles(m.f19904r)).iterator();
                    while (it.hasNext()) {
                        ((File) it.next()).delete();
                    }
                    ob.c cVar2 = ((ob.a) ((m) this.f23737d).f19916m.f23292b).f23289b;
                    ob.a.a(ob.c.s(((File) cVar2.f23295e).listFiles()));
                    ob.a.a(ob.c.s(((File) cVar2.f23296f).listFiles()));
                    ob.a.a(ob.c.s(((File) cVar2.f23297g).listFiles()));
                    ((m) this.f23737d).f19920q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                aVar.d("Sending cached crash reports...", null);
                boolean booleanValue = bool.booleanValue();
                jb.t tVar = ((m) this.f23737d).f19905b;
                if (booleanValue) {
                    ((TaskCompletionSource) tVar.f19958h).trySetResult(null);
                    return ((Task) this.f23736c).onSuccessTask(((m) this.f23737d).f19908e.a, new f(this));
                }
                tVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
        }
    }

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f23735b = i10;
        this.f23736c = obj2;
        this.f23737d = obj;
    }

    public /* synthetic */ a(Object obj, int i10) {
        this.f23735b = i10;
        this.f23737d = obj;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i10) {
        this.f23735b = i10;
        this.f23736c = obj;
        this.f23737d = obj2;
    }

    public a(TypedArray typedArray) {
        Object g10;
        Object g11;
        this.f23735b = 19;
        ArrayList arrayList = new ArrayList(3);
        if (typedArray.hasValue(34)) {
            arrayList.add(e.K(typedArray.getInteger(34, 0)));
        }
        if (typedArray.hasValue(31)) {
            arrayList.add(e.I(typedArray.getInteger(31, 0)));
        }
        if (typedArray.hasValue(33)) {
            arrayList.add(e.J(typedArray.getInteger(33, 0)));
        }
        if (typedArray.hasValue(30)) {
            arrayList.add(e.H(typedArray.getInteger(30, 0)));
        }
        int i10 = 9;
        if (typedArray.hasValue(32)) {
            arrayList.add(new ze.e(new l(typedArray.getInteger(32, 0), i10)));
        }
        int i11 = 8;
        if (typedArray.hasValue(29)) {
            arrayList.add(new ze.e(new l(typedArray.getInteger(29, 0), i11)));
        }
        if (typedArray.hasValue(27)) {
            arrayList.add(e.f(ze.a.b(typedArray.getString(27))));
        }
        if (typedArray.getBoolean(35, false)) {
            arrayList.add(e.T());
        }
        if (typedArray.getBoolean(28, false)) {
            arrayList.add(e.g());
        }
        if (!arrayList.isEmpty()) {
            g10 = e.e((ze.c[]) arrayList.toArray(new ze.c[0]));
        } else {
            g10 = e.g();
        }
        this.f23736c = g10;
        ArrayList arrayList2 = new ArrayList(3);
        if (typedArray.hasValue(56)) {
            arrayList2.add(e.K(typedArray.getInteger(56, 0)));
        }
        if (typedArray.hasValue(53)) {
            arrayList2.add(e.I(typedArray.getInteger(53, 0)));
        }
        if (typedArray.hasValue(55)) {
            arrayList2.add(e.J(typedArray.getInteger(55, 0)));
        }
        if (typedArray.hasValue(52)) {
            arrayList2.add(e.H(typedArray.getInteger(52, 0)));
        }
        if (typedArray.hasValue(54)) {
            arrayList2.add(new ze.e(new l(typedArray.getInteger(54, 0), i10)));
        }
        if (typedArray.hasValue(51)) {
            arrayList2.add(new ze.e(new l(typedArray.getInteger(51, 0), i11)));
        }
        if (typedArray.hasValue(49)) {
            arrayList2.add(e.f(ze.a.b(typedArray.getString(49))));
        }
        if (typedArray.getBoolean(57, false)) {
            arrayList2.add(e.T());
        }
        if (typedArray.getBoolean(50, false)) {
            arrayList2.add(e.g());
        }
        if (!arrayList2.isEmpty()) {
            g11 = e.e((ze.c[]) arrayList2.toArray(new ze.c[0]));
        } else {
            g11 = e.g();
        }
        this.f23737d = g11;
    }

    public a(int i10) {
        this.f23735b = i10;
        if (i10 != 8) {
            if (i10 == 15) {
                q qVar = new q(9);
                this.f23736c = qVar;
                this.f23737d = new hb.d(qVar, 4);
            } else if (i10 != 17) {
                this.f23736c = new AtomicInteger();
                this.f23737d = new AtomicInteger();
            } else {
                f fVar = new f(7);
                this.f23736c = fVar;
                this.f23737d = new u(fVar);
            }
        }
    }

    public a(dd.a aVar) {
        this.f23735b = 14;
        this.f23736c = aVar;
        ArrayList arrayList = new ArrayList();
        this.f23737d = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    public a(Context context) {
        this.f23735b = 3;
        this.f23736c = context;
        this.f23737d = null;
    }

    public a(cc.c cVar) {
        this.f23735b = 11;
        this.f23737d = j.r();
        this.f23736c = cVar;
    }
}
