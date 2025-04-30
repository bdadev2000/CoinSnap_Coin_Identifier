package com.mbridge.msdk.foundation.same.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.applovin.impl.L;
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
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    private final ThreadPoolExecutor f15732a;
    private final Handler b;

    /* renamed from: c */
    private final String f15733c;

    /* renamed from: com.mbridge.msdk.foundation.same.c.d$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f15734a;
        final /* synthetic */ g b;

        /* renamed from: c */
        final /* synthetic */ c f15735c;

        /* renamed from: com.mbridge.msdk.foundation.same.c.d$1$1 */
        /* loaded from: classes3.dex */
        public class RunnableC01591 implements Runnable {
            public RunnableC01591() {
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
            DownloadRequest a6 = d.this.a(ab.c(r2), r2, r3, r4);
            if (a6 == null) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonImageLoaderRefactor", "createDownloadRequest error");
                }
                if (r4 == null) {
                    return;
                }
                d.this.b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.1.1
                    public RunnableC01591() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        r4.onFailedLoad("create download request error", r2);
                    }
                });
                return;
            }
            a6.start();
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private static final d f15738a = new d();
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
            L.C("isImageFileExists imageUrl = ", str, "CommonImageLoaderRefactor");
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                file = new File(this.f15733c + ab.c(str));
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonImageLoaderRefactor", "isImageFileExists error", e4);
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
        } catch (Exception e9) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonImageLoaderRefactor", "isImageFileExists error", e9);
            }
            return false;
        }
    }

    private d() {
        this.b = new Handler(Looper.getMainLooper());
        this.f15733c = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_IMG) + File.separator;
        this.f15732a = f.a();
    }

    /* loaded from: classes3.dex */
    public static final class b implements OnDownloadStateListener<Object> {

        /* renamed from: a */
        private final ThreadPoolExecutor f15739a;
        private final Handler b;

        /* renamed from: c */
        private final String f15740c;

        /* renamed from: d */
        private final String f15741d;

        /* renamed from: e */
        private final g f15742e;

        /* renamed from: f */
        private final String f15743f;

        /* renamed from: g */
        private final c f15744g;

        /* renamed from: com.mbridge.msdk.foundation.same.c.d$b$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this);
            }
        }

        /* renamed from: com.mbridge.msdk.foundation.same.c.d$b$2 */
        /* loaded from: classes3.dex */
        public class AnonymousClass2 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f15746a;

            public AnonymousClass2(String str) {
                r2 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.this.f15744g.onFailedLoad(b.this.f15743f, r2);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonImageLoaderRefactor", "callbackForFailed error", e4);
                    }
                }
            }
        }

        /* renamed from: com.mbridge.msdk.foundation.same.c.d$b$3 */
        /* loaded from: classes3.dex */
        public class AnonymousClass3 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bitmap f15747a;

            public AnonymousClass3(Bitmap bitmap) {
                r2 = bitmap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.this.f15744g.onSuccessLoad(r2, b.this.f15743f);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonImageLoaderRefactor", "callbackForSuccess error", e4);
                    }
                }
            }
        }

        public b(Handler handler, ThreadPoolExecutor threadPoolExecutor, String str, String str2, String str3, g gVar, c cVar) {
            this.b = handler;
            this.f15739a = threadPoolExecutor;
            this.f15743f = str;
            this.f15740c = str2;
            this.f15741d = str3;
            this.f15742e = gVar;
            this.f15744g = cVar;
        }

        private void a(String str) {
            if (this.f15744g == null) {
                return;
            }
            this.b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.b.2

                /* renamed from: a */
                final /* synthetic */ String f15746a;

                public AnonymousClass2(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.this.f15744g.onFailedLoad(b.this.f15743f, r2);
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CommonImageLoaderRefactor", "callbackForFailed error", e4);
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
                ad.a("CommonImageLoaderRefactor", "onDownloadComplete imageUrl = " + this.f15743f + " imagePath = " + this.f15740c + this.f15741d);
                try {
                    file = new File(this.f15740c + this.f15741d);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonImageLoaderRefactor", "onDownloadComplete error", e4);
                    }
                    file = null;
                }
                if (file != null && file.isFile() && file.exists()) {
                    ad.a("CommonImageLoaderRefactor", "onDownloadComplete file size = " + file.length());
                } else {
                    ad.b("CommonImageLoaderRefactor", "onDownloadComplete file not exist");
                }
            }
            this.f15739a.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.b.1
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
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonImageLoaderRefactor", "handlerImageTransformation error", e4);
                }
                return bitmap;
            }
        }

        public static /* synthetic */ void a(b bVar) {
            if (bVar.f15744g == null) {
                return;
            }
            try {
                Bitmap d2 = d.d(bVar.f15740c + bVar.f15741d);
                if (d2 == null) {
                    bVar.a("bitmap decode failed");
                } else {
                    Bitmap a6 = bVar.a(d2, bVar.f15742e);
                    if (a6 == null) {
                        bVar.a("bitmap transformation failed");
                    } else if (bVar.f15744g != null) {
                        bVar.b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.b.3

                            /* renamed from: a */
                            final /* synthetic */ Bitmap f15747a;

                            public AnonymousClass3(Bitmap a62) {
                                r2 = a62;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    b.this.f15744g.onSuccessLoad(r2, b.this.f15743f);
                                } catch (Exception e4) {
                                    if (MBridgeConstans.DEBUG) {
                                        ad.b("CommonImageLoaderRefactor", "callbackForSuccess error", e4);
                                    }
                                }
                            }
                        });
                    }
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonImageLoaderRefactor", "onDownloadComplete decodeBitmap error = " + e4.getLocalizedMessage());
                }
                bVar.a("bitmap decode failed");
            }
        }
    }

    public final Bitmap a(String str) {
        if (MBridgeConstans.DEBUG) {
            L.C("getImageBitmapByUrl imageUrl = ", str, "CommonImageLoaderRefactor");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String h6 = AbstractC2914a.h(new StringBuilder(), this.f15733c, ab.c(str));
        File file = new File(h6);
        if (file.isFile() && file.exists()) {
            try {
                return d(h6);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonImageLoaderRefactor", "getImageBitmapByUrl error", e4);
                }
            }
        }
        return null;
    }

    public final void a(String str, g gVar, c cVar) {
        try {
            this.f15732a.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.1

                /* renamed from: a */
                final /* synthetic */ String f15734a;
                final /* synthetic */ g b;

                /* renamed from: c */
                final /* synthetic */ c f15735c;

                /* renamed from: com.mbridge.msdk.foundation.same.c.d$1$1 */
                /* loaded from: classes3.dex */
                public class RunnableC01591 implements Runnable {
                    public RunnableC01591() {
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
                    DownloadRequest a6 = d.this.a(ab.c(r2), r2, r3, r4);
                    if (a6 == null) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("CommonImageLoaderRefactor", "createDownloadRequest error");
                        }
                        if (r4 == null) {
                            return;
                        }
                        d.this.b.post(new Runnable() { // from class: com.mbridge.msdk.foundation.same.c.d.1.1
                            public RunnableC01591() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                r4.onFailedLoad("create download request error", r2);
                            }
                        });
                        return;
                    }
                    a6.start();
                }
            });
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonImageLoaderRefactor", "loadImage error", e4);
            }
        }
    }

    public DownloadRequest<?> a(String str, String str2, g gVar, c cVar) {
        try {
            return MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str2, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_IMAGE)).withReadTimeout(com.mbridge.msdk.foundation.same.a.f15693u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.f15692t).withWriteTimeout(com.mbridge.msdk.foundation.same.a.f15691s).withDownloadPriority(DownloadPriority.LOW).withHttpRetryCounter(1).withDirectoryPathInternal(this.f15733c).withDownloadStateListener(new b(this.b, this.f15732a, str2, this.f15733c, str, gVar, cVar)).with("download_scene", "download_image").withProgressStateListener(null).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("do_us_fi_re", Boolean.FALSE.toString()).build();
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.b("CommonImageLoaderRefactor", "createDownloadRequest error", e4);
            return null;
        }
    }
}
