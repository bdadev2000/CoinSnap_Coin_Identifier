package com.mbridge.msdk.foundation.same.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes4.dex */
public final class d {
    private final ThreadPoolExecutor a;

    /* renamed from: b */
    private final Handler f13330b;

    /* renamed from: c */
    private final String f13331c;

    /* renamed from: com.mbridge.msdk.foundation.same.c.d$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ String a;

        /* renamed from: b */
        final /* synthetic */ g f13332b;

        /* renamed from: c */
        final /* synthetic */ c f13333c;

        /* renamed from: com.mbridge.msdk.foundation.same.c.d$1$1 */
        /* loaded from: classes4.dex */
        public class RunnableC01711 implements Runnable {
            public RunnableC01711() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                r4.onFailedLoad("create download request error", r2);
            }
        }

        public AnonymousClass1(String str, g gVar, c cVar) {
            r2 = str;
            r3 = gVar;
            r4 = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DownloadRequest a = d.this.a(ab.c(r2), r2, r3, r4);
            if (a == null) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonImageLoaderRefactor", "createDownloadRequest error");
                }
                if (r4 == null) {
                    return;
                }
                d.this.f13330b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.1.1
                    public RunnableC01711() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        r4.onFailedLoad("create download request error", r2);
                    }
                });
                return;
            }
            a.start();
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        private static final d a = new d();

        public static /* synthetic */ d a() {
            return a;
        }
    }

    public /* synthetic */ d(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static Bitmap d(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = true;
        return BitmapFactory.decodeFile(str, options);
    }

    public final boolean b(String str) {
        File file;
        if (MBridgeConstans.DEBUG) {
            com.applovin.impl.mediation.ads.e.A("isImageFileExists imageUrl = ", str, "CommonImageLoaderRefactor");
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                file = new File(this.f13331c + ab.c(str));
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonImageLoaderRefactor", "isImageFileExists error", e2);
                }
                file = null;
            }
            if (file == null || !file.isFile()) {
                return false;
            }
            if (!file.exists()) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonImageLoaderRefactor", "isImageFileExists error", e10);
            }
            return false;
        }
    }

    private d() {
        this.f13330b = new Handler(Looper.getMainLooper());
        this.f13331c = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_IMG) + File.separator;
        this.a = f.a();
    }

    /* loaded from: classes4.dex */
    public static final class b implements OnDownloadStateListener<Object> {
        private final ThreadPoolExecutor a;

        /* renamed from: b */
        private final Handler f13335b;

        /* renamed from: c */
        private final String f13336c;

        /* renamed from: d */
        private final String f13337d;

        /* renamed from: e */
        private final g f13338e;

        /* renamed from: f */
        private final String f13339f;

        /* renamed from: g */
        private final c f13340g;

        /* renamed from: com.mbridge.msdk.foundation.same.c.d$b$1 */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this);
            }
        }

        /* renamed from: com.mbridge.msdk.foundation.same.c.d$b$2 */
        /* loaded from: classes4.dex */
        public class AnonymousClass2 implements Runnable {
            final /* synthetic */ String a;

            public AnonymousClass2(String str) {
                r2 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.this.f13340g.onFailedLoad(b.this.f13339f, r2);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonImageLoaderRefactor", "callbackForFailed error", e2);
                    }
                }
            }
        }

        /* renamed from: com.mbridge.msdk.foundation.same.c.d$b$3 */
        /* loaded from: classes4.dex */
        public class AnonymousClass3 implements Runnable {
            final /* synthetic */ Bitmap a;

            public AnonymousClass3(Bitmap bitmap) {
                r2 = bitmap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.this.f13340g.onSuccessLoad(r2, b.this.f13339f);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonImageLoaderRefactor", "callbackForSuccess error", e2);
                    }
                }
            }
        }

        public b(Handler handler, ThreadPoolExecutor threadPoolExecutor, String str, String str2, String str3, g gVar, c cVar) {
            this.f13335b = handler;
            this.a = threadPoolExecutor;
            this.f13339f = str;
            this.f13336c = str2;
            this.f13337d = str3;
            this.f13338e = gVar;
            this.f13340g = cVar;
        }

        private void a(String str) {
            if (this.f13340g == null) {
                return;
            }
            this.f13335b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.b.2
                final /* synthetic */ String a;

                public AnonymousClass2(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.this.f13340g.onFailedLoad(b.this.f13339f, r2);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CommonImageLoaderRefactor", "callbackForFailed error", e2);
                        }
                    }
                }
            });
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onCancelDownload(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            File file;
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonImageLoaderRefactor", "onDownloadComplete imageUrl = " + this.f13339f + " imagePath = " + this.f13336c + this.f13337d);
                try {
                    file = new File(this.f13336c + this.f13337d);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonImageLoaderRefactor", "onDownloadComplete error", e2);
                    }
                    file = null;
                }
                if (file != null && file.isFile() && file.exists()) {
                    ad.a("CommonImageLoaderRefactor", "onDownloadComplete file size = " + file.length());
                } else {
                    ad.b("CommonImageLoaderRefactor", "onDownloadComplete file not exist");
                }
            }
            this.a.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.b.1
                public AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.a(b.this);
                }
            });
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            if (MBridgeConstans.DEBUG) {
                ad.a("CommonImageLoaderRefactor", "onDownloadError imageUrl = " + downloadError.getException().getLocalizedMessage());
            }
            a(downloadError.getException().getLocalizedMessage());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        private Bitmap a(Bitmap bitmap, g gVar) {
            if (gVar == null) {
                return bitmap;
            }
            try {
                return gVar.a(bitmap);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonImageLoaderRefactor", "handlerImageTransformation error", e2);
                }
                return bitmap;
            }
        }

        public static /* synthetic */ void a(b bVar) {
            if (bVar.f13340g == null) {
                return;
            }
            try {
                Bitmap d10 = d.d(bVar.f13336c + bVar.f13337d);
                if (d10 == null) {
                    bVar.a("bitmap decode failed");
                } else {
                    Bitmap a = bVar.a(d10, bVar.f13338e);
                    if (a == null) {
                        bVar.a("bitmap transformation failed");
                    } else if (bVar.f13340g != null) {
                        bVar.f13335b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.b.3
                            final /* synthetic */ Bitmap a;

                            public AnonymousClass3(Bitmap a10) {
                                r2 = a10;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    b.this.f13340g.onSuccessLoad(r2, b.this.f13339f);
                                } catch (Exception e2) {
                                    if (MBridgeConstans.DEBUG) {
                                        ad.b("CommonImageLoaderRefactor", "callbackForSuccess error", e2);
                                    }
                                }
                            }
                        });
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonImageLoaderRefactor", "onDownloadComplete decodeBitmap error = " + e2.getLocalizedMessage());
                }
                bVar.a("bitmap decode failed");
            }
        }
    }

    public final Bitmap a(String str) {
        if (MBridgeConstans.DEBUG) {
            com.applovin.impl.mediation.ads.e.A("getImageBitmapByUrl imageUrl = ", str, "CommonImageLoaderRefactor");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String h10 = vd.e.h(new StringBuilder(), this.f13331c, ab.c(str));
        File file = new File(h10);
        if (file.isFile() && file.exists()) {
            try {
                return d(h10);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonImageLoaderRefactor", "getImageBitmapByUrl error", e2);
                }
            }
        }
        return null;
    }

    public final void a(String str, g gVar, c cVar) {
        try {
            this.a.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.1
                final /* synthetic */ String a;

                /* renamed from: b */
                final /* synthetic */ g f13332b;

                /* renamed from: c */
                final /* synthetic */ c f13333c;

                /* renamed from: com.mbridge.msdk.foundation.same.c.d$1$1 */
                /* loaded from: classes4.dex */
                public class RunnableC01711 implements Runnable {
                    public RunnableC01711() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        r4.onFailedLoad("create download request error", r2);
                    }
                }

                public AnonymousClass1(String str2, g gVar2, c cVar2) {
                    r2 = str2;
                    r3 = gVar2;
                    r4 = cVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DownloadRequest a10 = d.this.a(ab.c(r2), r2, r3, r4);
                    if (a10 == null) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CommonImageLoaderRefactor", "createDownloadRequest error");
                        }
                        if (r4 == null) {
                            return;
                        }
                        d.this.f13330b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.1.1
                            public RunnableC01711() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                r4.onFailedLoad("create download request error", r2);
                            }
                        });
                        return;
                    }
                    a10.start();
                }
            });
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonImageLoaderRefactor", "loadImage error", e2);
            }
        }
    }

    public DownloadRequest<?> a(String str, String str2, g gVar, c cVar) {
        try {
            return MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str2, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_IMAGE)).withReadTimeout(com.mbridge.msdk.foundation.same.a.u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f13289t).withWriteTimeout(com.mbridge.msdk.foundation.same.a.f13288s).withDownloadPriority(DownloadPriority.LOW).withHttpRetryCounter(1).withDirectoryPathInternal(this.f13331c).withDownloadStateListener(new b(this.f13330b, this.a, str2, this.f13331c, str, gVar, cVar)).with("download_scene", "download_image").withProgressStateListener(null).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("do_us_fi_re", Boolean.FALSE.toString()).build();
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.b("CommonImageLoaderRefactor", "createDownloadRequest error", e2);
            return null;
        }
    }
}
