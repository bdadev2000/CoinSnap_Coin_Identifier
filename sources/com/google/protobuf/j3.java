package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class j3 {
    private final Iterator<Map.Entry<l3, Object>> iter;
    private final boolean messageSetWireFormat;
    private Map.Entry<l3, Object> next;
    final /* synthetic */ GeneratedMessageLite$ExtendableMessage this$0;

    public /* synthetic */ j3(GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage, boolean z10, g3 g3Var) {
        this(generatedMessageLite$ExtendableMessage, z10);
    }

    public void writeUntil(int i10, d1 d1Var) throws IOException {
        while (true) {
            Map.Entry<l3, Object> entry = this.next;
            if (entry != null && entry.getKey().getNumber() < i10) {
                l3 key = this.next.getKey();
                if (this.messageSetWireFormat && key.getLiteJavaType() == u9.MESSAGE && !key.isRepeated()) {
                    d1Var.writeMessageSetExtension(key.getNumber(), (o5) this.next.getValue());
                } else {
                    x2.writeField(key, this.next.getValue(), d1Var);
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

    private j3(GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage, boolean z10) {
        this.this$0 = generatedMessageLite$ExtendableMessage;
        Iterator it = generatedMessageLite$ExtendableMessage.extensions.iterator();
        this.iter = it;
        if (it.hasNext()) {
            this.next = (Map.Entry) it.next();
        }
        this.messageSetWireFormat = z10;
    }
}
