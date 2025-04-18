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
public final class q4 extends z1 {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f7075e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f7076f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f7077g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f7078h;

    /* renamed from: i, reason: collision with root package name */
    private long f7079i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7080j;

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Bundle bundle) {
            ApplicationMediaCapabilities.Builder addSupportedVideoMimeType;
            ApplicationMediaCapabilities.Builder addSupportedHdrType;
            ApplicationMediaCapabilities.Builder addSupportedHdrType2;
            ApplicationMediaCapabilities.Builder addSupportedHdrType3;
            ApplicationMediaCapabilities.Builder addSupportedHdrType4;
            ApplicationMediaCapabilities build;
            androidx.core.app.c.n();
            addSupportedVideoMimeType = androidx.core.app.c.g().addSupportedVideoMimeType(MimeTypes.VIDEO_H265);
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
        public b(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public q4(Context context) {
        super(false);
        this.f7075e = context.getContentResolver();
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = j5Var.a;
            this.f7076f = uri;
            b(j5Var);
            if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(j5Var.a.getScheme())) {
                Bundle bundle = new Bundle();
                if (yp.a >= 31) {
                    a.a(bundle);
                }
                openAssetFileDescriptor = this.f7075e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f7075e.openAssetFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
            }
            this.f7077g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f7078h = fileInputStream;
                if (length != -1 && j5Var.f5443g > length) {
                    throw new b(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(j5Var.f5443g + startOffset) - startOffset;
                if (skip == j5Var.f5443g) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f7079i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f7079i = position;
                            if (position < 0) {
                                throw new b(null, 2008);
                            }
                        }
                    } else {
                        long j3 = length - skip;
                        this.f7079i = j3;
                        if (j3 < 0) {
                            throw new b(null, 2008);
                        }
                    }
                    long j10 = j5Var.f5444h;
                    if (j10 != -1) {
                        long j11 = this.f7079i;
                        if (j11 != -1) {
                            j10 = Math.min(j11, j10);
                        }
                        this.f7079i = j10;
                    }
                    this.f7080j = true;
                    c(j5Var);
                    long j12 = j5Var.f5444h;
                    return j12 != -1 ? j12 : this.f7079i;
                }
                throw new b(null, 2008);
            }
            throw new b(new IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (b e2) {
            throw e2;
        } catch (IOException e10) {
            throw new b(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f7076f;
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f7076f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f7078h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f7078h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f7077g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new b(e2, 2000);
                    }
                } finally {
                    this.f7077g = null;
                    if (this.f7080j) {
                        this.f7080j = false;
                        g();
                    }
                }
            } catch (Throwable th2) {
                this.f7078h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f7077g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f7077g = null;
                        if (this.f7080j) {
                            this.f7080j = false;
                            g();
                        }
                        throw th2;
                    } finally {
                        this.f7077g = null;
                        if (this.f7080j) {
                            this.f7080j = false;
                            g();
                        }
                    }
                } catch (IOException e10) {
                    throw new b(e10, 2000);
                }
            }
        } catch (IOException e11) {
            throw new b(e11, 2000);
        }
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.f7079i;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e2) {
                throw new b(e2, 2000);
            }
        }
        int read = ((FileInputStream) yp.a((Object) this.f7078h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j10 = this.f7079i;
        if (j10 != -1) {
            this.f7079i = j10 - read;
        }
        d(read);
        return read;
    }
}
