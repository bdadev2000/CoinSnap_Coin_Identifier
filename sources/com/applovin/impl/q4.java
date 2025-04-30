package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class q4 extends AbstractC0783z1 {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f10133e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f10134f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f10135g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f10136h;

    /* renamed from: i, reason: collision with root package name */
    private long f10137i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10138j;

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Bundle bundle) {
            ApplicationMediaCapabilities.Builder addSupportedVideoMimeType;
            ApplicationMediaCapabilities.Builder addSupportedHdrType;
            ApplicationMediaCapabilities.Builder addSupportedHdrType2;
            ApplicationMediaCapabilities.Builder addSupportedHdrType3;
            ApplicationMediaCapabilities.Builder addSupportedHdrType4;
            ApplicationMediaCapabilities build;
            addSupportedVideoMimeType = B3.a.h().addSupportedVideoMimeType(MimeTypes.VIDEO_H265);
            addSupportedHdrType = addSupportedVideoMimeType.addSupportedHdrType("android.media.feature.hdr.dolby_vision");
            addSupportedHdrType2 = addSupportedHdrType.addSupportedHdrType("android.media.feature.hdr.hdr10");
            addSupportedHdrType3 = addSupportedHdrType2.addSupportedHdrType("android.media.feature.hdr.hdr10_plus");
            addSupportedHdrType4 = addSupportedHdrType3.addSupportedHdrType("android.media.feature.hdr.hlg");
            build = addSupportedHdrType4.build();
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", build);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends h5 {
        public b(IOException iOException, int i9) {
            super(iOException, i9);
        }
    }

    public q4(Context context) {
        super(false);
        this.f10133e = context.getContentResolver();
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = j5Var.f8395a;
            this.f10134f = uri;
            b(j5Var);
            if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(j5Var.f8395a.getScheme())) {
                Bundle bundle = new Bundle();
                if (yp.f12451a >= 31) {
                    a.a(bundle);
                }
                openAssetFileDescriptor = this.f10133e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f10133e.openAssetFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
            }
            this.f10135g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new b(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.f10136h = fileInputStream;
            if (length != -1 && j5Var.f8400g > length) {
                throw new b(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(j5Var.f8400g + startOffset) - startOffset;
            if (skip == j5Var.f8400g) {
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f10137i = -1L;
                    } else {
                        long position = size - channel.position();
                        this.f10137i = position;
                        if (position < 0) {
                            throw new b(null, 2008);
                        }
                    }
                } else {
                    long j7 = length - skip;
                    this.f10137i = j7;
                    if (j7 < 0) {
                        throw new b(null, 2008);
                    }
                }
                long j9 = j5Var.f8401h;
                if (j9 != -1) {
                    long j10 = this.f10137i;
                    if (j10 != -1) {
                        j9 = Math.min(j10, j9);
                    }
                    this.f10137i = j9;
                }
                this.f10138j = true;
                c(j5Var);
                long j11 = j5Var.f8401h;
                return j11 != -1 ? j11 : this.f10137i;
            }
            throw new b(null, 2008);
        } catch (b e4) {
            throw e4;
        } catch (IOException e9) {
            throw new b(e9, e9 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f10134f;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f10134f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f10136h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f10136h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f10135g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        throw new b(e4, 2000);
                    }
                } finally {
                    this.f10135g = null;
                    if (this.f10138j) {
                        this.f10138j = false;
                        g();
                    }
                }
            } catch (Throwable th) {
                this.f10136h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f10135g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f10135g = null;
                        if (this.f10138j) {
                            this.f10138j = false;
                            g();
                        }
                        throw th;
                    } finally {
                        this.f10135g = null;
                        if (this.f10138j) {
                            this.f10138j = false;
                            g();
                        }
                    }
                } catch (IOException e9) {
                    throw new b(e9, 2000);
                }
            }
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        long j7 = this.f10137i;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i10 = (int) Math.min(j7, i10);
            } catch (IOException e4) {
                throw new b(e4, 2000);
            }
        }
        int read = ((FileInputStream) yp.a((Object) this.f10136h)).read(bArr, i9, i10);
        if (read == -1) {
            return -1;
        }
        long j9 = this.f10137i;
        if (j9 != -1) {
            this.f10137i = j9 - read;
        }
        d(read);
        return read;
    }
}
