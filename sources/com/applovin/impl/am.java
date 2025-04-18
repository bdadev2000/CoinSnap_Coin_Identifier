package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.d1;
import com.applovin.impl.e1;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.ue;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Closeable;
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

/* loaded from: classes.dex */
public abstract class am extends xl implements ue.a {

    /* renamed from: h */
    protected final com.applovin.impl.sdk.ad.b f3761h;

    /* renamed from: i */
    protected final s2 f3762i;

    /* renamed from: j */
    private AppLovinAdLoadListener f3763j;

    /* renamed from: k */
    private final com.applovin.impl.sdk.p f3764k;

    /* renamed from: l */
    private final Collection f3765l;

    /* renamed from: m */
    private boolean f3766m;

    /* renamed from: n */
    protected ExecutorService f3767n;

    /* renamed from: o */
    protected ExecutorService f3768o;

    /* renamed from: p */
    protected List f3769p;

    /* renamed from: q */
    protected String f3770q;

    /* loaded from: classes.dex */
    public class a implements e1.a {
        public a() {
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            am.this.f3761h.b(uri);
            com.applovin.impl.sdk.t tVar = am.this.f9061c;
            if (com.applovin.impl.sdk.t.a()) {
                am amVar = am.this;
                amVar.f9061c.a(amVar.f9060b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements e1.a {
        public b() {
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            am.this.f3761h.c(uri);
            com.applovin.impl.sdk.t tVar = am.this.f9061c;
            if (com.applovin.impl.sdk.t.a()) {
                am amVar = am.this;
                amVar.f9061c.a(amVar.f9060b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements e1.a {
        final /* synthetic */ e1.a a;

        public c(e1.a aVar) {
            this.a = aVar;
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.t tVar = am.this.f9061c;
                if (com.applovin.impl.sdk.t.a()) {
                    am amVar = am.this;
                    amVar.f9061c.a(amVar.f9060b, "Finish caching video for ad #" + am.this.f3761h.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
                }
                this.a.a(uri);
                return;
            }
            com.applovin.impl.sdk.t tVar2 = am.this.f9061c;
            if (com.applovin.impl.sdk.t.a()) {
                am amVar2 = am.this;
                amVar2.f9061c.b(amVar2.f9060b, "Failed to cache video");
            }
            am.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
        }
    }

    /* loaded from: classes.dex */
    public class d implements d1.c {
        final /* synthetic */ e a;

        public d(e eVar) {
            this.a = eVar;
        }

        @Override // com.applovin.impl.d1.c
        public void a(String str, boolean z10) {
            if (z10) {
                am.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(String str);
    }

    public am(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        String uuid;
        if (bVar != null) {
            this.f3761h = bVar;
            this.f3763j = appLovinAdLoadListener;
            this.f3764k = kVar.D();
            this.f3765l = h();
            this.f3762i = new s2();
            if (((Boolean) kVar.a(oj.f6628c1)).booleanValue()) {
                if (StringUtils.isValidString(bVar.H())) {
                    uuid = bVar.H();
                } else {
                    uuid = UUID.randomUUID().toString();
                }
                this.f3770q = uuid;
                this.f3767n = kVar.l0().a("com.applovin.sdk.caching." + this.f3770q, ((Integer) kVar.a(oj.f6636d1)).intValue());
                this.f3768o = kVar.l0().a("com.applovin.sdk.caching.html." + this.f3770q, ((Integer) kVar.a(oj.f6643e1)).intValue());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    public static /* synthetic */ void e(am amVar) {
        amVar.i();
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.a.a(oj.X0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f3763j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f3761h);
            this.f3763j = null;
        }
    }

    public List a(List list) {
        this.f3769p = list;
        return this.a.l0().a(list, this.f3767n);
    }

    public Uri b(String str) {
        return a(str, this.f3761h.X(), true);
    }

    public Uri c(String str) {
        return c(str, this.f3761h.X(), true);
    }

    public String d(String str, List list, boolean z10) {
        if (((Boolean) this.a.a(oj.M)).booleanValue()) {
            try {
                InputStream a10 = this.f3764k.a(str, list, z10, this.f3762i);
                if (a10 == null) {
                    if (a10 != null) {
                        a10.close();
                    }
                    return null;
                }
                try {
                    String a11 = this.f3764k.a(a10);
                    a10.close();
                    return a11;
                } finally {
                }
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.a(this.f9060b, "Unknown failure to read input stream.", th2);
                }
                this.f9061c.a(this.f9060b, th2);
                this.a.B().a(this.f9060b, "readInputStreamAsString", th2);
                return null;
            }
        }
        InputStream a12 = this.f3764k.a(str, list, z10, this.f3762i);
        if (a12 == null) {
            return null;
        }
        try {
            return this.f3764k.a(a12);
        } catch (Throwable th3) {
            try {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.a(this.f9060b, "Unknown failure to read input stream.", th3);
                }
                this.a.B().a(this.f9060b, "readInputStreamAsString", th3);
                return null;
            } finally {
                zp.a((Closeable) a12, this.a);
            }
        }
    }

    public void f() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Rendered new ad:" + this.f3761h);
        }
        AppLovinSdkUtils.runOnUiThread(new nt(this, 6));
    }

    public void g() {
        this.f3766m = true;
        List list = this.f3769p;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f3769p.iterator();
            while (it.hasNext()) {
                ((c1) it.next()).a(true);
            }
        }
        ExecutorService executorService = this.f3767n;
        if (executorService != null) {
            executorService.shutdown();
            this.f3767n = null;
        }
        ExecutorService executorService2 = this.f3768o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f3768o = null;
        }
    }

    public void j() {
        if (x3.f()) {
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Caching mute images...");
        }
        Uri a10 = a(this.f3761h.L(), CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (a10 != null) {
            this.f3761h.b(a10);
        }
        Uri a11 = a(this.f3761h.e0(), CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        if (a11 != null) {
            this.f3761h.c(a11);
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Ad updated with muteImageFilename = " + this.f3761h.L() + ", unmuteImageFilename = " + this.f3761h.e0());
        }
    }

    public void k() {
        this.a.U().b(this);
        ExecutorService executorService = this.f3767n;
        if (executorService != null) {
            executorService.shutdown();
            this.f3767n = null;
        }
        ExecutorService executorService2 = this.f3768o;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f3768o = null;
        }
    }

    public boolean l() {
        return this.f3766m;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f3761h.a1()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Subscribing to timeout events...");
            }
            this.a.U().a(this);
        }
    }

    public String b(String str, List list, boolean z10) {
        Throwable th2;
        InputStream inputStream;
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.a(this.f9060b, "Nothing to cache, skipping...");
                }
                return null;
            }
            try {
                File a10 = this.f3764k.a(zp.a(parse, this.f3761h.getCachePrefix(), this.a), a());
                if (!this.f3764k.a(a10)) {
                    if (((Boolean) this.a.a(oj.M)).booleanValue()) {
                        try {
                            InputStream a11 = this.f3764k.a(str, list, z10, this.f3762i);
                            try {
                                if (a11 != null) {
                                    this.f3764k.a(a11, a10);
                                } else {
                                    if (com.applovin.impl.sdk.t.a()) {
                                        this.f9061c.b(this.f9060b, "Failed to load resource: " + str);
                                    }
                                    this.a.B().a(o.b.CACHE_ERROR, "cacheStringResource", (Map) CollectionUtils.hashMap("url", str));
                                }
                                if (a11 != null) {
                                    a11.close();
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
                            this.f9061c.a(this.f9060b, th3);
                            this.a.B().a(this.f9060b, "cacheStringResource", th3);
                        }
                    } else {
                        try {
                            inputStream = this.f3764k.a(str, list, z10, this.f3762i);
                        } catch (Throwable th4) {
                            th2 = th4;
                            inputStream = null;
                        }
                        try {
                            if (inputStream != null) {
                                this.f3764k.a(inputStream, a10);
                            } else {
                                if (com.applovin.impl.sdk.t.a()) {
                                    this.f9061c.b(this.f9060b, "Failed to load resource: " + str);
                                }
                                this.a.B().a(o.b.CACHE_ERROR, "cacheStringResource", (Map) CollectionUtils.hashMap("url", str));
                            }
                            zp.a((Closeable) inputStream, this.a);
                        } catch (Throwable th5) {
                            th2 = th5;
                            zp.a((Closeable) inputStream, this.a);
                            throw th2;
                        }
                    }
                }
                return this.f3764k.e(a10);
            } catch (Throwable th6) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.a(this.f9060b, com.applovin.impl.mediation.ads.e.f("Resource at ", str, " failed to load."), th6);
                }
            }
        }
        return null;
    }

    public Uri c(String str, List list, boolean z10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            a4.j.x("Caching video ", str, "...", this.f9061c, this.f9060b);
        }
        String a10 = this.f3764k.a(a(), str, this.f3761h.getCachePrefix(), list, z10, this.f3762i);
        if (StringUtils.isValidString(a10)) {
            File a11 = this.f3764k.a(a10, a());
            if (a11 != null) {
                Uri fromFile = Uri.fromFile(a11);
                if (fromFile != null) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f9061c.a(this.f9060b, "Finish caching video for ad #" + this.f3761h.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a10);
                    }
                    return fromFile;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.b(this.f9060b, "Unable to create URI from cached video file = " + a11);
                }
                this.a.B().a(o.b.CACHE_ERROR, "extractUriFromVideoFile", (Map) CollectionUtils.hashMap("url", a10));
                return null;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Unable to retrieve File from cached video filename = " + a10);
            }
            this.a.B().a(o.b.CACHE_ERROR, "retrieveVideoFile", (Map) CollectionUtils.hashMap("url", a10));
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.b(this.f9060b, "Failed to cache video: " + str);
        }
        this.a.B().a(o.b.CACHE_ERROR, "cacheVideo", (Map) CollectionUtils.hashMap("url", str));
        a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
        return null;
    }

    public List e() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f3761h.L() != null) {
            arrayList.add(a(this.f3761h.L().toString(), new a()));
        }
        if (this.f3761h.e0() != null) {
            arrayList.add(a(this.f3761h.e0().toString(), new b()));
        }
        return arrayList;
    }

    private Uri a(String str, String str2) {
        File a10 = this.f3764k.a(zp.a(Uri.parse(str2), this.f3761h.getCachePrefix(), this.a), com.applovin.impl.sdk.k.k());
        if (a10 == null) {
            return null;
        }
        if (this.f3764k.a(a10)) {
            this.f3762i.a(a10.length());
            return Uri.parse(bh.z.FILE_SCHEME + a10.getAbsolutePath());
        }
        if (!this.f3764k.a(a10, eb.j.k(str, str2), Arrays.asList(str), this.f3762i)) {
            return null;
        }
        return Uri.parse(bh.z.FILE_SCHEME + a10.getAbsolutePath());
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x003c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r13, java.util.List r14, com.applovin.impl.sdk.ad.b r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.am.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    public e1 b(String str, e1.a aVar) {
        return a(str, this.f3761h.X(), true, aVar);
    }

    public Uri a(String str, List list, boolean z10) {
        try {
            String a10 = this.f3764k.a(a(), str, this.f3761h.getCachePrefix(), list, z10, this.f3762i);
            if (StringUtils.isValidString(a10)) {
                File a11 = this.f3764k.a(a10, a());
                if (a11 != null) {
                    Uri fromFile = Uri.fromFile(a11);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f9061c.b(this.f9060b, "Unable to extract Uri from image file");
                    }
                    this.a.B().a(o.b.CACHE_ERROR, "extractUriFromImageFile", (Map) CollectionUtils.hashMap("url", a10));
                    return null;
                }
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.b(this.f9060b, "Unable to retrieve File from cached image filename = " + a10);
                }
                this.a.B().a(o.b.CACHE_ERROR, "retrieveImageFile", (Map) CollectionUtils.hashMap("url", a10));
                return null;
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Failed to cache image: " + str);
            }
            this.a.B().a(o.b.CACHE_ERROR, "cacheImageResource", (Map) CollectionUtils.hashMap("url", str));
            return null;
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Failed to cache image at url = " + str, th2);
            }
            this.a.B().a(this.f9060b, "cacheImageResource", th2, CollectionUtils.hashMap("url", str));
            return null;
        }
    }

    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.t.a()) {
                a4.j.x("No ", str, " image to cache", this.f9061c, this.f9060b);
            }
            return null;
        }
        String uri2 = uri.toString();
        if (TextUtils.isEmpty(uri2)) {
            if (com.applovin.impl.sdk.t.a()) {
                a4.j.x("Failed to cache ", str, " image", this.f9061c, this.f9060b);
            }
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            a4.j.x("Caching ", str, " image...", this.f9061c, this.f9060b);
        }
        return b(uri2);
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String a10 = a(bVar.g0(), bVar.h0(), bVar.N0(), bVar.X(), bVar.X0());
        if (bVar.M0() && StringUtils.isValidString(a10)) {
            String a11 = a(a10, bVar.X(), bVar);
            bVar.a(a11);
            this.f9061c.f(this.f9060b, "Ad updated with video button HTML assets cached = " + a11);
        }
    }

    public e1 a(String str, List list, boolean z10, e1.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.t.a()) {
                return null;
            }
            this.f9061c.a(this.f9060b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.t.a()) {
            a4.j.x("Caching video ", str, "...", this.f9061c, this.f9060b);
        }
        return new e1(str, this.f3761h, list, z10, this.f3762i, this.a, new c(aVar));
    }

    public void a(int i10) {
        if (this.f3763j != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Calling back ad load failed with error code: " + i10);
            }
            this.f3763j.failedToReceiveAd(i10);
            this.f3763j = null;
        }
        g();
    }

    @Override // com.applovin.impl.ue.a
    public void a(be beVar) {
        if (beVar.Q().equalsIgnoreCase(this.f3761h.H())) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Updating flag for timeout...");
            }
            g();
        }
        this.a.U().b(this);
    }

    public String a(String str, String str2, boolean z10, List list, boolean z11) {
        if (StringUtils.isValidString(str2)) {
            String a10 = a(str2, z10, list, z11);
            if (StringUtils.isValidString(a10)) {
                return a10;
            }
            if (TextUtils.isEmpty(str)) {
                a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.b(this.f9060b, "Could not retrieve HTML from: " + str2 + " and HTML source is invalid.");
                }
                this.a.B().a(o.b.CACHE_ERROR, "retrieveHtmlString", (Map) CollectionUtils.hashMap("url", str2));
            }
        }
        return str;
    }

    private String a(String str, boolean z10, List list, boolean z11) {
        if (z10) {
            return b(str, list, z11);
        }
        return d(str, list, z11);
    }

    public e1 a(String str, e1.a aVar) {
        return new e1(str, this.f3761h, this.f3762i, this.a, aVar);
    }

    public d1 a(String str, List list, e eVar) {
        return new d1(str, this.f3761h, list, this.f3762i, this.f3768o, this.a, new d(eVar));
    }
}
