package com.vungle.ads.internal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import t7.InterfaceC2717f;
import v4.C2852d;

/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19758a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(Object obj, int i9) {
        this.f19758a = i9;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List m123readUnclosedAdFromFile$lambda2;
        l5.d dVar;
        FileInputStream fileInputStream;
        Throwable th;
        Map map;
        switch (this.f19758a) {
            case 0:
                return e0.a((InterfaceC2717f) this.b);
            case 1:
                m123readUnclosedAdFromFile$lambda2 = h7.c.m123readUnclosedAdFromFile$lambda2((h7.c) this.b);
                return m123readUnclosedAdFromFile$lambda2;
            case 2:
                return ((k5.k) this.b).b("firebase");
            case 3:
                l5.n nVar = (l5.n) this.b;
                synchronized (nVar) {
                    dVar = null;
                    try {
                        fileInputStream = nVar.f21637a.openFileInput(nVar.b);
                        try {
                            int available = fileInputStream.available();
                            byte[] bArr = new byte[available];
                            fileInputStream.read(bArr, 0, available);
                            dVar = l5.d.a(new JSONObject(new String(bArr, "UTF-8")));
                            fileInputStream.close();
                        } catch (FileNotFoundException | JSONException unused) {
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return dVar;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStream = null;
                    } catch (Throwable th3) {
                        fileInputStream = null;
                        th = th3;
                    }
                }
                return dVar;
            default:
                H0.b bVar = (H0.b) this.b;
                ((AtomicReference) bVar.f1346d).set(null);
                synchronized (bVar) {
                    try {
                        if (((AtomicMarkableReference) bVar.f1345c).isMarked()) {
                            C2852d c2852d = (C2852d) ((AtomicMarkableReference) bVar.f1345c).getReference();
                            synchronized (c2852d) {
                                map = Collections.unmodifiableMap(new HashMap(c2852d.f23612a));
                            }
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.f1345c;
                            atomicMarkableReference.set((C2852d) atomicMarkableReference.getReference(), false);
                        } else {
                            map = null;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (map != null) {
                    z4.c cVar = (z4.c) bVar.f1347e;
                    ((v4.g) cVar.b).g((String) cVar.f24545a, map, bVar.b);
                }
                return null;
        }
    }
}
