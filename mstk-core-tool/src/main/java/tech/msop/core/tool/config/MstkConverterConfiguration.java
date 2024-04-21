package tech.msop.core.tool.config;


import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import tech.msop.core.tool.convert.EnumToStringConverter;
import tech.msop.core.tool.convert.StringToEnumConverter;

/**
 * blade enum 《-》 String 转换配置
 *
 * @author ruozhuliufeng
 */
@AutoConfiguration
public class MstkConverterConfiguration implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new EnumToStringConverter());
        registry.addConverter(new StringToEnumConverter());
    }

}