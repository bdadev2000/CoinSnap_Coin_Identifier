package com.mbridge.msdk.playercommon.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.text.webvtt.WebvttCue;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class WebvttDecoder extends SimpleSubtitleDecoder {
    private static final String COMMENT_START = "NOTE";
    private static final int EVENT_COMMENT = 1;
    private static final int EVENT_CUE = 3;
    private static final int EVENT_END_OF_FILE = 0;
    private static final int EVENT_NONE = -1;
    private static final int EVENT_STYLE_BLOCK = 2;
    private static final String STYLE_START = "STYLE";
    private final CssParser cssParser;
    private final WebvttCueParser cueParser;
    private final List<WebvttCssStyle> definedStyles;
    private final ParsableByteArray parsableWebvttData;
    private final WebvttCue.Builder webvttCueBuilder;

    public WebvttDecoder() {
        super("WebvttDecoder");
        this.cueParser = new WebvttCueParser();
        this.parsableWebvttData = new ParsableByteArray();
        this.webvttCueBuilder = new WebvttCue.Builder();
        this.cssParser = new CssParser();
        this.definedStyles = new ArrayList();
    }

    private static int getNextEvent(ParsableByteArray parsableByteArray) {
        int i9 = -1;
        int i10 = 0;
        while (i9 == -1) {
            i10 = parsableByteArray.getPosition();
            String readLine = parsableByteArray.readLine();
            if (readLine == null) {
                i9 = 0;
            } else if (STYLE_START.equals(readLine)) {
                i9 = 2;
            } else if (COMMENT_START.startsWith(readLine)) {
                i9 = 1;
            } else {
                i9 = 3;
            }
        }
        parsableByteArray.setPosition(i10);
        return i9;
    }

    private static void skipComment(ParsableByteArray parsableByteArray) {
        do {
        } while (!TextUtils.isEmpty(parsableByteArray.readLine()));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder
    public final WebvttSubtitle decode(byte[] bArr, int i9, boolean z8) throws SubtitleDecoderException {
        this.parsableWebvttData.reset(bArr, i9);
        this.webvttCueBuilder.reset();
        this.definedStyles.clear();
        WebvttParserUtil.validateWebvttHeaderLine(this.parsableWebvttData);
        do {
        } while (!TextUtils.isEmpty(this.parsableWebvttData.readLine()));
        ArrayList arrayList = new ArrayList();
        while (true) {
            int nextEvent = getNextEvent(this.parsableWebvttData);
            if (nextEvent == 0) {
                return new WebvttSubtitle(arrayList);
            }
            if (nextEvent == 1) {
                skipComment(this.parsableWebvttData);
            } else if (nextEvent == 2) {
                if (arrayList.isEmpty()) {
                    this.parsableWebvttData.readLine();
                    WebvttCssStyle parseBlock = this.cssParser.parseBlock(this.parsableWebvttData);
                    if (parseBlock != null) {
                        this.definedStyles.add(parseBlock);
                    }
                } else {
                    throw new SubtitleDecoderException("A style block was found after the first cue.");
                }
            } else if (nextEvent == 3 && this.cueParser.parseCue(this.parsableWebvttData, this.webvttCueBuilder, this.definedStyles)) {
                arrayList.add(this.webvttCueBuilder.build());
                this.webvttCueBuilder.reset();
            }
        }
    }
}
