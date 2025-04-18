package p8;

import c6.k;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.d;
import ra.f;

/* loaded from: classes3.dex */
public final class a extends p6.a {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f23482h = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: f, reason: collision with root package name */
    public final CharsetDecoder f23483f = f.f24049c.newDecoder();

    /* renamed from: g, reason: collision with root package name */
    public final CharsetDecoder f23484g = f.f24048b.newDecoder();

    @Override // p6.a
    public final l8.b g(d dVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f23484g;
        CharsetDecoder charsetDecoder2 = this.f23483f;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new l8.b(new c(bArr, null, null));
        }
        Matcher matcher = f23482h.matcher(str);
        String str3 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String C = k.C(group);
                C.getClass();
                if (!C.equals("streamurl")) {
                    if (C.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new l8.b(new c(bArr, str2, str3));
    }
}
