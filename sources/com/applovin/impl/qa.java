package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class qa extends ak {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f7136c = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder a = Charsets.UTF_8.newDecoder();

    /* renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f7137b = Charsets.ISO_8859_1.newDecoder();

    @Override // com.applovin.impl.ak
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        String a = a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (a == null) {
            return new we(new sa(bArr, null, null));
        }
        Matcher matcher = f7136c.matcher(a);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
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
        return new we(new sa(bArr, str, str2));
    }

    private String a(ByteBuffer byteBuffer) {
        try {
            return this.a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f7137b.decode(byteBuffer).toString();
                this.f7137b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f7137b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f7137b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.a.reset();
            byteBuffer.rewind();
        }
    }
}
