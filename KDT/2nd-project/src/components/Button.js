import React from 'react'
import styled, { css } from 'styled-components'

  const colorStyles = css`
    ${({theme, color}) => {
      const selected = theme.palette[color];
      return css`
      background: ${selected};
      &:hover {
        box-shadow: 0 0 0 
      }
      `;
   }}
    `;

  const sizes = {
    large: {
      height: '3.5rem',
      fontSize: '1.25rem'
    },
    medium: {
      height: '2.25rem',
      fontSize: '1rem'
    },
    small : {
      height: '1.75rem',
      fontSize: '0.875rem'
    }
  };  
  
  const sizeStyles = css`
    ${({size}) => css`
      height: ${sizes[size].height};
      font-size: ${sizes[size].fontSize};
    `} 
  `;

  const fullWidthStyle = css`
    ${props => 
      props.fullWidth && 
      css`
        width: 100%;
        justify-content: center;       
      `
    }
  `

  // const sizeStyles = css`
  //  ${props => 
  //   props.size === 'large' &&
  //   css`
  //   height: 3rem;
  //   font-size: 1.25rem;
  //   `}
    
  //   ${props => 
  //   props.size === 'medium' &&
  //   css`
  //     height: 2.25rem;
  //     font-size: 1rem;
  //   `}

  //   ${props => 
  //   props.size === 'small' &&
  //   css`
  //     heigth: 1.75rem;
  //     font-size: 0.875rem;
  //   `}
  // `;

  const StyledButton = styled.button`
    // 공통 스타일
    display: inline-flex;
    justify-content: center;
    align-items: center;
    outline: none;
    border: none;
    border-radius: 4px;
    color: white;
    font-weight: bold;
    cursor: pointer;
    padding-left: 1rem;
    padding-right: 1rem;
    box-shadow: 2px 2px 10px #E6007E;

    // 크기
    ${sizeStyles}

    // 색상
    ${colorStyles}

    ${fullWidthStyle}

    transition: all 0.3s
    `;
    

  function Button({children, color, size, fullWidth, ...rest}) {
    return (
    <StyledButton 
    color={color}
    size={size} 
    fullWidth={fullWidth}
    {...rest}
    >
      {children}
    </StyledButton>
    )
}

Button.defaultProps = {
  color: '#E6007E',
  size: 'medeium'
};
export default Button