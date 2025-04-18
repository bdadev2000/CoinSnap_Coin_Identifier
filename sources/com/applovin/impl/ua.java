package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ua extends dk {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f27306c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f27307a = Charsets.UTF_8.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f27308b = Charsets.ISO_8859_1.newDecoder();

    @Override // com.applovin.impl.dk
    public bf a(ef efVar, ByteBuffer byteBuffer) {
        String a2 = a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (a2 == null) {
            return new bf(new wa(bArr, null, null));
        }
        Matcher matcher = f27306c.matcher(a2);
        String str2 = null;
        for (int i2 = 0; matcher.find(i2); i2 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String lowerCase = Ascii.toLowerCase(group);
                lowerCase.getClass();
                if (lowerCase.equals("streamurl")) {
                    str2 = group2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new bf(new wa(bArr, str, str2));
    }

    private String a(ByteBuffer byteBuffer) {
        try {
            return this.f27307a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f27308b.decode(byteBuffer).toString();
                this.f27308b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f27308b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.f27308b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f27307a.reset();
            byteBuffer.rewind();
        }
    }
}
