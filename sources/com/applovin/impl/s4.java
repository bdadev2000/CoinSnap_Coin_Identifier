package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public final class s4 extends a2 {
    private final ContentResolver e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f26411f;

    /* renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f26412g;

    /* renamed from: h, reason: collision with root package name */
    private FileInputStream f26413h;

    /* renamed from: i, reason: collision with root package name */
    private long f26414i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26415j;

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Bundle bundle) {
            ApplicationMediaCapabilities.Builder addSupportedVideoMimeType;
            ApplicationMediaCapabilities.Builder addSupportedHdrType;
            ApplicationMediaCapabilities.Builder addSupportedHdrType2;
            ApplicationMediaCapabilities.Builder addSupportedHdrType3;
            ApplicationMediaCapabilities.Builder addSupportedHdrType4;
            ApplicationMediaCapabilities build;
            addSupportedVideoMimeType = androidx.core.view.a.g().addSupportedVideoMimeType("video/hevc");
            addSupportedHdrType = addSupportedVideoMimeType.addSupportedHdrType("android.media.feature.hdr.dolby_vision");
            addSupportedHdrType2 = addSupportedHdrType.addSupportedHdrType("android.media.feature.hdr.hdr10");
            addSupportedHdrType3 = addSupportedHdrType2.addSupportedHdrType("android.media.feature.hdr.hdr10_plus");
            addSupportedHdrType4 = addSupportedHdrType3.addSupportedHdrType("android.media.feature.hdr.hlg");
            build = addSupportedHdrType4.build();
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", build);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends j5 {
        public b(IOException iOException, int i2) {
            super(iOException, i2);
        }
    }

    public s4(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.applovin.impl.i5
    public long a(l5 l5Var) {
        AssetFileDescriptor openAssetFileDescriptor;
        int i2 = AdError.SERVER_ERROR_CODE;
        try {
            Uri uri = l5Var.f24983a;
            this.f26411f = uri;
            b(l5Var);
            if ("content".equals(l5Var.f24983a.getScheme())) {
                Bundle bundle = new Bundle();
                if (xp.f27962a >= 31) {
                    a.a(bundle);
                }
                openAssetFileDescriptor = this.e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.e.openAssetFileDescriptor(uri, "r");
            }
            this.f26412g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f26413h = fileInputStream;
                if (length != -1 && l5Var.f24987g > length) {
                    throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(l5Var.f24987g + startOffset) - startOffset;
                if (skip == l5Var.f24987g) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f26414i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f26414i = position;
                            if (position < 0) {
                                throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j2 = length - skip;
                        this.f26414i = j2;
                        if (j2 < 0) {
                            throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j3 = l5Var.f24988h;
                    if (j3 != -1) {
                        long j4 = this.f26414i;
                        if (j4 != -1) {
                            j3 = Math.min(j4, j3);
                        }
                        this.f26414i = j3;
                    }
                    this.f26415j = true;
                    c(l5Var);
                    long j5 = l5Var.f24988h;
                    return j5 != -1 ? j5 : this.f26414i;
                }
                throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            throw new b(new IOException("Could not open file descriptor for: " + uri), AdError.SERVER_ERROR_CODE);
        } catch (b e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i2 = 2005;
            }
            throw new b(e2, i2);
        }
    }

    @Override // com.applovin.impl.i5
    public Uri c() {
        return this.f26411f;
    }

    @Override // com.applovin.impl.i5
    public void close() {
        this.f26411f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f26413h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f26413h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f26412g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new b(e, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f26412g = null;
                    if (this.f26415j) {
                        this.f26415j = false;
                        g();
                    }
                }
            } catch (Throwable th) {
                this.f26413h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f26412g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f26412g = null;
                        if (this.f26415j) {
                            this.f26415j = false;
                            g();
                        }
                        throw th;
                    } finally {
                        this.f26412g = null;
                        if (this.f26415j) {
                            this.f26415j = false;
                            g();
                        }
                    }
                } catch (IOException e2) {
                    throw new b(e2, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (IOException e3) {
            throw new b(e3, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.applovin.impl.g5
    public int a(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.f26414i;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e) {
                throw new b(e, AdError.SERVER_ERROR_CODE);
            }
        }
        int read = ((FileInputStream) xp.a((Object) this.f26413h)).read(bArr, i2, i3);
        if (read == -1) {
            return -1;
        }
        long j3 = this.f26414i;
        if (j3 != -1) {
            this.f26414i = j3 - read;
        }
        d(read);
        return read;
    }
}
