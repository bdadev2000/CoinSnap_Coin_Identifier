package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.Encoder;
import com.google.zxing.qrcode.encoder.QRCode;
import java.util.Map;

/* loaded from: classes4.dex */
public final class QRCodeWriter implements Writer {
    private static final int QUIET_ZONE_SIZE = 4;

    private static BitMatrix renderResult(QRCode qRCode, int i2, int i3, int i4) {
        ByteMatrix matrix = qRCode.getMatrix();
        if (matrix == null) {
            throw new IllegalStateException();
        }
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int i5 = i4 << 1;
        int i6 = width + i5;
        int i7 = i5 + height;
        int max = Math.max(i2, i6);
        int max2 = Math.max(i3, i7);
        int min = Math.min(max / i6, max2 / i7);
        int i8 = (max - (width * min)) / 2;
        int i9 = (max2 - (height * min)) / 2;
        BitMatrix bitMatrix = new BitMatrix(max, max2);
        int i10 = 0;
        while (i10 < height) {
            int i11 = 0;
            int i12 = i8;
            while (i11 < width) {
                if (matrix.get(i11, i10) == 1) {
                    bitMatrix.setRegion(i12, i9, min, min);
                }
                i11++;
                i12 += min;
            }
            i10++;
            i9 += min;
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3) throws WriterException {
        return encode(str, barcodeFormat, i2, i3, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map<EncodeHintType, ?> map) throws WriterException {
        if (!str.isEmpty()) {
            if (barcodeFormat != BarcodeFormat.QR_CODE) {
                throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
            }
            if (i2 >= 0 && i3 >= 0) {
                ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
                int i4 = 4;
                if (map != null) {
                    EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
                    if (map.containsKey(encodeHintType)) {
                        errorCorrectionLevel = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
                    }
                    EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
                    if (map.containsKey(encodeHintType2)) {
                        i4 = Integer.parseInt(map.get(encodeHintType2).toString());
                    }
                }
                return renderResult(Encoder.encode(str, errorCorrectionLevel, map), i2, i3, i4);
            }
            throw new IllegalArgumentException("Requested dimensions are too small: " + i2 + 'x' + i3);
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
