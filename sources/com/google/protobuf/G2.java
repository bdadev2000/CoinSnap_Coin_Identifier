package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class G2 {
    private final Iterator<Map.Entry<I2, Object>> iter;
    private final boolean messageSetWireFormat;
    private Map.Entry<I2, Object> next;
    final /* synthetic */ GeneratedMessageLite$ExtendableMessage this$0;

    public /* synthetic */ G2(GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage, boolean z8, C2 c22) {
        this(generatedMessageLite$ExtendableMessage, z8);
    }

    public void writeUntil(int i9, AbstractC1895e0 abstractC1895e0) throws IOException {
        while (true) {
            Map.Entry<I2, Object> entry = this.next;
            if (entry != null && entry.getKey().getNumber() < i9) {
                I2 key = this.next.getKey();
                if (this.messageSetWireFormat && key.getLiteJavaType() == T5.MESSAGE && !key.isRepeated()) {
                    abstractC1895e0.writeMessageSetExtension(key.getNumber(), (N3) this.next.getValue());
                } else {
                    C2001t2.writeField(key, this.next.getValue(), abstractC1895e0);
                }
                if (this.iter.hasNext()) {
                    this.next = this.iter.next();
                } else {
                    this.next = null;
                }
            } else {
                return;
            }
        }
    }

    private G2(GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage, boolean z8) {
        this.this$0 = generatedMessageLite$ExtendableMessage;
        Iterator it = generatedMessageLite$ExtendableMessage.extensions.iterator();
        this.iter = it;
        if (it.hasNext()) {
            this.next = (Map.Entry) it.next();
        }
        this.messageSetWireFormat = z8;
    }
}
