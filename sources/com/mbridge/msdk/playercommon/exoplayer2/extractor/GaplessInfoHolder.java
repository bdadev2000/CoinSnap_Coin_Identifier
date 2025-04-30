package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.CommentFrame;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class GaplessInfoHolder {
    private static final String GAPLESS_DESCRIPTION = "iTunSMPB";
    private static final String GAPLESS_DOMAIN = "com.apple.iTunes";
    public int encoderDelay = -1;
    public int encoderPadding = -1;
    public static final Id3Decoder.FramePredicate GAPLESS_INFO_ID3_FRAME_PREDICATE = new Id3Decoder.FramePredicate() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public boolean evaluate(int i9, int i10, int i11, int i12, int i13) {
            return i10 == 67 && i11 == 79 && i12 == 77 && (i13 == 77 || i9 == 2);
        }
    };
    private static final Pattern GAPLESS_COMMENT_PATTERN = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    private boolean setFromComment(String str) {
        Matcher matcher = GAPLESS_COMMENT_PATTERN.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.encoderDelay = parseInt;
                    this.encoderPadding = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean hasGaplessInfo() {
        if (this.encoderDelay != -1 && this.encoderPadding != -1) {
            return true;
        }
        return false;
    }

    public final boolean setFromMetadata(Metadata metadata) {
        for (int i9 = 0; i9 < metadata.length(); i9++) {
            Metadata.Entry entry = metadata.get(i9);
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if (GAPLESS_DESCRIPTION.equals(commentFrame.description) && setFromComment(commentFrame.text)) {
                    return true;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if (GAPLESS_DOMAIN.equals(internalFrame.domain) && GAPLESS_DESCRIPTION.equals(internalFrame.description) && setFromComment(internalFrame.text)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean setFromXingHeaderValue(int i9) {
        int i10 = i9 >> 12;
        int i11 = i9 & 4095;
        if (i10 <= 0 && i11 <= 0) {
            return false;
        }
        this.encoderDelay = i10;
        this.encoderPadding = i11;
        return true;
    }
}
