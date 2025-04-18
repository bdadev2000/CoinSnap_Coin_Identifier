package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.e1;
import com.applovin.impl.f1;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.ze;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public abstract class bm extends yl implements ze.a {

    /* renamed from: h */
    protected final com.applovin.impl.sdk.ad.b f23123h;

    /* renamed from: i */
    protected final u2 f23124i;

    /* renamed from: j */
    private AppLovinAdLoadListener f23125j;

    /* renamed from: k */
    private final com.applovin.impl.sdk.l f23126k;

    /* renamed from: l */
    private final Collection f23127l;

    /* renamed from: m */
    private boolean f23128m;

    /* renamed from: n */
    protected ExecutorService f23129n;

    /* renamed from: o */
    protected ExecutorService f23130o;

    /* renamed from: p */
    protected List f23131p;

    /* renamed from: q */
    protected String f23132q;

    /* loaded from: classes3.dex */
    public class a implements f1.a {
        public a() {
        }

        @Override // com.applovin.impl.f1.a
        public void a(Uri uri) {
            bm.this.f23123h.b(uri);
            com.applovin.impl.sdk.n nVar = bm.this.f28218c;
            if (com.applovin.impl.sdk.n.a()) {
                bm bmVar = bm.this;
                bmVar.f28218c.a(bmVar.f28217b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements f1.a {
        public b() {
        }

        @Override // com.applovin.impl.f1.a
        public void a(Uri uri) {
            bm.this.f23123h.c(uri);
            com.applovin.impl.sdk.n nVar = bm.this.f28218c;
            if (com.applovin.impl.sdk.n.a()) {
                bm bmVar = bm.this;
                bmVar.f28218c.a(bmVar.f28217b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements f1.a {

        /* renamed from: a */
        final /* synthetic */ f1.a f23135a;

        public c(f1.a aVar) {
            this.f23135a = aVar;
        }

        @Override // com.applovin.impl.f1.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.n nVar = bm.this.f28218c;
                if (com.applovin.impl.sdk.n.a()) {
                    bm bmVar = bm.this;
                    bmVar.f28218c.a(bmVar.f28217b, "Finish caching video for ad #" + bm.this.f23123h.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
                }
                this.f23135a.a(uri);
                return;
            }
            com.applovin.impl.sdk.n nVar2 = bm.this.f28218c;
            if (com.applovin.impl.sdk.n.a()) {
                bm bmVar2 = bm.this;
                bmVar2.f28218c.b(bmVar2.f28217b, "Failed to cache video");
            }
            bm.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            Bundle bundle = new Bundle();
            bundle.putLong(CreativeInfo.f29617c, bm.this.f23123h.getAdIdNumber());
            bundle.putInt("load_response_code", bm.this.f23124i.b());
            Throwable a2 = bm.this.f23124i.a();
            if (a2 != null) {
                bundle.putString("load_exception_message", a2.getMessage());
            }
            bm.this.f28216a.p().a(bundle, "video_caching_failed");
        }
    }

    /* loaded from: classes3.dex */
    public class d implements e1.c {

        /* renamed from: a */
        final /* synthetic */ e f23137a;

        public d(e eVar) {
            this.f23137a = eVar;
        }

        @Override // com.applovin.impl.e1.c
        public void a(String str, boolean z2) {
            if (z2) {
                bm.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f23137a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a(String str);
    }

    public bm(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.j jVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, jVar);
        if (bVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f23123h = bVar;
        this.f23125j = appLovinAdLoadListener;
        this.f23126k = jVar.B();
        this.f23127l = h();
        this.f23124i = new u2();
        if (((Boolean) jVar.a(sj.f26909c1)).booleanValue()) {
            this.f23132q = StringUtils.isValidString(bVar.H()) ? bVar.H() : UUID.randomUUID().toString();
            this.f23129n = jVar.j0().a("com.applovin.sdk.caching." + this.f23132q, ((Integer) jVar.a(sj.f26911d1)).intValue());
            this.f23130o = jVar.j0().a("com.applovin.sdk.caching.html." + this.f23132q, ((Integer) jVar.a(sj.f26913e1)).intValue());
        }
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f28216a.a(sj.X0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }

    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f23125j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f23123h);
            this.f23125j = null;
        }
    }

    public List a(List list) {
        this.f23131p = list;
        return this.f28216a.j0().a(list, this.f23129n);
    }

    public Uri b(String str) {
        return a(str, this.f23123h.X(), true);
    }

    public Uri c(String str) {
        return c(str, this.f23123h.X(), true);
    }

    public String d(String str, List list, boolean z2) {
        if (((Boolean) this.f28216a.a(sj.D)).booleanValue()) {
            try {
                InputStream a2 = this.f23126k.a(str, list, z2, this.f23124i);
                if (a2 == null) {
                    if (a2 != null) {
                        a2.close();
                    }
                    return null;
                }
                try {
                    String a3 = this.f23126k.a(a2);
                    a2.close();
                    return a3;
                } finally {
                }
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.a(this.f28217b, "Unknown failure to read input stream.", th);
                }
                this.f28218c.a(this.f28217b, th);
                this.f28216a.E().a(this.f28217b, "readInputStreamAsString", th);
                return null;
            }
        }
        InputStream a4 = this.f23126k.a(str, list, z2, this.f23124i);
        if (a4 == null) {
            return null;
        }
        try {
            String a5 = this.f23126k.a(a4);
            yp.a(a4, this.f28216a);
            return a5;
        } catch (Throwable th2) {
            try {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.a(this.f28217b, "Unknown failure to read input stream.", th2);
                }
                this.f28216a.E().a(this.f28217b, "readInputStreamAsString", th2);
                yp.a(a4, this.f28216a);
                return null;
            } catch (Throwable th3) {
                yp.a(a4, this.f28216a);
                throw th3;
            }
        }
    }

    public void f() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Rendered new ad:" + this.f23123h);
        }
        AppLovinSdkUtils.runOnUiThread(new mt(this, 6));
    }

    public void g() {
        this.f23128m = true;
        List list = this.f23131p;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f23131p.iterator();
            while (it.hasNext()) {
                ((d1) it.next()).a(true);
            }
        }
        ExecutorService executorService = this.f23129n;
        if (executorService != null) {
            executorService.shutdown();
            this.f23129n = null;
        }
        ExecutorService executorService2 = this.f23130o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f23130o = null;
        }
    }

    public void j() {
        if (z3.f()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Caching mute images...");
        }
        Uri a2 = a(this.f23123h.L(), "mute");
        if (a2 != null) {
            this.f23123h.b(a2);
        }
        Uri a3 = a(this.f23123h.f0(), "unmute");
        if (a3 != null) {
            this.f23123h.c(a3);
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Ad updated with muteImageFilename = " + this.f23123h.L() + ", unmuteImageFilename = " + this.f23123h.f0());
        }
    }

    public void k() {
        this.f28216a.S().b(this);
        ExecutorService executorService = this.f23129n;
        if (executorService != null) {
            executorService.shutdown();
            this.f23129n = null;
        }
        ExecutorService executorService2 = this.f23130o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f23130o = null;
        }
    }

    public boolean l() {
        return this.f23128m;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f23123h.e1()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Subscribing to timeout events...");
            }
            this.f28216a.S().a(this);
        }
    }

    private Uri a(String str, String str2) {
        File a2 = this.f23126k.a(yp.a(Uri.parse(str2), this.f23123h.getCachePrefix(), this.f28216a), com.applovin.impl.sdk.j.l());
        if (a2 == null) {
            return null;
        }
        if (this.f23126k.a(a2)) {
            this.f23124i.a(a2.length());
            return Uri.parse("file://" + a2.getAbsolutePath());
        }
        String j2 = androidx.compose.foundation.text.input.a.j(str, str2);
        if (!this.f23126k.a(a2, j2, Arrays.asList(str), this.f23124i, this.f28216a.B().a(j2, this.f23123h))) {
            return null;
        }
        return Uri.parse("file://" + a2.getAbsolutePath());
    }

    public String b(String str, List list, boolean z2) {
        InputStream inputStream;
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.a(this.f28217b, "Nothing to cache, skipping...");
                }
                return null;
            }
            try {
                File a2 = this.f23126k.a(yp.a(parse, this.f23123h.getCachePrefix(), this.f28216a), a());
                if (!this.f23126k.a(a2)) {
                    if (((Boolean) this.f28216a.a(sj.D)).booleanValue()) {
                        try {
                            InputStream a3 = this.f23126k.a(str, list, z2, this.f23124i);
                            try {
                                if (a3 != null) {
                                    this.f23126k.a(a3, a2);
                                } else {
                                    if (com.applovin.impl.sdk.n.a()) {
                                        this.f28218c.b(this.f28217b, "Failed to load resource: " + str);
                                    }
                                    this.f28216a.E().a(la.G, "cacheStringResource", (Map) CollectionUtils.hashMap("url", str));
                                }
                                if (a3 != null) {
                                    a3.close();
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            this.f28218c.a(this.f28217b, th);
                            this.f28216a.E().a(this.f28217b, "cacheStringResource", th);
                        }
                    } else {
                        try {
                            inputStream = this.f23126k.a(str, list, z2, this.f23124i);
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = null;
                        }
                        try {
                            if (inputStream != null) {
                                this.f23126k.a(inputStream, a2);
                            } else {
                                if (com.applovin.impl.sdk.n.a()) {
                                    this.f28218c.b(this.f28217b, "Failed to load resource: " + str);
                                }
                                this.f28216a.E().a(la.G, "cacheStringResource", (Map) CollectionUtils.hashMap("url", str));
                            }
                            yp.a(inputStream, this.f28216a);
                        } catch (Throwable th3) {
                            th = th3;
                            yp.a(inputStream, this.f28216a);
                            throw th;
                        }
                    }
                }
                return this.f23126k.e(a2);
            } catch (Throwable th4) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.a(this.f28217b, androidx.compose.foundation.text.input.a.A("Resource at ", str, " failed to load."), th4);
                }
            }
        }
        return null;
    }

    public Uri c(String str, List list, boolean z2) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Caching video " + str + "...");
        }
        String a2 = this.f23126k.a(a(), str, this.f23123h.getCachePrefix(), list, z2, this.f23124i, this.f28216a.B().a(str, this.f23123h));
        if (StringUtils.isValidString(a2)) {
            File a3 = this.f23126k.a(a2, a());
            if (a3 != null) {
                Uri fromFile = Uri.fromFile(a3);
                if (fromFile != null) {
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f28218c.a(this.f28217b, "Finish caching video for ad #" + this.f23123h.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a2);
                    }
                    return fromFile;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.b(this.f28217b, "Unable to create URI from cached video file = " + a3);
                }
                this.f28216a.E().a(la.G, "extractUriFromVideoFile", (Map) CollectionUtils.hashMap("url", a2));
                return null;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Unable to retrieve File from cached video filename = " + a2);
            }
            this.f28216a.E().a(la.G, "retrieveVideoFile", (Map) CollectionUtils.hashMap("url", a2));
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.b(this.f28217b, "Failed to cache video: " + str);
        }
        this.f28216a.E().a(la.G, "cacheVideo", (Map) CollectionUtils.hashMap("url", str));
        a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
        return null;
    }

    public List e() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f23123h.L() != null) {
            arrayList.add(a(this.f23123h.L().toString(), new a()));
        }
        if (this.f23123h.f0() != null) {
            arrayList.add(a(this.f23123h.f0().toString(), new b()));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0038, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r12, java.util.List r13, com.applovin.impl.sdk.ad.b r14) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.bm.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    public f1 b(String str, f1.a aVar) {
        return a(str, this.f23123h.X(), true, aVar);
    }

    public Uri a(String str, List list, boolean z2) {
        try {
            String a2 = this.f23126k.a(a(), str, this.f23123h.getCachePrefix(), list, z2, this.f23124i, this.f28216a.B().a(str, this.f23123h));
            if (StringUtils.isValidString(a2)) {
                File a3 = this.f23126k.a(a2, a());
                if (a3 != null) {
                    Uri fromFile = Uri.fromFile(a3);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    if (com.applovin.impl.sdk.n.a()) {
                        this.f28218c.b(this.f28217b, "Unable to extract Uri from image file");
                    }
                    this.f28216a.E().a(la.G, "extractUriFromImageFile", (Map) CollectionUtils.hashMap("url", a2));
                    return null;
                }
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.b(this.f28217b, "Unable to retrieve File from cached image filename = " + a2);
                }
                this.f28216a.E().a(la.G, "retrieveImageFile", (Map) CollectionUtils.hashMap("url", a2));
                return null;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Failed to cache image: " + str);
            }
            this.f28216a.E().a(la.G, "cacheImageResource", (Map) CollectionUtils.hashMap("url", str));
            return null;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Failed to cache image at url = " + str, th);
            }
            this.f28216a.E().a(this.f28217b, "cacheImageResource", th, CollectionUtils.hashMap("url", str));
            return null;
        }
    }

    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "No " + str + " image to cache");
            }
            return null;
        }
        String uri2 = uri.toString();
        if (TextUtils.isEmpty(uri2)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Caching " + str + " image...");
        }
        return b(uri2);
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String a2 = a(bVar.h0(), bVar.i0(), bVar.P0(), bVar.X(), bVar.b1());
        if (bVar.O0() && StringUtils.isValidString(a2)) {
            String a3 = a(a2, bVar.X(), bVar);
            bVar.a(a3);
            this.f28218c.f(this.f28217b, "Ad updated with video button HTML assets cached = " + a3);
        }
    }

    public f1 a(String str, List list, boolean z2, f1.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.n.a()) {
                return null;
            }
            this.f28218c.a(this.f28217b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Caching video " + str + "...");
        }
        return new f1(str, this.f23123h, list, z2, this.f23124i, this.f28216a, new c(aVar));
    }

    public void a(int i2) {
        if (this.f23125j != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Calling back ad load failed with error code: " + i2);
            }
            this.f23125j.failedToReceiveAd(i2);
            this.f23125j = null;
        }
        g();
    }

    @Override // com.applovin.impl.ze.a
    public void a(ge geVar) {
        if (geVar.S().equalsIgnoreCase(this.f23123h.H())) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Updating flag for timeout...");
            }
            g();
        }
        this.f28216a.S().b(this);
    }

    public String a(String str, String str2, boolean z2, List list, boolean z3) {
        if (StringUtils.isValidString(str2)) {
            String a2 = a(str2, z2, list, z3);
            if (StringUtils.isValidString(a2)) {
                return a2;
            }
            if (TextUtils.isEmpty(str)) {
                a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                if (com.applovin.impl.sdk.n.a()) {
                    this.f28218c.b(this.f28217b, "Could not retrieve HTML from: " + str2 + " and HTML source is invalid.");
                }
                this.f28216a.E().a(la.G, "retrieveHtmlString", (Map) CollectionUtils.hashMap("url", str2));
            }
        }
        return str;
    }

    private String a(String str, boolean z2, List list, boolean z3) {
        if (z2) {
            return b(str, list, z3);
        }
        return d(str, list, z3);
    }

    public f1 a(String str, f1.a aVar) {
        return new f1(str, this.f23123h, this.f23124i, this.f28216a, aVar);
    }

    public e1 a(String str, List list, e eVar) {
        return new e1(str, this.f23123h, list, this.f23124i, this.f23130o, this.f28216a, new d(eVar));
    }
}
