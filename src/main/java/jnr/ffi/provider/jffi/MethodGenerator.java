package jnr.ffi.provider.jffi;

import com.kenai.jffi.Function;
import jnr.ffi.CallingConvention;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;

/**
 *
 */
public interface MethodGenerator {

    public boolean isSupported(ResultType resultType, ParameterType[] parameterTypes, CallingConvention callingConvention);
    public void generate(AsmBuilder builder, String functionName, Function function,
                         ResultType resultType, ParameterType[] parameterTypes, boolean ignoreError);
}
