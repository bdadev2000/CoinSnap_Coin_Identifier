package p4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import e4.m;
import e4.o;
import g4.g0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* loaded from: classes.dex */
public final class j implements o {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final o f23455b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.h f23456c;

    public j(ArrayList arrayList, a aVar, h4.h hVar) {
        this.a = arrayList;
        this.f23455b = aVar;
        this.f23456c = hVar;
    }

    @Override // e4.o
    public final boolean a(Object obj, m mVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) mVar.c(i.f23454b)).booleanValue()) {
            if (com.facebook.appevents.o.n(this.f23456c, inputStream, this.a) == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // e4.o
    public final g0 b(Object obj, int i10, int i11, m mVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(JsonLexerKt.BATCH_SIZE);
        try {
            byte[] bArr2 = new byte[JsonLexerKt.BATCH_SIZE];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f23455b.b(ByteBuffer.wrap(bArr), i10, i11, mVar);
    }
}
