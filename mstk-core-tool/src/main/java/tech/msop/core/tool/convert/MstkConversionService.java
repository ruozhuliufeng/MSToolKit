package tech.msop.core.tool.convert;

import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.lang.Nullable;
import org.springframework.util.StringValueResolver;

/**
 * 类型转换服务，添加了ResultEnum依赖
 */
public class MstkConversionService extends ApplicationConversionService {
    @Nullable
    private static volatile MstkConversionService SHARED_INSTANCE;

    public MstkConversionService(){
        this(null);
    }

    public MstkConversionService(@Nullable StringValueResolver embeddedValueResolber){
        super(embeddedValueResolber);
        super.addConverter(new EnumToStringConverter());
        super.addConverter(new StringToEnumConverter());
    }

    /**
     * Return a shared default application {@code ConversionService} instance, lazily
     * building it once needed.
     * <p>
     * Note: This method actually returns an {@link MstkConversionService}
     * instance. However, the {@code ConversionService} signature has been preserved for
     * binary compatibility.
     * @return the shared {@code MsConversionService} instance (never{@code null})
     */
    public static GenericConversionService getInstance(){
        MstkConversionService sharedInstance = MstkConversionService.SHARED_INSTANCE;
        if (sharedInstance == null){
            synchronized (MstkConversionService.class){
                sharedInstance = MstkConversionService.SHARED_INSTANCE;
                if (sharedInstance == null){
                    sharedInstance = new MstkConversionService();
                    MstkConversionService.SHARED_INSTANCE = sharedInstance;
                }
            }
        }
        return sharedInstance;
    }

}
