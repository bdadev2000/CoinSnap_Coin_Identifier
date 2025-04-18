package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class v5 extends h3 implements w5 {
    public /* synthetic */ v5(u5 u5Var) {
        this();
    }

    public v5 addAllOptions(Iterable<? extends Option> iterable) {
        copyOnWrite();
        ((Method) this.instance).addAllOptions(iterable);
        return this;
    }

    public v5 addOptions(Option option) {
        copyOnWrite();
        ((Method) this.instance).addOptions(option);
        return this;
    }

    public v5 clearName() {
        copyOnWrite();
        ((Method) this.instance).clearName();
        return this;
    }

    public v5 clearOptions() {
        copyOnWrite();
        ((Method) this.instance).clearOptions();
        return this;
    }

    public v5 clearRequestStreaming() {
        copyOnWrite();
        ((Method) this.instance).clearRequestStreaming();
        return this;
    }

    public v5 clearRequestTypeUrl() {
        copyOnWrite();
        ((Method) this.instance).clearRequestTypeUrl();
        return this;
    }

    public v5 clearResponseStreaming() {
        copyOnWrite();
        ((Method) this.instance).clearResponseStreaming();
        return this;
    }

    public v5 clearResponseTypeUrl() {
        copyOnWrite();
        ((Method) this.instance).clearResponseTypeUrl();
        return this;
    }

    public v5 clearSyntax() {
        copyOnWrite();
        ((Method) this.instance).clearSyntax();
        return this;
    }

    @Override // com.google.protobuf.w5
    public String getName() {
        return ((Method) this.instance).getName();
    }

    @Override // com.google.protobuf.w5
    public h0 getNameBytes() {
        return ((Method) this.instance).getNameBytes();
    }

    @Override // com.google.protobuf.w5
    public Option getOptions(int i10) {
        return ((Method) this.instance).getOptions(i10);
    }

    @Override // com.google.protobuf.w5
    public int getOptionsCount() {
        return ((Method) this.instance).getOptionsCount();
    }

    @Override // com.google.protobuf.w5
    public List<Option> getOptionsList() {
        return Collections.unmodifiableList(((Method) this.instance).getOptionsList());
    }

    @Override // com.google.protobuf.w5
    public boolean getRequestStreaming() {
        return ((Method) this.instance).getRequestStreaming();
    }

    @Override // com.google.protobuf.w5
    public String getRequestTypeUrl() {
        return ((Method) this.instance).getRequestTypeUrl();
    }

    @Override // com.google.protobuf.w5
    public h0 getRequestTypeUrlBytes() {
        return ((Method) this.instance).getRequestTypeUrlBytes();
    }

    @Override // com.google.protobuf.w5
    public boolean getResponseStreaming() {
        return ((Method) this.instance).getResponseStreaming();
    }

    @Override // com.google.protobuf.w5
    public String getResponseTypeUrl() {
        return ((Method) this.instance).getResponseTypeUrl();
    }

    @Override // com.google.protobuf.w5
    public h0 getResponseTypeUrlBytes() {
        return ((Method) this.instance).getResponseTypeUrlBytes();
    }

    @Override // com.google.protobuf.w5
    public a8 getSyntax() {
        return ((Method) this.instance).getSyntax();
    }

    @Override // com.google.protobuf.w5
    public int getSyntaxValue() {
        return ((Method) this.instance).getSyntaxValue();
    }

    public v5 removeOptions(int i10) {
        copyOnWrite();
        ((Method) this.instance).removeOptions(i10);
        return this;
    }

    public v5 setName(String str) {
        copyOnWrite();
        ((Method) this.instance).setName(str);
        return this;
    }

    public v5 setNameBytes(h0 h0Var) {
        copyOnWrite();
        ((Method) this.instance).setNameBytes(h0Var);
        return this;
    }

    public v5 setOptions(int i10, Option option) {
        copyOnWrite();
        ((Method) this.instance).setOptions(i10, option);
        return this;
    }

    public v5 setRequestStreaming(boolean z10) {
        copyOnWrite();
        ((Method) this.instance).setRequestStreaming(z10);
        return this;
    }

    public v5 setRequestTypeUrl(String str) {
        copyOnWrite();
        ((Method) this.instance).setRequestTypeUrl(str);
        return this;
    }

    public v5 setRequestTypeUrlBytes(h0 h0Var) {
        copyOnWrite();
        ((Method) this.instance).setRequestTypeUrlBytes(h0Var);
        return this;
    }

    public v5 setResponseStreaming(boolean z10) {
        copyOnWrite();
        ((Method) this.instance).setResponseStreaming(z10);
        return this;
    }

    public v5 setResponseTypeUrl(String str) {
        copyOnWrite();
        ((Method) this.instance).setResponseTypeUrl(str);
        return this;
    }

    public v5 setResponseTypeUrlBytes(h0 h0Var) {
        copyOnWrite();
        ((Method) this.instance).setResponseTypeUrlBytes(h0Var);
        return this;
    }

    public v5 setSyntax(a8 a8Var) {
        copyOnWrite();
        ((Method) this.instance).setSyntax(a8Var);
        return this;
    }

    public v5 setSyntaxValue(int i10) {
        copyOnWrite();
        ((Method) this.instance).setSyntaxValue(i10);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private v5() {
        /*
            r1 = this;
            com.google.protobuf.Method r0 = com.google.protobuf.Method.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v5.<init>():void");
    }

    public v5 addOptions(int i10, Option option) {
        copyOnWrite();
        ((Method) this.instance).addOptions(i10, option);
        return this;
    }

    public v5 setOptions(int i10, k6 k6Var) {
        copyOnWrite();
        ((Method) this.instance).setOptions(i10, (Option) k6Var.build());
        return this;
    }

    public v5 addOptions(k6 k6Var) {
        copyOnWrite();
        ((Method) this.instance).addOptions((Option) k6Var.build());
        return this;
    }

    public v5 addOptions(int i10, k6 k6Var) {
        copyOnWrite();
        ((Method) this.instance).addOptions(i10, (Option) k6Var.build());
        return this;
    }
}
