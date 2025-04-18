package m9;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class h extends f {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f21661e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f21662f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f21663g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f21664h;

    /* renamed from: i, reason: collision with root package name */
    public long f21665i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21666j;

    public h(Context context) {
        super(false);
        this.f21661e = context.getContentResolver();
    }

    @Override // m9.l
    public final long a(p pVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i10 = 2000;
        try {
            Uri normalizeScheme = pVar.a.normalizeScheme();
            this.f21662f = normalizeScheme;
            f();
            boolean equals = AppLovinEventTypes.USER_VIEWED_CONTENT.equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.f21661e;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, CampaignEx.JSON_KEY_AD_R);
            }
            this.f21663g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f21664h = fileInputStream;
                long j3 = pVar.f21710f;
                if (length != -1 && j3 > length) {
                    throw new g(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j3) - startOffset;
                if (skip == j3) {
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f21665i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f21665i = position;
                            if (position < 0) {
                                throw new g(null, 2008);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f21665i = j10;
                        if (j10 < 0) {
                            throw new g(null, 2008);
                        }
                    }
                    long j11 = pVar.f21711g;
                    if (j11 != -1) {
                        long j12 = this.f21665i;
                        if (j12 == -1) {
                            min = j11;
                        } else {
                            min = Math.min(j12, j11);
                        }
                        this.f21665i = min;
                    }
                    this.f21666j = true;
                    g(pVar);
                    if (j11 == -1) {
                        return this.f21665i;
                    }
                    return j11;
                }
                throw new g(null, 2008);
            }
            throw new g(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
        } catch (g e2) {
            throw e2;
        } catch (IOException e10) {
            if (e10 instanceof FileNotFoundException) {
                i10 = 2005;
            }
            throw new g(e10, i10);
        }
    }

    @Override // m9.l
    public final void close() {
        this.f21662f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f21664h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f21664h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f21663g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new g(e2, 2000);
                    }
                } finally {
                    this.f21663g = null;
                    if (this.f21666j) {
                        this.f21666j = false;
                        e();
                    }
                }
            } catch (Throwable th2) {
                this.f21664h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f21663g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f21663g = null;
                        if (this.f21666j) {
                            this.f21666j = false;
                            e();
                        }
                        throw th2;
                    } finally {
                        this.f21663g = null;
                        if (this.f21666j) {
                            this.f21666j = false;
                            e();
                        }
                    }
                } catch (IOException e10) {
                    throw new g(e10, 2000);
                }
            }
        } catch (IOException e11) {
            throw new g(e11, 2000);
        }
    }

    @Override // m9.l
    public final Uri getUri() {
        return this.f21662f;
    }

    @Override // m9.i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.f21665i;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e2) {
                throw new g(e2, 2000);
            }
        }
        FileInputStream fileInputStream = this.f21664h;
        int i12 = n9.h0.a;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j10 = this.f21665i;
        if (j10 != -1) {
            this.f21665i = j10 - read;
        }
        d(read);
        return read;
    }
}
